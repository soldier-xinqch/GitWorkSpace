package com.xinqch.util.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.formula.functions.T;

/**
 *  关于poi.jar对execl的简单解析
 * @author xinqch
 *
 */
public class ExcelUtil {
	
	 private final static int defaultWidth=15;
	 
	 /**
	  * excel文件导入
	  * @param execlFile 文件路径
	  * @param sheetIndex 工作表序号
	  * @return
	  */
	 public List<Object> importExcel(String execlFile,int sheetIndex){
		 List<Object> importResult = new ArrayList<Object>();
		 HSSFWorkbook workbook =null;
		 try {
			workbook = new HSSFWorkbook(new FileInputStream(execlFile));
			HSSFSheet sheet = workbook.getSheetAt(sheetIndex);
			// 获取数据总行数，编号是从0开始的
	        int rowcount = sheet.getLastRowNum()+1;
	        if (rowcount < 1) return null;
	        // 逐行读取数据
	        for (int i = 0; i < rowcount; i++) {
	            // 获取行对象
	            HSSFRow row = sheet.getRow(i);
	            if (row != null) {
	                List<Object> rowData = new ArrayList<Object>();
	                // 获取本行中单元格个数
	                int column = row.getLastCellNum();
	                // 获取本行中各单元格的数据
	                for (int cindex = 0; cindex < column; cindex++) {
	                    HSSFCell cell = row.getCell(cindex);
	                    // 获得指定单元格中的数据
	                    Object cellstr = getCellString(cell);
	                    rowData.add(cellstr);
	                }
	                importResult.add(rowData);
	            }
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return importResult;
	 }
    
    /** 获取单元格中的内容 ,该方法用于解析各种形式的数据*/
    private Object getCellString(HSSFCell cell) {
        Object result = null;
        if (cell != null) {
            int cellType = cell.getCellType();
            switch (cellType) {
            case HSSFCell.CELL_TYPE_STRING:
                result = cell.getRichStringCellValue().getString();
                break;
            case HSSFCell.CELL_TYPE_NUMERIC:
                result = cell.getNumericCellValue();
                break;
            case HSSFCell.CELL_TYPE_FORMULA:
                result = cell.getNumericCellValue();
                break;
            case HSSFCell.CELL_TYPE_ERROR:
                result = null;
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN:
                result = cell.getBooleanCellValue();
                break;
            case HSSFCell.CELL_TYPE_BLANK:
                result = null;
                break;
            default:
                break;
            }
        }
        return result;
    }
  
    
    public static void exportExcel(String fileName,String sheetName,Collection<T> dataset,String[] columnHeadNames, String dateFormatStr,boolean styleFalg,boolean fontFalg){
    	//声明一个输出流 导出文件
    	OutputStream stream = null;
    	// 声明一个工作薄  
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 生成一个工作表 
        HSSFSheet sheet = workbook.createSheet(sheetName);  
        // 设置表格默认列宽度
        sheet.setDefaultColumnWidth(defaultWidth);
        //添加一个样式
        HSSFCellStyle style = null;
        if(styleFalg){
        	style = getCellStyle(workbook);
	    	HSSFFont font = null;
	        if(fontFalg){//添加一个字体的样式
	        	font = getCellFonts(workbook);
	        	style.setFont(font);
	        }
        }
        // 声明一个画图的顶级管理器  
        HSSFPatriarch patriarch = sheet.createDrawingPatriarch();  
        // 产生表格标题行  
        HSSFRow row = sheet.createRow(0);  
        for (int i = 0; i < columnHeadNames.length; i++){  
            HSSFCell cell = row.createCell(i);  
            if(null !=style)cell.setCellStyle(style);  
            HSSFRichTextString text = new HSSFRichTextString(columnHeadNames[i]);  
            cell.setCellValue(text);  
        }  
        // 遍历集合数据，产生数据行  
        Iterator<T> it = dataset.iterator();  
        int index = 0;  
        for(int i=0;i<dataset.size();i++){
        	row = sheet.createRow(index);  
        	try {
				T t = (T) it.next();  
				// 利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值  
				Field[] fields = t.getClass().getDeclaredFields();  
				for (int y = 0; y < fields.length; y++){  
					HSSFCell cell = row.createCell(y);  
					if(null !=style)cell.setCellStyle(style);  
					Field field = fields[y];  
					String fieldName = field.getName();  
					String getMethodName = "get"+ fieldName.substring(0, 1).toUpperCase()+ fieldName.substring(1);  
					Class<? extends T> tCls = t.getClass();  
					Method getMethod = tCls.getMethod(getMethodName, new Class[]{});  
					Object value = getMethod.invoke(t, new Object[]{});  
					// 判断值的类型后进行强制类型转换  
					if (value instanceof Boolean){  
				        cell.setCellValue((Boolean) value);  
				    } else if (value instanceof Date)  {  
				        Date date = (Date) value;  
						SimpleDateFormat sdf = new SimpleDateFormat(dateFormatStr);  
				        cell.setCellValue(sdf.format(date)); 
				    }else if (value instanceof byte[]) {  
				        // 有图片时，设置行高为60px;  
				        row.setHeightInPoints(60);  
				        // 设置图片所在列宽度为80px,注意这里单位的一个换算  
				        sheet.setColumnWidth(i, (short) (35.7 * 80));  
				        // sheet.autoSizeColumn(i);  
				        byte[] bsValue = (byte[]) value;  
				        HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0,  
				                1023, 255, (short) 6, index, (short) 6, index);  
				        anchor.setAnchorType(2);
				        patriarch.createPicture(anchor, workbook.addPicture(  
				                bsValue, HSSFWorkbook.PICTURE_TYPE_JPEG));  
				    }else if(value instanceof Double||value instanceof Integer||value instanceof Long){
				    	 cell.setCellValue((Double)value);
				    }else{  
				        // 其它数据类型都当作字符串简单处理  
				        cell.setCellValue(value.toString()); 
				    }  
				    // 如果不是图片数据，就利用正则表达式判断textValue是否全部由数字组成  
//				    if (textValue != null) {  
//				        Pattern p = Pattern.compile("^//d+(//.//d+)?$");  
//				        Matcher matcher = p.matcher(textValue);  
//				        if (matcher.matches())  {  
//				            // 是数字当作double处理  
//				            cell.setCellValue(Double.parseDouble(textValue));  
//				        }
//				    }  
				}
				stream = new FileOutputStream(fileName);
				workbook.write(stream);  
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
        }
      
    }
    /**
     * 生成一个样式
     * @param workbook
     * @return
     */
    public static HSSFCellStyle getCellStyle(HSSFWorkbook workbook){
    	 // 生成一个样式  
        HSSFCellStyle style = workbook.createCellStyle();  
        // 设置这些样式  
        style.setFillForegroundColor(HSSFColor.WHITE.index);  
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);  
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);  
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        return style;
    }
    /**
     *  生成一个字体样式
     * @param workbook
     * @return
     */
    public static HSSFFont getCellFonts(HSSFWorkbook workbook){
    	 // 生成一个字体  
        HSSFFont font = workbook.createFont();  
        font.setColor(HSSFColor.VIOLET.index);  
        font.setFontHeightInPoints((short) 14);  
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		return font;
    }
    /**
     *  插入图片
     * @param sheet 表格
     * @param annotationText 注释内容
     * @param annotationAuthor 注释作者
     * @return
     */
    public static HSSFComment setAnnotation(HSSFSheet sheet,String annotationText,String annotationAuthor){
    	 // 声明一个画图的顶级管理器  
        HSSFPatriarch patriarch = sheet.createDrawingPatriarch();  
    	// 定义注释的大小和位置,详见文档  
        HSSFComment comment = patriarch.createComment(new HSSFClientAnchor(0,  
                0, 0, 0, (short) 4, 2, (short) 6, 5));  
        // 设置注释内容  
        comment.setString(new HSSFRichTextString(annotationText));  
        // 设置注释作者，当鼠标移动到单元格上是可以在状态栏中看到该内容.  
        comment.setAuthor("leno");
		return comment;  
    }
    
}

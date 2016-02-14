package com.xinqch.util.file;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFUtil {

	public static void main(String[] args) {
		String pdfFilePath = "D:\\hello.pdf";
		CreatePdf(pdfFilePath);
	}
	
	public static void CreatePdf(String filePath){
		//创建pdf Document对象
		Document document = new Document();
		try {
			BaseFont bfChinese=null; 
			bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED); 
			Font FontChinese = new Font(bfChinese, 12,Font.NORMAL );
			Paragraph pragraph=new Paragraph("HELLO WORLD！\n 欢迎来到我的世界！", FontChinese); 
//			PdfPTable  s = null;
			FileOutputStream out = new FileOutputStream(filePath);
			//获取写入数据实例
			PdfWriter.getInstance(document, out);
			//打开document
			document.open();
			//添加内容
			document.add(pragraph);
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

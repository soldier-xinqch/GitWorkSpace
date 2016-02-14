package com.xinqch.dbMsg;

import java.io.Serializable;

/**
 *  封装数据表信息
 *  
 *  JDBC里面通过getColumns的接口，实现对字段的查询。跟getTables一样，"%"表示所有任意的（字段），而m_TableName就是数据表的名字。
 *  getColumns的返回也是将所有的字段放到一个类似的内存中的表，而COLUMN_NAME就是字段的名字，TYPE_NAME就是数据类型，
 *  比如"int","int unsigned"等等，COLUMN_SIZE返回整数，就是字段的长度，
 *  比如定义的int(8)的字段，返回就是8，最后NULLABLE，返回1就表示可以是Null,而0就表示Not Null。
 * @author xinqch
 *
 */
public class TableModel implements Serializable{
	
	private static final long serialVersionUID = 3722999048091998796L;
	/** 表名称 */
	private String tableName;
	/** 列名称 */
	private String tableColumnName;
	/** 列类型 */
	private String tableColumnType;
	/** 列大小 */
	private int tableColumnSize;
	/** 列描述  */
	private int tableDigits;
	/** 列为空  NULLABLE，返回1就表示可以是Null,而0就表示Not Null。 */
	private int nullable;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTableColumnName() {
		return tableColumnName;
	}
	public void setTableColumnName(String tableColumnName) {
		this.tableColumnName = tableColumnName;
	}
	public String getTableColumnType() {
		return tableColumnType;
	}
	public void setTableColumnType(String tableColumnType) {
		this.tableColumnType = tableColumnType;
	}
	public int getTableColumnSize() {
		return tableColumnSize;
	}
	public void setTableColumnSize(int tableColumnSize) {
		this.tableColumnSize = tableColumnSize;
	}
	public int getTableDigits() {
		return tableDigits;
	}
	public void setTableDigits(int tableDigits) {
		this.tableDigits = tableDigits;
	}
	public int getNullable() {
		return nullable;
	}
	public void setNullable(int nullable) {
		this.nullable = nullable;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String toString() {
		return "[tableName="+tableName+"--tableColumnName="+tableColumnName+"--tableColumnType="+tableColumnType+
				"--tableColumnSize="+tableColumnSize+"--tableDigits="+tableDigits+"--nullable="+nullable+"]";
	}
}

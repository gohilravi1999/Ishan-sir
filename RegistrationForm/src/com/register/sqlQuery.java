package com.register;

public class sqlQuery 
{
	private final static String questionMark = "\"?\"";
	protected final static String insertQuery = "INSERT INTO "+connectionInformation.tableName+"("+connectionInformation.column1+","+connectionInformation.column2+") VALUES"+" (?, ?);";
	protected final static String deleteQuery = "DELETE FROM "+connectionInformation.tableName+" WHERE "+connectionInformation.column1+" = "+questionMark+";";
	protected final static String updateQuery = "UPDATE "+connectionInformation.tableName+" SET "+connectionInformation.column2+" = "+questionMark+";";
}

package com.up.student;

/**
 * 模块说明： 常量
 * 
 */
public class AppConstants {
	// jdbc
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_management?useUnicode=true&amp;characterEncoding=UTF-8";
	public static final String JDBC_USERNAME = "root";
	public static final String JDBC_PASSWORD = "0930";
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	// student field
	public static final String STUDENT_NAME = "Name";
	public static final String STUDENT_SNO = "No.";
	public static final String STUDENT_SEX = "Gender";
	public static final String STUDENT_DEPARTMETN = "College";
	public static final String STUDENT_HOMETOWN = "Hometown";
	public static final String STUDENT_EMAIL = "Mail";
	public static final String STUDENT_TEL = "Tel";
	public static final String STUDENT_MARK = "Score";

	// login view
	public static final String LOGIN_TITLE = "Login Interface";
	public static final String LOGIN_USERNAME = "ID";
	public static final String LOGIN_PASSWORD = "Password";
	public static final String LOGIN = "Log in";
	public static final String RESET = "Reset";
	public static final String LOGIN_ERROR_TITLE = "FAILURE！";
	public static final String LOGIN_ERROR_MASSAGE = "FAILURE！（maybe for wrong ID or password）";

	// main view
	public static final String MAINVIEW_TITLE = "Student Information Management System";
	public static final String MAINVIEW_PAGENUM_JLABEL_DI = "Page ";
	public static final String MAINVIEW_PAGENUM_JLABEL_YE = "/99 ";
	public static final String MAINVIEW_FIND_JLABEL = "Query Result";
	public static final String MAINVIEW_FIRST = "Home";
	public static final String MAINVIEW_LAST = "Last Page";
	public static final String MAINVIEW_PRE = "Previous Page";
	public static final String MAINVIEW_NEXT = "Next Page";
	public static final String PARAM_FIND_CONDITION = "";
	public static final String PARAM_FIND = "Search";
	public static final String PARAM_ADD = "Add";
	public static final String PARAM_DELETE = "Delete";
	public static final String PARAM_UPDATE = "Update";

	// add view
	public static final String ADDVIEW_TITLE = "Add Student Information";
	public static final String ADDVIEW_ADDBUTTON = "Add";
	public static final String EXITBUTTON = "Exit";
	public static final String ADD_ERROR_TITLE = "FAILURE！";
	public static final String ADD_ERROR_EXIST_MASSAGE = "There has been information with the same name and Number!";

	// delete view
	public static final String DELETEVIEW_TITLE = "Delete Student Information";
	public static final String DELETEVIEW_DELETEBUTTON = "Delete";
	public static final String DELET_ERROR_TITLE = "FAILURE！";

	// update view
	public static final String UPDATEVIEW_TITLE = "Update Student Information";
	public static final String UPDATEVIEW_UPDATEBUTTON = "Update";
	public static final String UPDATE_ERROR_TITLE = "FAILURE!";
	
	// massage
	public static final String SUCCESS_TITLE = "Success Operation!";
	public static final String SUCCESS_MASSAGE = "Success Operation！";
	public static final String ERROR_NOT_EXIST_MASSAGE = "Cannot find the student";
	public static final String ERROR_NULL_MASSAGE = "Please don't leave any information empty";
}

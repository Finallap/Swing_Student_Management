package com.up.student;

/**
 * 模块说明： 常量
 * 
 */
public class AppConstants {
	// jdbc
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_management?useUnicode=true&amp;characterEncoding=UTF-8";
	public static final String JDBC_USERNAME = "root";
	public static final String JDBC_PASSWORD = "";
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	// student field
	public static final String STUDENT_NAME = "姓名";
	public static final String STUDENT_SNO = "学号";
	public static final String STUDENT_SEX = "性别";
	public static final String STUDENT_DEPARTMETN = "院系";
	public static final String STUDENT_HOMETOWN = "籍贯";
	public static final String STUDENT_EMAIL = "电子邮件";
	public static final String STUDENT_TEL = "联系方式";
	public static final String STUDENT_MARK = "学分";

	// login view
	public static final String LOGIN_TITLE = "登录界面";
	public static final String LOGIN_USERNAME = "用户名";
	public static final String LOGIN_PASSWORD = "密码";
	public static final String LOGIN = "登录";
	public static final String RESET = "重置";
	public static final String LOGIN_ERROR_TITLE = "登陆失败！";
	public static final String LOGIN_ERROR_MASSAGE = "登陆失败！（可能是用户名或密码错误）";

	// main view
	public static final String MAINVIEW_TITLE = "学生信息管理系统";
	public static final String MAINVIEW_PAGENUM_JLABEL_DI = "第 ";
	public static final String MAINVIEW_PAGENUM_JLABEL_YE = "/99 页";
	public static final String MAINVIEW_FIND_JLABEL = "查询结果";
	public static final String MAINVIEW_FIRST = "首页";
	public static final String MAINVIEW_LAST = "末页";
	public static final String MAINVIEW_PRE = "上一页";
	public static final String MAINVIEW_NEXT = "下一页";
	public static final String PARAM_FIND_CONDITION = "";
	public static final String PARAM_FIND = "查找";
	public static final String PARAM_ADD = "添加";
	public static final String PARAM_DELETE = "删除";
	public static final String PARAM_UPDATE = "更新";

	// add view
	public static final String ADDVIEW_TITLE = "添加学生信息";
	public static final String ADDVIEW_ADDBUTTON = "添加";
	public static final String EXITBUTTON = "退出";
	public static final String ADD_ERROR_TITLE = "添加失败！";
	public static final String ADD_ERROR_NULL_MASSAGE = "存在空字段，请全部输入后再操作！";
	public static final String ADD_ERROR_EXIST_MASSAGE = "已存在用户名、学号相同的信息，添加失败！";

	// delete view
	public static final String DELETEVIEW_TITLE = "删除学生信息";
	public static final String DELETEVIEW_DELETEBUTTON = "删除";
	public static final String DELET_ERROR_TITLE = "删除失败！";
	public static final String DELET_ERROR_NULL_MASSAGE = "存在空字段，请全部输入全部信息后再操作！";
	public static final String DELET_ERROR_EXIST_MASSAGE = "未找到该同学，操作失败！";

	// update view
	public static final String UPDATEVIEW_TITLE = "更新学生信息";
	public static final String UPDATEVIEW_UPDATEBUTTON = "更新";
	public static final String UPDATE_ERROR_TITLE = "删除失败！";
	public static final String UPDATE_ERROR_NULL_MASSAGE = "存在空字段，请全部输入全部信息后再操作！";
	public static final String UPDATE_ERROR_EXIST_MASSAGE = "未找到该同学，操作失败！";
	
	// massage
	public static final String SUCCESS_TITLE = "操作成功！";
	public static final String SUCCESS_MASSAGE = "操作成功！";

}

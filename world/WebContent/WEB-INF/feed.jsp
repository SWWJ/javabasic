<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

String uid = request.getParameter("id");
String unm = request.getParameter("nm");

String sql = "INSERT INTO USER(author, desc) VALUES";
sql += "('" + uid + "','" + unm + "')";

Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/testdb", "root", "0000");

Statement stmt = conn.createStatement();

int count = stmt.executeUpdate(sql);

if(count == 1) {
	out.print("등록 완료");
} else {
	out.print("오류 발생");
}
%>
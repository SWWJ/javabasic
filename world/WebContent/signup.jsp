<%@page import="dao.UserDAO"%>
<%@page import="util.ConnectionPool"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

String uid = request.getParameter("id");
String upw = request.getParameter("pw");
String unm = request.getParameter("nm");

/* String sql = "INSERT INTO USER(id, PASSWORD, NAME) VALUES";
sql += "('" + uid + "','" + upw + "','" +  unm + "')"; */

/* // 1 드라이버 로드
Class.forName("com.mysql.jdbc.Driver");
// 2 DB 로드
Connection conn = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/testdb", "root", "0000"); */
		/* Connection conn = ConnectionPool.get(); */
// 3 SQL 구문
/* Statement stmt = conn.createStatement(); */
// 4 결과 받기

UserDAO dao = new UserDAO();
int count = dao.insert(uid, upw, unm);

if(count == 1) {
	out.print("회원가입 완료");
} else {
	out.print("오류 발생");
	response.sendRedirect("signUp.html");
}

%>
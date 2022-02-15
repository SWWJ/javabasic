<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>대학 데이터베이스 univ 생성</title>
</head>
<body>
<%
	// 객체 참조 변수
	Connection conn = null;
	PreparedStatement pstmt = null;

	// 드라이버 로딩
	String driverClass = "org.mariadb.jdbc.Driver";
	
	try {
		Class.forName(driverClass);
		out.println("JDBC Driver loading 성공! <br>");
	} catch (ClassNotFoundException err) {
		out.print("JDBC Driver loading 실패.. <br>");
	}
	
	// 마리아 서버 연결
	
	String url = "jdbc:mariadb://localhost:3306/";
	String id = "root";
	String pw = "0000";
	
	try {
		conn = DriverManager.getConnection(url, id, pw);
		out.println("MariaDB 연결 성공! <br>");
		
		// SQL 질의어 처리
		// 대학 데이터베이스 univ 생성
		
		String sql = "CREATE DATABASE univ2";
		pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
		out.println("대학 데이터베이스 생성 성공! <br>");
		
	} catch (SQLException sqlerr) {
		out.println("대학 데이터베이스 생성 실패.. <br>");
		out.println(sqlerr.getMessage() + "<br>");
	} finally {
		if(pstmt != null) {
			try {
				pstmt.close();
				out.println("Statement_close <br>");
			} catch (Exception conerr) {}
		}
		if(conn != null) {
			try {
				conn.close();
				out.println("MariaDB 서버 연결 종료 <br>");
			} catch (Exception conerr) {}
		}
	}
%>
</body>
</html>
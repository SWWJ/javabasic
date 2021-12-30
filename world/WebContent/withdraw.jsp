<%@page import="dao.UserDAO"%>
<%@page import="util.ConnectionPool"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");

/* 	// 1 드라이버 로드
	Class.forName("com.mysql.jdbc.Driver");
	// 2 드라이버 통해 DB 연결
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/testdb", "root", "0000"); */
/* 			Connection conn = ConnectionPool.get();
	// 3 SQL 구문
	String sql = "DELETE FROM user WHERE id = ?"; // DB에 있는 것이 기준
	PreparedStatement stmt = conn.prepareStatement(sql);
	stmt.setString(1, uid); */    // 결과 받는 것 성공 : 1, 실패 : 0;
	
	// 4 결과 받기
	UserDAO dao = new UserDAO(); 
	int count = dao.delete(uid);
	if (count == 1) {
		out.print("회원 탈퇴가 완료되었습니다.");
	} else {
		out.print("오류 발생");
	}
	%>
</body>
</html>
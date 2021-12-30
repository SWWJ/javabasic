<%@page import="java.sql.*"%>

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
Class.forName("com.mysql.jdbc.Driver"); // 드라이버 로딩
Connection conn = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/testdb", "root", "0000");

// ====================================== //

Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM user");

String str = "";

while(rs.next()) { // 다음 게 있으면 계속 처리
	str += rs.getString("no") + ", " + rs.getString("id") + ", " +
", " + rs.getString("password") + ", " + rs.getString("name") + ", " + rs.getString("ts") + "<br><hr>";
}

out.print(str);


/* 1. JDBC 드라이버 로딩
2. DB 접속을 위한 Connection 객체 생성
3. SQL 명령문을 전달하기 위한 Statement 객체 생성
4. Statement 객체를 이용하여 Query 실행
5. DB로부터 전송된 Query 실행 결과 처리
6. 사용된 객체 닫기 */

%>
</body>
</html>
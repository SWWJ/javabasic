<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "_header.jsp" %>
<%
String uid = (String) session.getAttribute("id");

if (uid == null) {
	out.print("로그인 정보가 없습니다.");
	response.sendRedirect("login.html");
} 
%>

Hello 홍길동

</body>
</html>
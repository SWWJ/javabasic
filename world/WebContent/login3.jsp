<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import = "java.util.Date" %>
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
		String upw = request.getParameter("pw");
	%>
	
	<h3>User ID : <%= uid %></h3>
	<h5>User PW : <%= upw %></h5>
	<h6>현재 시간은 <%= (new Date()).toString() %>입니다. </h6>
</body>
</html>
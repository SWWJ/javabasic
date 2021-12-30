<%@page import="dao.UserDAO"%>
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
		String uid = request.getParameter("id");
	String ups = request.getParameter("pw");

	UserDAO dao = new UserDAO();
	int result = dao.login(uid, ups);
	if (result == 1) {
		out.print("아이디가 존재하지 않습니다.");
	} else if (result == 2) {
		out.print("비밀번호가 일치하지 않습니다.");
	} else {
		session.setAttribute("id", "uid");
		response.sendRedirect("main.jsp");
	}

	/* 
	String dbpw = "0000";

	if(upw.equals(dbpw)) {
		session.setAttribute("id", uid);
		out.print("로그인 성공");
		response.sendRedirect("main.jsp");
	} else {
		out.print("비밀번호가 틀렸습니다.");
		response.sendRedirect("login.html");
	} */
	%>
</body>
</html>
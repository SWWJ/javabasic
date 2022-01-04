<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

String uid = request.getParameter("id");
String ups = request.getParameter("ps");

MemberDAO dao = new MemberDAO();

int result = dao.login(uid, ups);

if (result == 1) {
	response.sendRedirect("/member/join.jsp");
} else if (result == 2) {
	response.sendRedirect("/member/login.jsp");
} else {
	session.setAttribute("id", uid);
	response.sendRedirect("/main.jsp");
}
%>
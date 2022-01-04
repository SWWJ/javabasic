<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");

String uid = request.getParameter("id");
String ups = request.getParameter("pw");
String una = request.getParameter("name");
String uem = request.getParameter("email");

MemberDAO dao = new MemberDAO();

if(dao.exist(uid)) {
	response.sendRedirect("/member/join.jsp");
}

if(dao.join(uid, ups, una, uem)) {
	session.setAttribute("id", uid);
	response.sendRedirect("/main.jsp");
} 

%>
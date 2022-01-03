<%@page import="dao.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <% response.sendRedirect("/main.jsp"); %>
    
<%

String ume = request.getParameter("memo");
String sid = (String) session.getAttribute("id");

MemoDAO dao = new MemoDAO();

if(dao.delete(sid, ume))
	response.sendRedirect("/main.jsp");

%>
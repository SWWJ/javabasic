<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    request.setCharacterEncoding("utf-8");
    
    String uid = request.getParameter("id");
    String ups = request.getParameter("ps");
    
    MemberDAO dao = new MemberDAO();
    
    int code = dao.login(uid, ups);
    
    if(code == 1) { // 회원 아이디가 아예 존재하지 않는 경우
    	response.sendRedirect("/member/join.jsp");
    } else if (code == 2) { // 아이디는 DB에 존재하지 않는데 비밀번호가 잘못된 경우
    	response.sendRedirect("/member/login.jsp");
    } else { // 성공
    	session.setAttribute("id", uid);
    	response.sendRedirect("/main.jsp");
    }
    
    %>
    
    
    
    
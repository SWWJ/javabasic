<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import = "java.sql.*" %>
    <%
    String hakbun = (String)session.getAttribute("hakbun");
    String name = (String)session.getAttribute("name");
    boolean login = false;
    
    if((hakbun != null) && (name != null)) {
    	login = true;
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 테이블 학생 정보 입력</title>
</head>
<body>

</body>
</html>
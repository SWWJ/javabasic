<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%-- JSP의 스크립팅 요소 5가지 --%>
<%-- 
<% ........Java 코드........ %> 스크립틀릿 scriptlet 일반 자바코드 삽입 - 가장 많이 사용
<%@ ....................... %> 지시어 directive
<%= ....................... %> 표현식 expression
<%! ....................... %> 선언문 declaration --%>
<%-- .................... --%> <!-- 주석 comment -->
<!-- html 주석 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>User ID : <%= request.getParameter("id") %></h3>
<h3>User PW : <%= request.getParameter("pw") %></h3>

</body>
</html>
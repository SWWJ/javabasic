<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="util.ConnectionPool"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "/_header.jsp" %>

    <table align = "center">
    <%
		Connection conn = ConnectionPool.get();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM delete");
		
		while(rs.next()) {
	%>
	<tr><td colspan = 2><hr></td></tr>
	<tr><td><%=rs.getString("no") %></td>
	<td><small><%=rs.getString("ts") %></small></td>
	<tr><td colspan = 2><%=rs.getString("delete") %></td></tr>
	<%
		}
	%>
	
	</table>


<%@ include file = "/_footer.jsp" %>

</body>
</html>
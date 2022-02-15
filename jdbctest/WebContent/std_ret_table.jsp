<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
    
    <%
    request.setCharacterEncoding("utf-8");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 검색</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<%
	// 객체 참조 변수
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rset = null;

	// 드라이버 로딩
	String driverClass = "org.mariadb.jdbc.Driver";
	
	try {
		Class.forName(driverClass);
		out.println("JDBC Driver loading 성공! <br>");
	} catch (ClassNotFoundException err) {
		out.print("JDBC Driver loading 실패.. <br>");
	}
	
	// 마리아 서버 연결
	
	String url = "jdbc:mariadb://localhost:3306/univ";
	String id = "root";
	String pw = "0000";
	
	try {
		conn = DriverManager.getConnection(url, id, pw);
		out.println("MariaDB 연결 성공! <br>");
		
		// SQL 질의어 처리
		// 대학 데이터베이스 univ 생성
		
		String sql = "SELECT * FROM student ORDER BY hakbun ASC";
		pstmt = conn.prepareStatement(sql);
		
		rset = pstmt.executeQuery();

	%>
	
		<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">이름</th>
      <th scope="col">학번</th>
      <th scope="col">전공</th>
      <th scope="col">주소<th>
      
    </tr>
  </thead>
  <tbody>
  
  <%
  
  int no = 1;
  while(rset.next()) {
		String hakbun = rset.getString("hakbun");
		String name = rset.getString("name");
		String year = rset.getString("year");
			   year = year + "학년";
		String dept = rset.getString("dept");
		String addr = rset.getString("addr");
  
  
  %>
  
    <tr>
      <th scope="row"><%= no %></th>
      <td><%=name %></td>
      <td><%=hakbun %></td>
      <td><%=dept %></td>
      <td><%=addr %></td>
    </tr>
    
    <%
    no++;
	}
	} catch (SQLException sqlerr) {
		out.println("학생 테이블 검색 실패.. <br>");
		out.println(sqlerr.getMessage() + "<br>");
	} finally {
		if(pstmt != null) {
			try {
				pstmt.close();
				out.println("Statement_close <br>");
			} catch (Exception conerr) {}
		}
		if(conn != null) {
			try {
				conn.close();
				out.println("MariaDB 서버 연결 종료 <br>");
			} catch (Exception conerr) {
				conerr.printStackTrace();
			}
		}
	}
    %>
    
  </tbody>
</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이 메모</title>
</head>
<body>

  <%@ include file="_header.jsp" %>
  
 <%
 	String uid = (String) session.getAttribute("id");
 
 	if (uid == null) {
 		response.sendRedirect("/member/login.jsp");
 	}
 	
 	session.setAttribute("id", uid);
 %> 
  
<div class ="container">
<form action="#">
<div class="form-floating">
  <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea2" style="height: 100px"></textarea>
  <label for="floatingTextarea2">메모</label>
</div>  
<button class="w-100 btn btn-lg btn-primary" type="submit">완료</button>
</form>  
  
메모 목록

1. 과제 제출 
2. 알바 검색

</div>  
  <%@ include file="_footer.jsp" %>
  
</body>
</html>
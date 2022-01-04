<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>


	<%@ include file="/_header.jsp"%>
	

<div class ="container">
<main class="form-signin">
  <form action = "logincheck.jsp">
    <img class="mb-4" src="/docs/5.1/assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">로그인</h1>

    <div class="form-floating">
      <input type="text" name = "id" class="form-control" id="floatingInput" placeholder="아이디를 입력하세요">
      <label for="floatingInput">아이디</label>
    </div>
    <div class="form-floating">
      <input type="password" name = "ps" class="form-control" id="floatingPassword" placeholder="비밀번호를 입력하세요">
      <label for="floatingPassword">비밀번호</label>
    </div>

    <button class="w-100 btn btn-lg btn-primary" type="submit">로그인</button>
  </form>
</main>
</div>

</body>
</html>
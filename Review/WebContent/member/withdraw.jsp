<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="/_header.jsp"%>

<div class="alert alert-dark" role="alert">
  회원탈퇴 페이지입니다.
</div>

<div class ="container">
<main class="form-signin">
  <form action = "/member/withdrawcheck.jsp">
    <img class="mb-4" src="/docs/5.1/assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">회원탈퇴</h1>

    <div class="form-floating">
      <input type="text" name = "id" class="form-control" id="floatingInput" placeholder="아이디를 입력하세요">
      <label for="floatingInput">아이디</label>
    </div>
        <div class="form-floating">
      <input type="password" name = "ps" class="form-control" id="floatingPassword" placeholder="비밀번호를 입력하세요">
      <label for="floatingPassword">비밀번호</label>
    </div>
        <button class="w-100 btn btn-lg btn-primary" type="submit">탈퇴</button>
    <p class="mt-5 mb-3 text-muted">&copy; by SW 2017–2021</p>
  </form>
</main>
</div>

	<%@ include file="/_footer.jsp"%>
</body>
</html>
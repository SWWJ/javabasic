<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체 Implicit Object</title>
</head>
<body>
<!-- 
내장객체는 JSP에 의해 미리 정의된 객체로 JSP 페이지 내에서 선언 없이 이용할 수 있는 객체를 말한다.
request, response, out, application, session
- 별도의 생성, 선언 없이 사용 가능하다.
- 지정된 값으로만 사용해야 한다. 즉 변수 이름을 수정하면 안 된다.

request 객체는 HTTP 요청 메시지의 내용을 참조하기 위한 함수들을 제공한다.
******** getParameter() HTTP 요청 값을 반환한다.
getParameterValues() 배열 형태로 반환한다.
getParameterNames() 특정 이름에 해당하는 것만 반환한다.
getParpmeterMap() 전체 리스트를 키와 벨류 형태의 Map 객체로 반환한다.

getHeader() 헤더에서 특정 이름의 속성 값을 반환한다.
getHeaderNames() 헤더에 포함된 모든 속성의 이름을 반환한다.
getCookies() 모든 쿠키 값을 가져온다.


response 주로 메세지의 헤더 정보를 얻어오거나 설정하기 위한 함수를 포함한다.
단 메세지의 바디 정보에 들어 갈 내용을 추가하기 위한 함수는 제공하지 않는다.

sendRedirect() 지정된 url 페이지로 강제 이동한다.

out
out.print(); 화면 상에 출력

application 객체는 서비스의 실행 기간 동안 유지될 필요가 있는 설정값을 설정하거나 가져온다.
-->

</body>
</html>
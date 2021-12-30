
<%-- 지시어 directive
페이지 처리를 위해 부가적인 정보를 정의하는 데 이용
@annotation

page - JSP 처리 방법을 정의 : import 한글 설정(get) 등
include - 다른 문서를 포함 header/footer 등
taglib  - 태그 라이브러리 설정 JSTL JSP Standard Tag Library
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- charset=UTF-8" pageEncoding="UTF-8" get 방식에서의 한글 처리 --%>
   
 <%-- // 포스트 방식에서의 한글 처리 --%>  
   <%@ request.setCharacterEncoding("utf-8"); %>
 
 <%@ page import =  "java.util.Date" %>
   <html>
   <head>
   <!-- HTML 주석 -->
   <%-- JSP 주석  --%>
   </head>
   <body>
   <%! // 선언문
   String res = "";
   %>
   
   <%@ include file = "_header.jsp" %>
<!-- include 지시어를 사용할 때 주의할 점은 두 파일 간에 이름이 같은 변수가 있으면 안 된다.
    일반 자바에서와 같이 충돌이 일어나게 된다.-->
    <%    
    /* 스크립틀릿 scriptlet
      스크립틀릿 내에 정의된 코드는 서블릿 변환 시 그대로 삽입된다. 따라서 java 코드 형태로 실행된다.
    */
    String uid = request.getParameter("id"); // 값을 넘겨 받음
    String upw = request.getParameter("pw");
    
    res = "<h3>User ID : " + uid + "<h3>";
    res += "<h4>User PW : " + upw + "<h4>";
    
    // System.out.println(res); // java에서
    out.print(res);  // 웹상에서 출력
    
    out.print(res);
    out.print("<br>");
    out.print((new Date()).toString()); %>
    </body>
    
    </html> 
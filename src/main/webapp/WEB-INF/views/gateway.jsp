<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
	System.out.println(request.getAttribute("lId"));
	session.setMaxInactiveInterval(10000);
	if (session.getAttribute("lId") == null) {
	%>
	<!-- 메인에서 session에 id값이 없을경우 로그인버튼 출력 -->
	<h2>로그인정보가 없습니다.</h2>
	<a href='login'>로그인</a>
	<%
	} else {
	%>

	<%=session.getAttribute("lId")%>님이 로그인 하였습니다.
	</h3>
	<br>
	<a href="logout">로그아웃</a>
	<br>
	<a href="list?lId=${lId }">게시판</a>
	<br>
	<!-- 로그아웃 클릭시 로그인폼으로 넘어가며 로그인창에서 session초기화 -->
	<%
	//로그인한 id가 admin일 때에만 관리자모드 접속 태그 생성
	if (session.getAttribute("lId").equals("admin")) {
	%>
	<a href="memberlist">관리자모드 접속</a>

	<%}
}%>
</body>
</html>
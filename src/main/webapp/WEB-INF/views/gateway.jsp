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
	<!-- ���ο��� session�� id���� ������� �α��ι�ư ��� -->
	<h2>�α��������� �����ϴ�.</h2>
	<a href='login'>�α���</a>
	<%
	} else {
	%>

	<%=session.getAttribute("lId")%>���� �α��� �Ͽ����ϴ�.
	</h3>
	<br>
	<a href="logout">�α׾ƿ�</a>
	<br>
	<a href="list?lId=${lId }">�Խ���</a>
	<br>
	<!-- �α׾ƿ� Ŭ���� �α��������� �Ѿ�� �α���â���� session�ʱ�ȭ -->
	<%
	//�α����� id�� admin�� ������ �����ڸ�� ���� �±� ����
	if (session.getAttribute("lId").equals("admin")) {
	%>
	<a href="memberlist">�����ڸ�� ����</a>

	<%}
}%>
</body>
</html>
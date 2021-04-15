<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
		<td>No.</td>
		<td>Name</td>
		<td>Title</td>
		<td>Date</td>
		<td>Hit</td>
	</tr>
	<c:forEach items="${list }" var="dto">
	<tr>
		<td>${dto.bId}</td>
		<td>${dto.bName }</td>
		<td><c:forEach begin="1" end="${dto.bIndent }">-</c:forEach>
			<a href="content_view?bId=${dto.bId}">${dto.bTitle }</a>
		</td>
		<td>${dto.bDate }</td>
		<td>${dto.bHit }</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="5"> <a href ="write_view">write</a>
		</td>
	</tr>
	<br>
	<a href="logout">logout</a>
	<a href="main"> TO main</a>
	
</table>
</body>
</html>
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
		<td>ID.</td>
		<td>Name</td>
		<td></td>
		
	</tr>
	<c:forEach items="${list }" var="dto">
	<tr>
		<td>
		<a href ="member_detail?mId=${dto.mId }">
		${dto.mId}
		</a></td>
		<td>${dto.mName }</td>
		<td>
		<a href ="member_delete?mId=${dto.mId }">delete</a>
		</td>
	</tr>
	</c:forEach>

	</tr>
	
</table>
</body>
</html>
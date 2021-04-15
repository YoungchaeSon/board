<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
		<td>ID.</td>
		<td>Name</td>
		<td>Email</td>
		<td>ZipNo</td>
		<td>Addr</td>
		<td>Birth</td>
		<td>Interest</td>
		<td>Introduce</td>
		
	</tr>

	<tr>
		<td>${list.mId }</td>
		<td>${list.mName}</td>
		<td>${list.mEmail}</td>
		<td>${list.mZipNo}</td>
		<td>${list.mAddr1} ${list.mAddr2}</td>
		<td>${list.mYear}.${list.mMonth}.${list.mDate}</td>
		<td>${list.mInterest}</td>
		<td>${list.mIntroduce}</td>

	</tr>


	</tr>
	
</body>
</html>
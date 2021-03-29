<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../template/header.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
<c:import url="../template/body.jsp"></c:import>
	<h1>Notice Select</h1><br>
	<h1>${nDTO.noticeSub}</h1><br>
	<h4>${nDTO.id}</h4><h4>${nDTO.noticeDate}</h4><h4>${nDTO.hit}</h4><br>
	${nDTO.noticeContent}<br>
	<br>
	<br>
	<a href="./noticeUpdate">Notice Edit</a>
	<a href="./noticeDelte">Notice Delete</a>
</body>
</html>
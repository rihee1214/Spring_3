<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../template/header.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
<c:import url="../template/body.jsp"></c:import>
<form action="./noticeInsert" method="post">
	Subject<input type="text" name="noticeSub">
	내용<input type="text" name="noticeContent">
	<input type="hidden" readonly="readonly" name="id" value="${sessionScope.member.id}">
	<button>submit</button>
</form>
</body>
</html>
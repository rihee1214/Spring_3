<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="ko">
<c:import url="./template/header.jsp"></c:import>
<script type="text/javascript">
	alert('helloword');
</script>
<head>
<link rel="stylesheet" href="./resources/css/test.css" >
<title>Hello, world!</title>
</head>
<body>
<div class="fakeimg">
	<img alt="사탄도 울고가는 광고" src="https://d2gd6pc034wcta.cloudfront.net/images/logo@2x.png">
</div>
	<c:import url="./template/body.jsp"></c:import>
	<h1>Hello, world!</h1>
	<h1>
		<a href="./bankbook/bankbookList">BankBook List</a>
	</h1>
	<c:if test="${empty member}">
		<h1>
			<a href="./member/memberLogin">Member Login</a>
		</h1>
		<h1>
			<a href="./member/memberJoin">Member Join</a>
		</h1>
	</c:if>

	<c:if test="${not empty member}">
		<h3>${sessionScope.member.id}님환영합니다.</h3>
		<h1>
			<a href="./member/memberPage">MyPage</a>
		</h1>
		<h1>
			<a href="./member/memberLogout">Logout</a>
		</h1>
	</c:if>
	<script type="text/javascript" src="./resources/js/test.js"></script>
</body>
</html>
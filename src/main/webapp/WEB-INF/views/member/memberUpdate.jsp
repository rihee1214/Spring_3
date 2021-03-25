<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="memberUpdate" method="post">
		<input type="hidden" readonly="readonly" name="id" value="${sessionScope.member.id}">
		PW<input type="password" name="pw"><br>
		Name<input type="text" name="name" value="${sessionScope.member.name}"><br>
		Email<input type="text" name="email" value="${sessionScope.member.email}"><br>
		Phone<input type="text" name="phone" value="${sessionScope.member.phone}"><br>
		<button>submit</button>
	</form>
</body>
</html>
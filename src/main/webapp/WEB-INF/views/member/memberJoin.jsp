<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Join</h1>
	<form action="./memberJoin" method="post">
		ID <input type="text" name="id">
		PW <input type="password" name="pw">
		Name <input type="text" name="name">
		Email <input type="email" name="email">
		Phone <input type="text" name="phone">
		<button>Join</button>
	</form>
</body>
</html>
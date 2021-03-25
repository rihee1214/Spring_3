<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Page</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Phone</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${sessionScope.member.id}</td>
				<td>${sessionScope.member.name}</td>
				<td>${sessionScope.member.email}</td>
				<td>${sessionScope.member.phone}</td>
			</tr>
		</tbody>
	</table>
	<a href="./memberDelete">회원탈퇴</a>
	<a href="./memberUpdate">정보수정</a>
</body>
</html>
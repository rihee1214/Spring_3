<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBook Select</h1>
	<table>
		<thead>
			<tr>
				<th>bookName</th>
				<th>bookRate</th>
				<th>bookSale</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${dto.bookName}</td>
				<td>${dto.bookRate}</td>
				<td>${dto.bookSale}</td>
			</tr>
		</tbody>
	</table>
	<a href="./bankbookDelete?bookNumber=${dto.bookNumber}">Delete</a>
	<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}">Update</a>
</body>
</html>
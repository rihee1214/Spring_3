<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<c:catch>
		<c:if test="${not empty member && member.id eq 'admin'}">
			<a href="./bankbookDelete?bookNumber=${dto.bookNumber}">Delete</a>
			<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}">Update</a>
		</c:if>
	</c:catch>
</body>
</html>
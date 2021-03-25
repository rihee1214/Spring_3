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
	<h1>Account List Page</h1>
	<table>
		<thead>
			<tr>
				<th>Account Number</th>
				<th>Account Balance</th>
				<th>Date</th>
				<th>ID</th>
				<th>Book Number</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${accountList}" var="dto">
				<tr>
					<td>${dto.accountNumber}</td>
					<td>${dto.accountBalance}</td>
					<td>${dto.date}</td>
					<td>${dto.id}</td>
					<td>${dto.bookNumber}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
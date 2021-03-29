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
	<h1>Notice List</h1>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>ID</th>
				<th>조회수</th>
				<th>안내일자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${nList}" var="dto">
				<tr>
					<td>${dto.noticeNumber}</td>
					<td><a href="./noticeSelect?noticeNumber=${dto.noticeNumber}">${dto.noticeSub}</a></td>
					<td>${dto.id}</td>
					<td>${dto.hit}</td>
					<td>${dto.noticeDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<c:if test="${not empty sessionScope.member and sessionScope.member.id eq 'admin'}">
		<a href="./noticeInsert">notice add</a>
	</c:if>
</body>
</html>
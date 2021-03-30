<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/header.jsp"></c:import>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/body.jsp"></c:import>
	<h1>BankBook List</h1>
	
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th class="col">Name</th>
				<th class="col">Rate</th>
				<th class="col">Sale</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">
			<tr>
				<td><a href="./bankbookSelect?bookNumber=${dto.bookNumber}">${dto.bookName}</a></td>
				<td>${dto.bookRate}</td>
				<td>${dto.bookSale}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<ul class="pagination">
	<c:if test="${pager.pre}">
	  <li class="page-item"><a class="page-link" href="#">Previous</a></li>
	  </c:if>
		  <c:forEach begin="${pager.startnum}" end="${pager.lastnum}" var="i">
		  	<li class="page-item"><a class="page-link" href="./bookList?curPage=${i}">${i}</a></li>
		  </c:forEach>
		 <c:if test="${pager.next}">
	  <li class="page-item"><a class="page-link" href="#">Next</a></li>
	  </c:if>
	</ul>
</body>
</html>
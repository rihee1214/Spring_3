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
	<div>
	<ul class="pagination">
	<c:if test="${pager.pre}">
		<li class="page-item"><a class="page-link" href="./noticeList?curPage=${pager.startnum-1}">Previous</a></li>
		</c:if>
		<c:forEach begin="${pager.startnum}" end="${pager.lastnum}" var="i">
		  <li class="page-item"><a class="page-link" href="./noticeList?curPage=${i}">${i}</a></li>
		</c:forEach>
		<c:if test="${pager.next}">
		<li class="page-item"><a class="page-link" href="./noticeList?curPage=${pager.lastnum+1}">Next</a></li>
		</c:if>
	</ul>
	</div>
<div class="input-group mt-3 mb-3">
<form action="./noticeList?noticeSub" class="form-inline">
  <div class="input-group-prepend">
   <select class="form-control" id="sel1">
    <option>Title</option>
    <option>Contents</option>
    <option>Writer</option>
  </select>
  </div>
  <input type="text" class="form-control" placeholder="Username">
    <div class="input-group-append">
    <button class="btn btn-success" type="submit">Search</button>
  </div>
 </form> 
</div>

	<c:if test="${not empty sessionScope.member and sessionScope.member.id eq 'admin'}">
		<a href="./noticeInsert">notice add</a>
	</c:if>
</body>
</html>
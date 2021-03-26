<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Notice Select</h1><br>
	<h1>${nDTO.noticeSub}</h1><br>
	<h4>${nDTO.id}</h4><h4>${nDTO.noticeDate}</h4><h4>${nDTO.hit}</h4><br>
	${nDTO.noticeContent}
</body>
</html>
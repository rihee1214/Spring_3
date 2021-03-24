<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h1><a href="./bankbook/bankbookList">BankBook List</a></h1>
<h1><a href="./member/memberLogin">Member Login</a></h1>
<h1><a href="./member/memberJoin">Member Join</a></h1>
</body>
</html>

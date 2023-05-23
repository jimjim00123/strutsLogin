<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
Welcome <%=request.getAttribute("username").toString() %><br>
	<a href="/strutsLogin/">返回重新登入</a>
</body>
</html>
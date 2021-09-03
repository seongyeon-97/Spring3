<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
	<c:import url="../temp/boot_nav.jsp"></c:import>
	<h1>Bankbook Select Page##</h1>
	
	<h1>BookNumber: ${dtov.bookNumber}</h1>
	<h1>Bookname : ${dtov.bookName}</h1>
	<h1>Bookrate: ${dtov.bookRate}</h1>
	<h1>Booksale: ${dtov.bookSale}</h1>
	
	<a href="./bankbookDelete?bookNumber=${dtov.bookNumber}">DELETE</a>
	<a href="./bankbookUpdate?bookNumber=${dtov.bookNumber}">UPDATE</a>
</body>
</html>
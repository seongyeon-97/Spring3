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
	
	<h1>Bankbook Insert Page%%</h1>
	
	<div class="container-fluid">
		<form class="col-md-5 mx-auto" action="./bankbookInsert" method="post">
		
		<div class="mb-3">
		  <label for="bookName" class="form-label">Bankbook Name</label>
		  <input type="text" class="form-control" name="bookName" id="bookName" placeholder="청년우대통장">
		</div>
		
		<div class="mb-3">
		  <label for="bookRate" class="form-label">Bankbook Rate</label>
		  <input type="text" class="form-control" name="bookRate" id="bookRate">
		</div>
		
		<div class="form-check">
		  <input class="form-check-input" type="radio" name="bookSale" value="1" id="bookSale1">
		  <label class="form-check-label" for="bookSale1">
		   SALE
		  </label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="radio" name="bookSale" value="0" id="bookSale2" checked>
		  <label class="form-check-label" for="bookSale2">
		    NOT SALE
		  </label>
		</div>
	
		<button type="submit" class="btn btn-success">SUBMIT</button>
		
		</form>
		
	</div>
</body>
</html>
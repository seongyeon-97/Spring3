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
	
	<h1>Bankbook Update Page%%</h1>
	
	<div class="container-fluid">
		<form class="col-md-5 mx-auto" action="./bankbookUpdate" method="post">
		
		<div class="mb-3">
			<label for="bookNumber" class="form-label">Bankbook Number</label>
			<input type="text" class="form-control"  readonly="readonly" value="${dto.bookNumber}" name="bookNumber">
		</div>
		
		<div class="mb-3">
		  <label for="bookName" class="form-label">Bankbook Name</label>
		  <input type="text" class="form-control" value="${dto.bookName}" name="bookName" id="bookName" placeholder="Enter bookName">
		</div>
		
		<div class="mb-3">
		  <label for="bookRate" class="form-label">Bankbook Rate</label>
		  <input type="text" class="form-control" value="${dto.bookRate}" name="bookRate" id="bookRate">
		</div>
		
		<c:choose>
			<c:when test="${dto.bookSale eq 1}">
				<div class="form-check mb-3">
			  <input class="form-check-input" type="radio" name="bookSale" value="1" id="bookSale1" checked="checked">
			  <label class="form-check-label" for="bookSale1">
			   SALE
			  </label>
			</div>
			<div class="form-check mb-3">
			  <input class="form-check-input" type="radio" name="bookSale" value="0" id="bookSale2">
			  <label class="form-check-label" for="bookSale2">
			    NOT SALE
			  </label>
			</div>
			</c:when>
			<c:otherwise>
				<div class="form-check mb-3">
			  <input class="form-check-input" type="radio" name="bookSale" value="1" id="bookSale1">
			  <label class="form-check-label" for="bookSale1">
			   SALE
			  </label>
			</div>
			<div class="form-check mb-3">
			  <input class="form-check-input" type="radio" name="bookSale" value="0" id="bookSale2" checked="checked">
			  <label class="form-check-label" for="bookSale2">
			    NOT SALE
			  </label>
			</div>
			</c:otherwise>
		</c:choose>
		
		<%-- <c:if test="${dto.bookSale eq 1}">
			<div class="form-check mb-3">
			  <input class="form-check-input" type="radio" name="bookSale" value="1" id="bookSale1" checked="checked">
			  <label class="form-check-label" for="bookSale1">
			   SALE
			  </label>
			</div>
			<div class="form-check mb-3">
			  <input class="form-check-input" type="radio" name="bookSale" value="0" id="bookSale2">
			  <label class="form-check-label" for="bookSale2">
			    NOT SALE
			  </label>
			</div>
		</c:if>
		
		<c:if test="${dto.bookSale eq 0}">
			<div class="form-check mb-3">
			  <input class="form-check-input" type="radio" name="bookSale" value="1" id="bookSale1">
			  <label class="form-check-label" for="bookSale1">
			   SALE
			  </label>
			</div>
			<div class="form-check mb-3">
			  <input class="form-check-input" type="radio" name="bookSale" value="0" id="bookSale2" checked="checked">
			  <label class="form-check-label" for="bookSale2">
			    NOT SALE
			  </label>
			</div>
		</c:if> --%>
		
		
		
		<button type="submit" class="btn btn-success">UPDATE</button>
		
		</form>
		
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<title>Products and Categories</title>
</head>
<body>
	<div class="container">
		<nav>
			<h3><a href="/">Products</a> | <a href="/categories/new">Categories</a></h3>
		</nav>
		<h2>All Products</h2>
		
		
		
		
		
		<div>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Id</th>
					<th>Product</th>
					
					
					
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ products }" var="lang">
				<tr>
					<td><a href="/${ lang.id }">${ lang.name }</a></td>
					
					
					
				</tr>
			</c:forEach>
			</tbody>
		</table>
		
		
	</div>
</body>
</html>
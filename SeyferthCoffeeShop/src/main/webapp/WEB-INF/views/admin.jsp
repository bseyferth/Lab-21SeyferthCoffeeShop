<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<div class ="container">
	<h1>Welcome to Seyferth's Coffee Shop </br> Admin Page</h1>
			<table class="table">
			<thead>
				<tr>
					<th>Item</th><th>Description</th><th>Quantity</th><th>Price</th><th>Edit</th><th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${item}">
				<tr>
					<td>${item.name}</td>
					<td>${item.description}</td>
					<td>${item.quantity}</td>
					<td>${item.price}</td>
					<td><a href ="/edititem?id=${item.id}&name=${item.name}&description=${item.description}&quantity=${item.quantity}&price=${item.price}">Edit</a></td>
					<td><a href ="/delete?id=${item.id}&name=${item.name}&description=${item.description}&quantity=${item.quantity}&price=${item.price}">Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<p>
		<a href = "/">Home</a>
		</p>
		<p>
		<a href="/add-item">Add Item</a>
		</p>
	</div>
</body>
</html>
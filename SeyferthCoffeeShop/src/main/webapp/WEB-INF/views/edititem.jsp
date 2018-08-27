<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
</head>
<body>

<main class = "container">
	<p>
	<a href = "/">Home</a>
	</p>

			<!-- Form Action determines the next URL path -->
	<form action = "/editanitem" method = "post"> 
	<p>
	<input name = "id" required value= "${ item.id }" type="hidden"/>
	</p>
	<p>
	Name: <input name = "name" required value= "${ item.name }"/>
	</p>
	<p>
	Description: <input name = "description" required value= "${ item.description }"/>
	</p>
	<p>
	Quantity: <input name = "quantity" required value= "${ item.quantity }"/>
	</p>
	<p>
	Price: <input name = "price" required value= "${ item.price }"/>
	</p>
	<p>
	<button class="btn btn-secondary"> Go! </button>
	</p>
	</form>

</main>
</body>
</html>
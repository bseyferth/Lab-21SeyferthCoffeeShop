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
	<form action = "/summary" method = "post"> 
	<p>
	First Name: <input name = "firstName" required minlength="2"/>
	</p>
	<p>
	Last Name: <input name = "lastName" required minlength="2"/>
	</p>
	<p>
	Email: <input type = "email" name = "email" required/>
	</p>
	<p>
	Phone Number: <input name = "phoneNumber" required pattern = "[0-9]{10}" minlength ="10" maxlength ="10"/>
	</p>
	<p>
	Password: <input type = "password" name = "password"/>
	</p>
	<p>
	Verify Password: <input type = "password" name = "verifyPassword"/>
	</p>
	<p>
	<button class="btn btn-secondary"> Go! </button>
	</p>
	</form>

</main>
</body>
</html>
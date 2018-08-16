<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>
	<a href = "/">Home</a>
	</p>

			<!-- Form Action determines the next URL path -->
	<form action = "/summary"> 
	<p>
	First Name: <input name = "firstName"/>
	</p>
	<p>
	Last Name: <input name = "lastName"/>
	</p>
	<p>
	Email: <input type = "email" name = "email"/>
	</p>
	<p>
	Phone Number: <input name = "phoneNumber"/>
	</p>
	<p>
	Password: <input name = "password"/>
	</p>
	<p>
	Verify Password: <input name = "verifyPassword"/>
	</p>
	<p>
	<button> Go! </button>
	</p>
	</form>


</body>
</html>
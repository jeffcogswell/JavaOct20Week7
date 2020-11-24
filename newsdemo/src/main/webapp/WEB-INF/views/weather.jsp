<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Weather</h1>
	
	<form method="post" action="/weather">
	
		Latitude: <input type="text" name="latitude" /><br />
		
		Longitude: <input type="text" name="longitude" /><br />
		
		<input type="submit" />
	
	
	</form>

</body>
</html>
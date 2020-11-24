<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Launch: ${ launch.name }</h1>
	
	${ launch.details }<br />
	Date: ${ launch.static_fire_date_utc }<br />
	Success: ${ launch.success }<br />
	<a href="/rocket/${ launch.rocket }">Rocket</a><br />
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Rocket: ${ rocket.name }</h1>
	
	Stages: ${ rocket.stages }<br />
	Cost per launch: ${ rocket.cost_per_launch }<br />
	
	<a href="${ rocket.wikipedia }">Wikipedia</a><br />
	
	${ rocket.description }<br />
	
	<h2>Height</h2>
	${ rocket.height.meters } meters<br />
	${ rocket.height.feet } feet
	
	<h2>Diameter</h2>
	${ rocket.diameter.meters } meters<br />
	${ rocket.diameter.feet } feet
	
</body>
</html>
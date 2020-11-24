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
	<h1>Index</h1>
	
	<form method="post" action="/byyear">
		Launch Year: <input type="text" name="launch_year" /><br />
		<input type="submit" />
	</form>
	
	<h2>Launches</h2>
	
	<c:forEach var="launch" items="${ launches }">
	
		<a href="/launch/${ launch.id }">${ launch.name }</a><br />
	
	</c:forEach>
	
</body>
</html>
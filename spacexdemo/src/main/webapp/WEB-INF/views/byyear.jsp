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
	<h1>Launches for Year ${ year }</h1>
	
	<c:forEach var="launch" items="${ launches }">
	
		<a href="/launch/${ launch.id }">${ launch.name }</a><br />	
	
	</c:forEach>
	
</body>
</html>
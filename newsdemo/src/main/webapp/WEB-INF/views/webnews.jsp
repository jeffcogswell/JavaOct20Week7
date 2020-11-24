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
	<h1>Web News</h1>
	
	<c:forEach var="article" items="${ articles }">
		<a href="${ article.url }">${ article.title }</a><br />
		<img style="width:50px;" src="${ article.urlToImage }" />
		by ${ article.author }<br />
		${ article.description }<br /><br />
	</c:forEach>
	
</body>
</html>
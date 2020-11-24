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
	<table rules="all" style="border:1px solid black">
	
		<tr>
			<c:forEach var="name" items="${ weather.time.startPeriodName }">
				<th>
					${ name }<br />
				</th>
			</c:forEach>
		</tr>

		<tr>	
			<c:forEach var="name" items="${ weather.data.weather }">
				<td>
					${ name }<br />
				</td>
			</c:forEach>
		</tr>

		<tr>	
			<c:forEach var="name" items="${ weather.data.text }">
				<td>
					${ name }<br />
				</td>
			</c:forEach>
		</tr>
		
	</table>
</body>
</html>
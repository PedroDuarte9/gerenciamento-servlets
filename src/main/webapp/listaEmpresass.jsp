<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.empresa.gerenciamento.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P�gina Home</title>
</head>
	<body>
	
		<ul>
		<c:forEach items="${atributo}" var="atributos">
			<li>${atributos.name }</li>
		</c:forEach>
		</ul>
		
	</body>
</html>


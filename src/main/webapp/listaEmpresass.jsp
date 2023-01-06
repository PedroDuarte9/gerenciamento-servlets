<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.empresa.gerenciamento.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- core - significa controle de fluxo -->
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página Home</title>
</head>
	<body>
	
		<ul>
		<c:forEach items="${atributo}" var="atributos">
			<li>${atributos.name } </li> ${atributos.data} <!-- EM EDIÇÃO -->
		</c:forEach>
		</ul>
		
	</body>
</html>


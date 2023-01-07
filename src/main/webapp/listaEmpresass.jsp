<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.empresa.gerenciamento.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- core - significa controle de fluxo -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P�gina Home</title>
</head>
	<body>
		<c:if test="${not empty xpto }">
				Empresa: ${xpto} criada com sucesso ! 
		</c:if>
		<ul>
		<c:forEach items="${atributo}" var="atributos">
			<li>${atributos.name } <fmt:formatDate value="${atributos.data}" pattern="dd/MM/yyyy"/> </li>  <!-- EM EDI��O -->
		</c:forEach>
		</ul>
		
	</body>
</html>


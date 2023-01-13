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
		<c:if test="${not empty empresa }">
				Empresa: ${empresa} criada com sucesso ! 
		</c:if>
		<ul>
		<c:forEach items="${atributo}" var="atributos">
			<li>
				${atributos.name } <fmt:formatDate value="${atributos.data}" pattern="dd/MM/yyyy"/>
				<a href="/gerenciamento/unicaEntrada?acao=MostraEmpresas&id=${atributos.id}">editar</a>
				<a href="/gerenciamento/unicaEntrada?acao=RemovaEmpresas&id=${atributos.id}">remove</a>
			</li> 
			
		</c:forEach>
		</ul>
		
	</body>
</html>


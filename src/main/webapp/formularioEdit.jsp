<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/alterarEmpresas" var="edicaoNovaEmpresa"/> <!-- Aqui passamos o caminho para a servlet e a servlet envia para o outro JSP que entrega a response -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de Edição</title>
</head>
<body>
	<form action="${edicaoNovaEmpresa}" method = "post"> 
	
	Nome<input type ="text" name="parametro" value="${empresa.name }"/>	
	
	Data<input type="text" name="data" value="<fmt:formatDate value="${empresa.data }" pattern="dd/MM/yyyy"/>" /> 
	
	<input type="hidden" name="id" value="${empresa.id}"/>	
		<input type ="submit"/>
	
	</form>
</body>
</html>


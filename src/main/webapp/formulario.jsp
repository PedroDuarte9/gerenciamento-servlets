<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<c:url value="/novaEmpresa" var="registroNovaEmpresa"/> <!-- Aqui passamos o caminho para a servlet e a servlet envia para o outro JSP que entrega a response -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${registroNovaEmpresa}" method = "get"> <!-- Action = � a extens�o que ser� mandada a requsi��o com o par�metro  /  Method = � o tipo de requisi��o que ser� enviada pelo protocolo HTTP -->
	
	Nome<input type ="text" name="parametro"/>	
	
	Data<input type="text" name="data"/> <!-- EM EDI��O -->
		
		<input type ="submit"/>
	
	</form>
</body>
</html>


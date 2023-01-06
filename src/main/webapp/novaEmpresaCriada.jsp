<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<c:url value="/listaEmpresas" var="listaDeEmpresas" />
<html>
	<title>Página de Lista</title>	
		<body>
			<form action="${listaDeEmpresas}">
				<c:if test="${not empty xpto }">
					Empresa: ${xpto} criada com sucesso ! 
				</c:if>
				<c:if test="${empty xpto }">
					Nenhuma empresa cadastrada
				</c:if>
				<input type="submit" value="Lista"/>
			</form>
		</body>
</html>
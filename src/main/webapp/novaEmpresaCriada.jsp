<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
		<c:if test="${not empty xpto }">
			Empresa: ${xpto} criada com sucesso !
		</c:if>
		<c:if test="${empty xpto }">
			Nenhuma empresa cadastrada
		</c:if>
	</body>
</html>
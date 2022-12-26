 <%
//Scriplets
 
String entrada = (String)request.getAttribute("empresa"); //Aqui foi feito um cast pois o que está sendo enviado na request é uma String
System.out.println(entrada);

%>


<html>
	<body>
		<h2>Nome da empresa: <%= entrada %> este será o nome que foi passado.</h2>
	</body>
</html>
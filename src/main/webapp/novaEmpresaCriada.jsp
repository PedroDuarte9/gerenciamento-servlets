 <%
//Scriplets
 
String entrada = (String)request.getAttribute("empresa"); //Aqui foi feito um cast pois o que est� sendo enviado na request � uma String
System.out.println(entrada);

%>


<html>
	<body>
		<h2>Nome da empresa: <%= entrada %> este ser� o nome que foi passado.</h2>
	</body>
</html>
<!DOCTYPE html>
<html>
<head>
<title>balance/balanceIni</title>
</head>
<body>
	<%@include file="../menuGeneralBanko.jsp" %>
	<h1>Consulta de Balance</h1>
	<s:form action="balance">
   	 	
   	 	<p> Usuario: </p>
   	 	<s:textfield name="usuario.usuario"/>
   	 	
   	 	<p> Password: </p>
   	 	<s:textfield name="usuario.password"/>
   	 	
   	 	<p> ID: cuenta </p>
   	 	<s:textfield name="cuenta.id"/>
   	 	
		<s:submit value="Enviar"></s:submit>
	</s:form>
</body>
</html>
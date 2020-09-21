<!DOCTYPE html>
<html>
<head>
<title>consultas/consultaP</title>
</head>
<body>
	<%@include file="../menuGeneral.jsp" %>
	<h1>Consulta de Usuario</h1>
	<s:form action="consultaParticular">
		<h3> Usuario: </h3>
   	 	<s:textfield name="usuario.usuario"/>
		<s:submit value="Enviar"></s:submit>
	</s:form>
</body>
</html>
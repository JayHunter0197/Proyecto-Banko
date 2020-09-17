<!DOCTYPE html>
<html>
<head>

<title>cambios/cambioIni</title>
</head>
<body>
	<%@include file="../menuGeneral.jsp" %>
	<h1>Cambio de usuario</h1>
	<s:form action="cambio">
		<p>Usuario: </p>
      <s:textfield name="usuario.usuario" required="true" />
      	<p>Password: </p>
      <s:textfield name="usuario.password"   required="true" /> 
      <s:submit value="Enviar"/>
     </s:form> 
</body>
</html>
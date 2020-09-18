<!DOCTYPE html>
<html>
<head>
<title>bajas/bajaIni</title>
</head>
<body>

	<%@include file="../menuGeneralBanko.jsp" %>
	<h1>Baja de usuario</h1>
	<s:form action="baja">
	  <p>Usuario: </p>
      <s:textfield name="usuario.usuario" label="Usuario" required="true" /> 
      
      <p>Password: </p>
      <s:textfield name="usuario.password" label="Usuario" required="true" /> 
      
       <p>Id de la cuenta: </p>
      <s:textfield name="cuenta.id" label="Usuario" required="true" /> 
      
      <s:submit value="Enviar"/>
     </s:form> 
</body>
</html>
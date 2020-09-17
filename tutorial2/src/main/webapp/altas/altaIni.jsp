<!DOCTYPE html>
<html>
<head>

<title>altas/altaIni</title>
</head>
<body>

	<%@include file="../menuGeneralBanko.jsp" %>
	<h1>Alta de usuario</h1>
	<s:form action="alta">
		<p>Usuario: </p>
      <s:textfield name="usuario.usuario"  required="true" />
      	<p>Password: </p>
      <s:textfield name="usuario.password"   required="true" /> 
      	<p>Nombre: </p>
       <s:textfield name="usuario.nombre" required="true" /> 
      <s:submit value="Enviar"/>
     </s:form> 
</body>
</html>
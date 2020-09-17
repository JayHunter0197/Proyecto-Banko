<!DOCTYPE html>
<html>
<head>

<title>cambios/cambioIni</title>
</head>
<body>
	<%@include file="../menuGeneral.jsp" %>
	<h1>Cambio de usuario</h1>
	<s:form action="cambioFinal">
	  <p>Usuario: </p>
      <s:textfield name="usuario.usuario" label="Usuario" required="true" />
      <p>Password: </p>
      <s:textfield name="usuario.password"  label ="Contraseña" required="true" /> 
      <p>Nombre: </p>
      <s:textfield name="usuario.nombre"  label ="Nombre" required="true" /> 
      <s:submit value="Enviar"/>
     </s:form> 
</body>
</html>
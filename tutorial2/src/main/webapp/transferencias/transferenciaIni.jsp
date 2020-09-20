<%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<title>transferencias/transferenciaIni</title>
</head>
<body>

	<%@include file="../menuGeneralBanko.jsp" %>
	<h1>Realizar Transferencia</h1>
	<s:form action="transferir">
		<p>Usuario: </p>
      <s:textfield name="usuario.usuario"  required="true" />
      
      	<p>Password: </p>
      <s:textfield name="usuario.password"  required="true" />
      
      	<p>Mi cuenta: </p>
       <s:textfield  name="transferencia.idCuenta1"  required="true" /> 
      
      	<p>Cuenta Destino: </p>
      <s:textfield  name="transferencia.idCuenta2"  required="true" /> 
      
      	<p>Monto: </p>
      <s:textfield  name="transferencia.monto"  required="true" /> 
      
      <s:submit value="Enviar"/>
     </s:form> 
</body>
</html>
<!DOCTYPE html>
<html>
<head>

<title>depositos/depositoIni</title>
</head>
<body>

	<%@include file="../menuGeneralBanko.jsp" %>
	<h1>Depositos</h1>
	<s:form action="deposito">
		<p>Numero de Cuenta: </p>
	<s:textfield name="cuenta"  required="true" />
      	<p>User: </p>
    <s:textfield name="user"  required="true" />
      	<p>Password: </p>
   	<s:textfield name="password"   required="true" /> 
      	<p>Cantidad: </p>
       <s:textfield name="monto" required="true" /> 
      <s:submit value="Enviar"/>
     </s:form> 
</body>
</html>
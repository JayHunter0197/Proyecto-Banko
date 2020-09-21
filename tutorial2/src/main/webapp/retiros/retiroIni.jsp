<!DOCTYPE html>
<html>
<head>

<title>retiros/retiroIni</title>
</head>
<body>

	<%@include file="../menuGeneralBanko.jsp" %>
	<h1>Retiros</h1>
	<s:form action="retiro">
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
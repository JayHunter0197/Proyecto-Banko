<%@ taglib prefix = "s" uri = "/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consulta Transferencias</title>
</head>
<body>
	<%@include file="../menuGeneralBanko.jsp" %>
	<h1>Consulta de Transferencias</h1>
	
	<table border="1px">
	<tr>
		<td>
			ID
		</td>
		<td>
			ID Cuenta Origen
		</td>
		<td>
			ID Cuenta Destino
		</td>
		<td>
			Monto
		</td>
		<td>
			Fecha
		</td>
	</tr>
		<s:iterator value="listaTransferencias" status="stat">
			<tr>
				<td>
					<s:property value = "id"/>
				</td>
				<td>
					<s:property value = "idCuenta1"/>
				</td>
				<td>
					<s:property value = "idCuenta2"/>
				</td>
				<td>
					<s:property value = "monto"/>
				</td>
				<td>
					<s:property value = "fecha"/>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
<%@ taglib prefix = "s" uri = "/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>consultas/consultaExitosa</title>
</head>
<body>
	<table border="1px">
	<tr>
		<td>
			Usuario
		</td>
		<td>
			Password
		</td>
		<td>
			Nombre
		</td>
	</tr>
		<s:iterator value="list" status="stat">
			<tr>
				<td>
					<s:property value = "usuario"/>
				</td>
				<td>
					<s:property value = "password"/>
				</td>
				<td>
					<s:property value = "nombre"/>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
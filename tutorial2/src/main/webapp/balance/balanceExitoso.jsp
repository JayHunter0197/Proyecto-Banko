<!DOCTYPE html>
<html>
<head>
<title>balance/balanceExitoso</title>
</head>
<body>
<%@include file="../menuGeneralBanko.jsp" %>
	<h1>Info de la cuenta</h1>
	<br>
	<div class ="container">
		<div class ="row mt-3">
			<table border="1px">
			<thead>
				<tr>
					<th>ID cuenta</th>
					<th>Usuario</th>
					<th>Nombre</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="list" status="stat">
					<tr>
						<td>
							<s:property value = "id"/>
						</td>
						<td>
							<s:property value = "usuario"/>
						</td>
						<td>
							<s:property value = "monto"/>
						</td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
		</div>
	</div>
</body>
</html>
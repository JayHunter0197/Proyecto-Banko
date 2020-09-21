<%@ taglib prefix = "s" uri = "/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consulta Movimientos</title>
</head>
<body>
	<%@include file="../menuGeneralBanko.jsp" %>
	
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 text-center mt-5">
				<h1>Consulta General Movimientos</h1>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-8 d-flex justify-content-center">
				
				<table class="table table-striped table-dark">
				  <thead>
				    <tr>
				      <th scope="col">ID Movimiento</th>
				      <th scope="col">ID Cuenta</th>
				      <th scope="col">Tipo</th>
				      <th scope="col">Monto</th>
				      <th scope="col">Fecha</th>
				    </tr>
				  </thead>
				  <tbody>
				  
				  	<s:iterator value="listaMovimientos" status="stat">
						<tr>
							<td>
								<s:property value = "id"/>
							</td>
							<td>
								<s:property value = "idCuenta"/>
							</td>
							<td>
								<s:property value = "tipo"/>
							</td>
							<td>
								<s:property value = "monto"/>
							</td>
							<td>
								<s:property value = "fecha"/>
							</td>
						</tr>
					</s:iterator>
				    
				  </tbody>
				</table>
						
			</div>
		
		</div>
		
		
	
	</div>
	
	

	
	
</body>
</html>
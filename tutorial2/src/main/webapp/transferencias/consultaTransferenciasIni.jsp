<!DOCTYPE html>
<html>
<head>
<title>Consulta de Movimientos</title>
</head>

<style>
	#fondo{
		background-color:#030D08;
	}
</style>

<body>
	<%@include file="../menuGeneralBanko.jsp" %>
	
	
	<div id="fondo" class="container-fluid" >

		<div class="row">
				<div class="col-md-12 text-center text-light mt-5">
				<h1>Consulta de Transferencias</h1>
				</div>
			</div>
		

			
			
			<div class="row mt-5">
			
				<div class="col-md-12 d-flex justify-content-center text-dark">
					<s:form class="text-center border border-light p-5 text-light" action="consultarTransferencias">
				
			
					    <p class="h4 mb-4">Llenar Datos de Cuenta</p>
					
					    <!-- Email -->
						<s:textfield  type="text" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="Usuario" name="usuario.usuario"/>
					    <!-- Password -->
					 
					    <s:textfield type="text" id="defaultLoginFormPassword" class="form-control mb-4" placeholder="Id Cuenta" name="cuenta.id"/>
					    
					   
					     <s:textfield type="password" id="defaultLoginFormPassword" class="form-control mb-4" placeholder="Password" name="usuario.password"/>
					
					   
					
					    <!-- Sign in button -->
					  
						<s:submit class="btn btn-info btn-block my-4" value="Consultar Transferencias"></s:submit>
					
					</s:form>
				</div>
			</div>
	</div>
	
	
	
</body>
</html>
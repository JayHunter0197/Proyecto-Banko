<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="es">
<head>
	<title>main/serverValid.jsp</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto&display=swap"/>
	

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"rel="stylesheet" >
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	
	
</head>
<body>
	<div class="container">
		<div class="row mt-3">
			<div class="col">
			<s:form action="registrar" method="post">
			  <div class="form-group row">
				<div class="col-12 col-md-4 mb-3">
					<label for="nombre">Nombre:</label>
					<s:fielderror cssClass="text-danger" fieldName="nombre"/>
					<s:textfield cssClass="form-control" placeholder="Nombre" id="nombre" name="nombre"/>
				</div>
				<div class="col-12 col-md-6 mb-3">
					<label for="dir">Direccion:</label>
					<s:fielderror cssClass="text-danger" fieldName="direccion"/>
					<textarea class="form-control" rows="5" id="dir" name="direccion"></textarea>
				</div>
			  </div>
			  <div class="form-group row">
				<div class="col-12 col-md-4 mb-3">
					<label for="tel">Teléfono:</label>
					<s:fielderror cssClass="text-danger" fieldName="telefono"/>
					<input type="text" class="form-control" placeholder="Teléfono" id="telefono" name="telefono">
				</div>
				<div class="col-12 col-md-8 col-lg-4 mb-3">
					<label for="mail">Email:</label>
					<div class="input-group">
						<div class="input-group-prepend">
						<span class="input-group-text">@</span>
						</div>
						<input type="text" class="form-control" placeholder="Email" id="email" name="email">
					</div>
				</div>
			  </div>
			  
			  <div class="form-group row">
				<div class="col-12 col-md-3 mb-3">
					<label for="escolaridad">Escolaridad:</label>
					<select class="form-control" id="escolaridad" name="escolaridad">
						<option>Primaria</option>
						<option>Secundaria</option>
						<option>Preparatoria</option>
						<option>Licenciatura</option>
						<option>Maestria</option>
					</select>
				</div>
				<div class="col-12 col-md-3 mb-3">
					<label for="sexo">Sexo:</label>
					<div class="form-check">
						<label class="form-check-label">
						<input type="radio" class="form-check-input" id="hombre" name="sexo">Hombre
						</label>
					</div>
					<div class="form-check">
						<label class="form-check-label">
						<input type="radio" class="form-check-input" id="mujer" name="sexo">Mujer
						</label>
					</div>
				</div>
			  </div>
			  
			  <div class="form-group row">
			  <div class="col-12 text-center">
				<label class="form-check-label">
				  <input type="checkbox" id="terminos" class="form-check-input mr-2 mb-3" name="terminos"> Aceptar terminos y condiciones
				</label>
				<div class="row justify-content-center ">
					<div class="col-12 col-md-9 col-lg-6">
					<button type="submit" class="btn btn-block btn-primary">Enviar</button>
					</div>
				</div>
			  </div>
			  </div>
			</s:form>
			</div>
		</div>
	</div>
</body>
</html>
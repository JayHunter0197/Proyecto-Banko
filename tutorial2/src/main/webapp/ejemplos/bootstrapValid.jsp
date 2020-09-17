<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"rel="stylesheet" >
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	
	<title>Formulario simple</title>
</head>
<body>
    <br>
	<div class="container">
		<div class="row mt-3">
			<div class="col">
			<form action="registrar" method ="post" class="needs-validation" novalidate>
			  <div class="form-group col-md-6 col-lg-4">
				<label for="nombre">Nombre:</label>
				<input type="text" class="form-control" placeholder="Nombre" id="nombre" name = "nombre" required>
				<div class="valid-feedback">Valid.</div>
    			<div class="invalid-feedback">Please fill out this field.</div>
			  </div>
			  
			  <div class="form-group col-md-6 col-lg-4">
				<label for="pwd">Password:</label>
				<input type="password" class="form-control" placeholder="Password" id="pwd" name="direccion" required>
				<div class="valid-feedback">Valid.</div>
    			<div class="invalid-feedback">Please fill out this field.</div>
			  </div>
			  
			  <div class="form-group col-lg-4">
				<label for="mail">Email:</label>
				<input type="text" class="form-control" placeholder="Email" id="email" name="email">
			  </div>
			  
			  <div class="form-group col-md-6 col-lg-8">
				<label for="comment">Commentario:</label>
				<textarea class="form-control" rows="5" id="comment"></textarea>
			  </div>
			  
			  <div class="form-group col-md-3 col-lg-2">
				<label for="pais">País:</label>
				<select class="form-control" id="pais">
					<option>México</option>
					<option>EEUU</option>
					<option>Brasil</option>
					<option>Colombia</option>
				</select>
			  </div>
			  
			  <div class="form-check col-md-3 col-lg-2">
			    <label class="form-check-label">
				<input type="radio" class="form-check-input" id="hombre" name="sexo">Hombre
			    </label>
			  </div>
			  <div class="form-check col-md-3 col-lg-2">
			    <label class="form-check-label">
				<input type="radio" class="form-check-input" id="mujer" name="sexo">Mujer
			    </label>
			  </div>
			  
			  <div class="form-group form-check col-md-12 text-center"  >
				<label class="form-check-label">
				  <input class="form-check-input" type="checkbox"> Aceptar terminos y condiciones
				</label>
			  </div>
			  
			  <button type="submit" class="btn btn-primary  btn-block">Enviar</button>
			
			</form>
			</div>
		</div>
	
	</div>
	<script>
		// Disable form submissions if there are invalid fields
		(function() {
		  'use strict';
		  window.addEventListener('load', function() {
		    // Get the forms we want to add validation styles to
		    var forms = document.getElementsByClassName('needs-validation');
		    // Loop over them and prevent submission
		    var validation = Array.prototype.filter.call(forms, function(form) {
		      form.addEventListener('submit', function(event) {
		        if (form.checkValidity() === false) {
		          event.preventDefault();
		          event.stopPropagation();
		        }
		        form.classList.add('was-validated');
		      }, false);
		    });
		  }, false);
		})();
	</script>
	
	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>
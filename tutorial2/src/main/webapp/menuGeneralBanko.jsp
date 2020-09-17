<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>menuGeneralBanko.jsp</title> 
 	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/simple-line-icons/2.4.1/css/simple-line-icons.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
  	<link rel="stylesheet" href="styles/login.css">
  	
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js"></script>
    <script src="js/script.min.js"></script>
  	
</head>
<body>
	<nav class="navbar navbar-dark navbar-expand-lg fixed-top bg-dark clean-navbar">
        <div class="container"><a class="navbar-brand logo" href="#">Banko</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse"
                id="navcol-1">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item">
                    	 <s:url action="altaIni" var="altaLinkPrueba"></s:url>
                    	<a class="nav-link active" href="${altaLinkPrueba}">Nueva Cuenta</a>
                    </li>
                    <li class="nav-item">
                    	 <s:url action="balanceIni" var="balanceLink"></s:url>
                    	<a class="nav-link active" href="${balanceLink}">Balance</a>
                    </li>
                    <li class="nav-item">
                    	 <s:url action="depositoIni" var="depositoLink"></s:url>
                    	<a class="nav-link active" href="${depositoLink}">Deposito</a>
                    </li>
                    <li class="nav-item">
                    	 <s:url action="retiroIni" var="retiroLink"></s:url>
                    	<a class="nav-link active" href="${retiroLink}">Retiro</a>
                    </li>
                    <li class="nav-item">
                    	 <s:url action="transferIni" var="transferLink"></s:url>
                    	<a class="nav-link active" href="${transferLink}">Transferencia</a>
                    </li>
                    <!-- Dropdown -->
                    <li class="nav-item dropdown">
                   	 	<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">Movimientos</a>
	       			 	<div class="dropdown-menu">
       		  				<s:url action="movimientosIni" var="movimientosLink"></s:url>
		  					<a class="dropdown-item" href="${movimientosLink}">Mis movimientos</a>
		  					<s:url action="misTransferIni" var="misTransferLink"></s:url>
		  					<a class="dropdown-item" href="${misTransferLink}">Consulta General</a>
	  					</div>
	  				</li>
	  				<li class="nav-item">
                    	 <s:url action="bajaIni" var="bajaLink"></s:url>
                    	<a class="nav-link active" href="${bajaLink}">Cerrar cuenta</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

</body>

</html>
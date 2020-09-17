<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>menuGeneral.jsp</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Login</title>
      <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	  
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
   </head>
<body>
<nav class="navbar navbar-expand-sm bg-info navbar-dark fixed-top">
  <img src="images/bird.jpg" alt="Logo" style="width:40px;"><a class="navbar-brand" href="#">&nbsp;Veterinaria</a> 
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <s:url action="altaIni" var="altaLink"></s:url>
		<a class="nav-link" href="${altaLink}">Alta de usuarios</a>
      </li>
      <li class="nav-item">
        <s:url action="bajaIni" var="bajaLink"></s:url>
		<a class="nav-link" href="${bajaLink}">Baja de usuarios</a>
      </li>
      <li class="nav-item">
        <s:url action="cambioIni" var="cambioLink"></s:url>
		<a class="nav-link" href="${cambioLink}">Cambio de usuarios</a>
      </li>
  		<!-- Dropdown -->
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
          Consultas
        </a>
        <div class="dropdown-menu">
          <s:url action="consultaPIni" var="consultaPLink"></s:url>
		  <a class="dropdown-item" href="${consultaPLink}">Consulta Particular</a>
		  <s:url action="consultaGeneral" var="consultaGLink"></s:url>
		  <a class="dropdown-item" href="${consultaGLink}">Consulta General</a>
        </div>
      </li>   
    </ul>
  </div>  
</nav>
</body>
</html>
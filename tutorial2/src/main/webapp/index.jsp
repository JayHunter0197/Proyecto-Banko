<%@ page language = "java" contentType = "text/html; charset = UTF-8"
   pageEncoding = "UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
   <head>
   <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Login</title>
      <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 	  <link rel="stylesheet" href="styles/login.css">
   </head>
   
   <body>
   <div class="login-form">
      <s:form action="loginaction" method="post">
      <div class="avatar"><i class="material-icons">&#xE7FF;</i></div>
      <h2 class="text-center">Sign in</h2>
      	<div class="form-group">
        	<div class="input-group">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
         		<s:textfield name = "usuario.usuario" cssClass="form-control" id="uname" placeholder="Username" required="true"/>
         	</div>
         </div>
         <div class="form-group">
            <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>   
         		<s:password name = "usuario.password" cssClass="form-control" id="pwd" placeholder="Password" required="true"/>
         	</div>
         </div>		
         <s:submit label="Login" cssClass="btn btn-primary login-btn btn-block"/>	
      </s:form>
   </div>         
   </body>
</html>
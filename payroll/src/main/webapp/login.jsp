<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll System - Login</title>

<!-- Bootstrap -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="css/style.css" rel="stylesheet" media="screen">
</head>
<body style="background: url(http://www.liadvantage.com/wp-content/uploads/2013/03/adv_bg.jpg) no-repeat center center fixed;  -webkit-background-size: cover; -moz-background-size: cover; -o-background-size: cover; -o-background-size: cover;">

	<div class="container">
		<div style="padding-top: 11em;">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-default ">
					<div class="panel-heading">
						<h2>Login</h2>
					</div>
					<div class="panel-body">
						<form class="form-horizontal">
						  <div class="form-group">
						    <label for="inputUsername" class="col-sm-3 control-label">Username</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" id="inputUsername" name="inputUsername" placeholder="Username">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputPassword" class="col-sm-3 control-label">Password</label>
						    <div class="col-sm-9">
						      <input type="password" class="form-control" id="inputPassword" name="inputPassword" placeholder="Password">
						    </div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-2 col-sm-8">
						      <button type="submit" class="btn btn-primary btn-block">Sign in</button>
						    </div>
						  </div>
						</form>
					</div>
				</div>


			</div>
		</div>
	</div>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
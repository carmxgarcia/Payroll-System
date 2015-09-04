<%@page import="org.ideyatech.payroll.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll System - Edit Employee</title>

<!-- Bootstrap -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="css/style.css" rel="stylesheet" media="screen">
</head>
<body>

	<!-- NavBar -->
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Payroll</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="#">Home</a></li>
					<li class="active"><a href="/user">Employees</a></li>
					<li><a href="/cutoff">Cutoffs</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- /NavBar -->
	
	<!-- BreadCrumb -->
	<div class="container">
		<ol class="breadcrumb">
			<li><a href="/user">Employees</a></li>
		  	<li class="active">Edit Employee</li>
		</ol>
	</div>
	<!-- /BreadCrumb -->
	

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="panel-title"><h2>Edit Employee</h2></div>
			</div>
			
			<% User user = (User)request.getAttribute("users"); 
			
			%>
			
			<div class="panel-body">
			    <form method="post" action="/edit">
					<input type="hidden" name="userId" value="<%=user.getId()%>">
					<div class="form-horizontal">
						<div class="form-group">
							<div class="form-inline">
								<label for="inputFirstName" class="col-sm-2 control-label">Name</label>
								<input type="text" class="form-control" name="inputFirstName" id="inputFirstName" placeholder="First Name" value="<%out.println(user.getFirstName());%>">
								<% if(user.getMiddleName()==null) user.setMiddleName(""); %>
								<input type="text" class="form-control" name="inputMiddleName" id="inputMiddleName" placeholder="Middle Name" value="<%out.println(user.getMiddleName());%>">
								<input type="text" class="form-control" name="inputLastName" id="inputLastName" placeholder="Last Name" value="<%out.println(user.getLastName());%>">
							</div>
						</div>
						<div class="form-group">
							<div class="form-inline">
								<label for="inputAge" class="col-sm-2 control-label">Age</label>
								<% int age = user.getAge(); %>
								<input type="number" class="form-control" name="inputAge" id="inputAge" min="18" max="99" value="<%=age%>">
							</div>
						</div>
						
						<div class="form-group">
							<div class="form-inline">
								<label for="inputDependents" class="col-sm-2 control-label">Number of dependents</label>
								<% int dep = user.getNumberOfDependents(); %>
								<input type="number" class="form-control" name="inputDependents" id="inputDependents" min="0" max="99" value="<%=dep%>" >
							</div>
						</div>
						<hr/>
						<div class="form-group">
							<div class="form-inline">
								<label for="inputBasicSalary" class="col-sm-2 control-label">Basic Salary</label>
								<div class="input-group">
							    	<div class="input-group-addon">&#8369</div>
							      	<input type="text" class="form-control" id="inputBasicSalary" name="inputBasicSalary" placeholder="Amount" value="<%out.println(user.getBasicSalary());%>">
							      	<div class="input-group-addon">.00</div>
							    </div>
							</div>
						</div>
						<div class="form-group">
							<div class="form-inline">
								<label for="inputTaxable" class="col-sm-2 control-label">Taxable</label>
								<div class="input-group">
							    	<div class="input-group-addon">&#8369</div>
							      	<input type="text" class="form-control" id="inputTaxable" name="inputTaxable" placeholder="Amount" value="<%out.println(user.getOtherTaxable());%>">
							    </div>
							</div>
						</div>
						<div class="form-group">
							<div class="form-inline">
								<label for="inputNonTaxable" class="col-sm-2 control-label">Non-Taxable</label>
								<div class="input-group">
							    	<div class="input-group-addon">&#8369</div>
							      	<input type="text" class="form-control" id="inputNonTaxable" name="inputNonTaxable" placeholder="Amount" value="<%out.println(user.getNonTaxable());%>">
							    </div>
							</div>
						</div>
						<input type="submit" class="btn btn-default btn-primary btn-lg col-md-2 col-md-offset-10" value="Edit Employee"/>
						
					</div>
				</form>
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
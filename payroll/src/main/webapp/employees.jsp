<%@page import="org.ideyatech.payroll.entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll System - Employees</title>

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
					<li class="active"><a href="#">Employees</a></li>
					<li><a href="#">Cutoffs</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- /NavBar -->
	
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="panel-title"><h2>Employees</h2></div>
			</div>
			<div class="panel-body">
			    <div class="col-md-2 col-md-offset-10">
			    	<a href="addUser.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Add Employee</a>
			    </div>
			    <hr/>
			    <table class="table table-striped table-bordered table-condensed">
			    	<thead>
			    		<tr>
			    			<th class="col-id">id</th>
			    			<th>Name</th>
			    			<th>Age</th>
			    			<th>Sex</th>
			    			<th>Date of Birth</th>
			    			<th>Marital Status</th>
			    			<th>Basic Salary</th>
			    			<th>Taxable</th>
			    			<th>Non-Taxable</th>
			    			<th colspan="2"></th>
			    		</tr>
			    	</thead>
			    	<tbody>
			    		
			    		<% List<User> users = (List<User>)request.getAttribute("users"); 
							for(User u:users){
								
								if(u.getMiddleName()==null) u.setMiddleName("");
							%>
							<tr>
								<td class="td-id"><% out.println(u.getId()); %></td>
								<td><% out.println(u.getLastName()+", "+u.getFirstName()+" "+u.getMiddleName()); %></td>
								<td><% out.println(u.getAge()); %></td>
								<td><% out.println(u.getSex()); %></td>
								<td><% out.println(u.getDateOfBirth()); %></td>
								<td><% out.println(u.getMaritalStatus()); %></td>
								<td>Php <% out.println(u.getBasicSalary()); %></td>
								<td>Php <% out.println(u.getOtherTaxable()); %></td>
								<td>Php <% out.println(u.getNonTaxable()); %></td>
								<td><button type="button" class="btn btn-warning btn-xs btn-block">Edit</button></td>
			    				<td><button type="button" class="btn btn-danger btn-xs btn-block">Delete</button></td>
							</tr>
						<%	}
						
						%>
			    		
			    	</tbody>
			    </table>
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
<%@page import="org.ideyatech.payroll.entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll System - Cutoffs</title>

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
					<li><a href="/index.jsp">Home</a></li>
					<li><a href="/user">Employees</a></li>
					<li class="active"><a href="/cutoff">Cutoffs</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- /NavBar -->
	
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="panel-title"><h2>Cutoffs</h2></div>
			</div>
			<div class="panel-body">
				<form method="post" action="/generate">
				<div class="col-sm-4 col-sm-offset-4">
			    	<div class="form-horizontal">
			    		<div class="form-group">
			    			<div class="col-md-6 col-md-offset-3">
			    				<h3>Create Cutoff</h3>
			    			</div>
			    		</div>
						<div class="form-group">
							<div class="form-inline">
								<label for="inputStartDate" class="col-sm-4 control-label">Start Date</label>
								<input type="date" class="form-control" name="inputStartDate" id="inputStartDate">
							</div>
						</div>
						<div class="form-group">
							<div class="form-inline">
								<label for="inputEndDate" class="col-sm-4 control-label">End Date</label>
								<input type="date" class="form-control" name="inputEndDate" id="inputEndDate">
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-4 col-md-offset-4">
								<input type="submit" class="btn btn-primary btn-block" value="Generate">
							</div>
						</div>
					</div>
				</div>
				</form>
				<hr/>
			    <table class="table table-striped table-bordered table-condensed table-hover">
			    	<thead>
			    		<tr>
			    			<th class="col-id">id</th>
			    			<th>Start Date</th>
			    			<th>End Date</th>
			    			<th colspan="2"></th>
			    		</tr>
			    	</thead>
			    	<tbody>
			    		<tr>
			    			<td class="td-id">1</td>
			    			<td>04/20/1993</td>
			    			<td>09/03/2015</td>
			    			<td><button type="button" class="btn btn-warning btn-xs btn-block">View</button></td>
			    			<td><button type="button" class="btn btn-danger btn-xs btn-block">Delete</button></td>
			    		</tr>
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
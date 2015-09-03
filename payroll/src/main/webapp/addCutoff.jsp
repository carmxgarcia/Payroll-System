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
	
	<!-- BreadCrumb -->
	<div class="container">
		<ol class="breadcrumb">
			<li><a href="#">Cutoffs</a></li>
		  	<li class="active">Add Cutoff</li>
		</ol>
	</div>
	<!-- /BreadCrumb -->
	
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="panel-title"><h2>Add Cutoffs(DATE)</h2></div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<form action="">
					    <table class="table table-striped table-bordered table-condensed table-hover">
					    	<thead>
					    		<tr>
					    			<th class="col-id">id</th>
					    			<th>Name</th>
					    			<th>Absence</th>
					    			<th>Overtime</th>
					    			<th>Tardiness</th>
					    			<th>Pag-ibig</th>
					    			<th>Philhealth</th>
					    			<th>SSS</th>
					    			<th></th>
					    		</tr>
					    	</thead>
					    	<tbody>
					    		<tr>
					    			<td class="td-id">1</td>
					    			<td>Barcinal, Valen J.</td>
					    			<td><input type="number" class="form-control input-sm" name="inputAbsence" min="0" max="99" value="0"></td>
					    			<td><input type="number" class="form-control input-sm" name="inputOvertime" min="0" max="99" value="0"></td>
					    			<td><input type="number" class="form-control input-sm" name="inputTardiness" min="0" max="99" value="0"></td>
					    			<td><input type="text" class="form-control input-sm" name="inputPagibig" value="0"></div></td>
					    			<td><input type="text" class="form-control input-sm" name="inputPhilhealth" value="0"></td>
					    			<td><input type="text" class="form-control input-sm" name="inputOvertime" value="0"></td>
					    			<td><button type="button" class="btn btn-danger btn-xs btn-block">Delete</button></td>
					    		</tr>
					    	</tbody>
					    </table>
				    </form>
			    </div>
			    <hr/>
			    <input type="submit" class="btn btn-default btn-primary btn-lg col-md-2 col-md-offset-10" value="Update"/>
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
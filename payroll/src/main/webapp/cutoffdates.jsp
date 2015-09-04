<%@page import="org.ideyatech.payroll.entity.CutOff"%>
<%@page import="org.ideyatech.payroll.entity.UserCutOff"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll System</title>

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
					<li class="active"><a href="/index.jsp">Home</a></li>
					<li><a href="/user">Employees</a></li>
					<li><a href="/cutoff?id=">Cutoffs</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- /NavBar -->
	
	<!-- BreadCrumb -->
	<div class="container">
		<ol class="breadcrumb">
			<li><a href="/user">Employees</a></li>
		  	<li class="active">Employee's Payslips</li>
		</ol>
	</div>
	<!-- /BreadCrumb -->
	
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="panel-title">
					<h2>Payslips</h2>
				</div>
				<div class="panel-body">
				<table class="table table-striped table-bordered table-condensed table-hover">
			    	<thead>
			    		<tr>
			    			<th class="col-id">Payslips</th>
			    		</tr>
			    	</thead>
			    	<tbody>
						<% List<CutOff> cutoffs = (List<CutOff>)request.getAttribute("cutoffs");
						List<UserCutOff> usercutoffs = (List<UserCutOff>)request.getAttribute("usercutoffs");
						
							for(UserCutOff uc: usercutoffs){
						%>
							<tr>
								<td><h4><a href="/payslip?id=<%=uc.getId()%>"><%=uc.getCutOff().getStart_date()%> - <%=uc.getCutOff().getEnd_date()%></a></h4></td>
							</tr>
						<%
							}
						%>
					</tbody>
			    	</table>
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
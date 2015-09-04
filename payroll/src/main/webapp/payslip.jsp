<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll System - Payslip</title>

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
					<li class="active"><a href="/cutoffs">Cutoffs</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- /NavBar -->
	
	<!-- BreadCrumb -->
	<div class="container">
		<ol class="breadcrumb">
			<li><a href="#">Cutoffs</a></li>
			<li><a href="#">Update Cutoffs</a></li>
		  	<li class="active">Payslip</li>
		</ol>
	</div>
	<!-- /BreadCrumb -->
	

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="panel-title">
					<h2>Payslip</h2>
				</div>
			</div>
			<div class="panel-body">
			    <div class="table-responsive">
				    <table class="table">
						<thead>
							<tr class="info">
						    	<th colspan="4"><h4>EMPLOYEE DATA</h4></th>
						    </tr>
						</thead>
						<tbody>
							<tr>
								<td>
									<b>EMPLOYEE NAME</b><br/>
									<b>EMPLOYEE NUMBER</b><br/>
									<b>AGE</b><br/>
									<b>SEX</b><br/>
									<b>BIRTHDAY</b><br/>
									<b>MARITAL STATUS</b>
								</td>
								<td>
									Barcinal, Valen J.<br/>
									2015-0001<br/>
									21<br/>
									Male<br/>
									04/20/1993<br/>
									Single
								</td>
								<td>
									<b>PAY PERIOD</b><br/>
									<b>NO. OF DEPENDENTS</b><br/>
									<b>BASIC SALARY</b><br/>
									<b>OTHER TAXABLE INCOME</b><br/>
									<b>NON TAXABLE INCOME</b>
								</td>
								<td>
									04/20/1993 - 09/04/2015<br/>
									5<br/>
									20000.00<br/>
									0.00<br/>
									5000.00
								</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="table-responsive">
				    <table class="table">
						<thead>
							<tr class="info">
						    	<th colspan="4"><h4>EARNINGS</h4></th>
						    </tr>
						</thead>
						<tbody>
							<tr>
								<td>
									<b>BASIC PAY</b><br/>
									<b>OVERTIME</b><br/>
									<b>OTHER TAXABLE INCOME</b><br/>
									<b>NON TAXABLE INCOME</b><br/>
								</td>
								<td>
									<br/>
									8 <b>HRS</b>
								</td>
								<td></td>
								<td>
									10000.00<br/>
									909.09<br/>
									0.00<br/>
									2500.00<br/>
								</td>
							</tr>
							<tr class="success">
								<td colspan="2">
									<b>TOTAL EARNINGS</b>
								</td>
								<td><b>PHP</b></td>
								<td><b>13409.00</b></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="table-responsive">
				    <table class="table">
						<thead>
							<tr class="info">
						    	<th colspan="4"><h4>DEDUCTIONS</h4></th>
						    </tr>
						</thead>
						<tbody>
							<tr>
								<td>
									<b>SSS PREMIUM</b><br/>
									<b>PHILHEALTH PREMIUM</b><br/>
									<b>PAG-IBIG PREMIUM</b><br/>
									<b>LATE/TARDINESS</b><br/>
									<b>ABSENCES</b><br/>
									<b>WITHHOLDING TAX</b>
								</td>
								<td>
									<br/>
									<br/>
									<br/>
									1 <b>HRS</b><br/>
									1 <b>DAYS</b>
								</td>
								<td></td>
								<td>
									290.65<br/>
									125.00<br/>
									50.00<br/>
									113.64<br/>
									909.09<br/>
									1341.84
									
								</td>
							</tr>
							<tr class="success">
								<td colspan="2">
									<b>TOTAL DEDUCTIONS</b>
								</td>
								<td><b>PHP</b></td>
								<td><b>2630.22</b></td>
							</tr>
							<tr></tr>
						</tbody>
					</table>
				</div>
				<div class="table-responsive">
				    <table class="table">
						<thead>
							<tr class="info">
						    	<th><h3>NET PAY</h3></th>
						    	<th></th>
						    	<th><h3>PHP</h3></th>
						    	<th><h3>10578.78</h3></th>
						    </tr>
						</thead>
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
<%@page import="org.ideyatech.payroll.entity.UserCutOff"%>
<%@page import="org.ideyatech.payroll.entity.CutOff"%>
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
	
	<% UserCutOff usercutoff = (UserCutOff)request.getAttribute("usercutoff");
		CutOff cutoff = (CutOff)request.getAttribute("cutoff");
		User user = (User)request.getAttribute("user");
			double basicSalary = usercutoff.getBasicsalary();
			double othertaxable = usercutoff.getOthertaxable();
			double nontaxable = usercutoff.getNontaxable();
			float overtime = usercutoff.getOvertime();
			float tardiness = usercutoff.getTardiness();
			int absence = usercutoff.getAbsence();
			int dependents = (int)usercutoff.getNumberofdependents();
			double totalsalary = usercutoff.getTotalsalary();
			int sickleave = usercutoff.getSickleave();
			int vacationleave=usercutoff.getVacationleave();
			String middlename = user.getMiddleName()==null?"":user.getMiddleName();
			String fullname = user.getLastName() + ", "+ user.getFirstName() + middlename;
			%>
	
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="panel-title"><h2>Add Cutoff ( <%out.println(cutoff.getStart_date()); %>- <%out.println(cutoff.getEnd_date()); %>)</h2></div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<form action="">
					    <table class="table table-striped table-bordered table-condensed table-hover">
					    	<thead>
					    		<tr>
					    			<th class="col-id">id</th>
					    			<th>Name</th>
					    			<th>Absence<br/>(Days)</th>
					    			<th>Overtime<br/>(Hrs)</th>
					    			<th>Tardiness<br/>(Hrs)</th>
					    			<th>Basic Salary</th>
					    			<th>Other Taxable</th>
					    			<th>Non Taxable</th>
					    			<th>No. of Dependents</th>
					    			<th>SL</th>
					    			<th>VL</th>
					    			<th></th>
					    			<th></th>
					    		</tr>
					    	</thead>
					    	<tbody>
					    		<tr>
					    			<td class="td-id"><%out.println(usercutoff.getId());%></td>
					    			<td><%=fullname%></td>
					    			<td><input type="number" class="form-control input-sm" name="inputAbsence" min="0" max="99" value="<%=absence%>"></td>
					    			<td><input type="number" class="form-control input-sm" name="inputOvertime" min="0" max="99" value="<%=overtime%>"></td>
					    			<td><input type="number" class="form-control input-sm" name="inputTardiness" min="0" max="99" value="<%=tardiness%>"></td>
					    			<td><input type="number" class="form-control input-sm" name="inputBasicSalary" value="<%=basicSalary%>"></div></td>
					    			<td><input type="number" class="form-control input-sm" name="inputOtherTaxable" value="<%=othertaxable%>"></td>
					    			<td><input type="number" class="form-control input-sm" name="inputNonTaxable" value="<%=nontaxable%>"></td>
					    			<td><input type="number" class="form-control input-sm" name="inputNumberOfDependents" value="<%=dependents%>"></td>
					    			<td><input type="number" class="form-control input-sm" name="inputSickLeaves" value="<%=sickleave%>"></td>
					    			<td><input type="number" class="form-control input-sm" name="inputVacationLeaves" value="<%=vacationleave%>"></td>
					    			<td><button type="button" class="btn btn-danger btn-xs btn-block">Payslip</button></td>
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
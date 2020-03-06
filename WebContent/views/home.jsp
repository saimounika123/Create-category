<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <style>
	tr:nth-child(odd){background-color: #C0C0C0;}
	td:nth-child(even){color:blue;}
	</style> -->
</head>
<body style="background-color: #E5E8E8;">
	<center>
		<div id="header"></div>
		<div id="searchBox">
			<input type="text" />
			<button id="searchButton">Search</button>
		</div>
		<div id="companyBrandList">
			<h2>Company&Brand List</h2>
		</div>
		<table class="table-bordered table-striped">
			<tr>
				<th>S.No</th>
				<th>Brand Name</th>
				<th>Company Name</th>
			</tr>
			<tr>
				<c:foreach var="list" items="${list}">
					<td>${list.id}</td>
					<td>${list.brandName}</td>
					<td>${list.companyName}</td>
				</c:foreach>
			</tr>
			<tr>
		</table>
		<form action="index">
			<input type="submit" value="Back" id="back">
		</form>
	</center>
</body>
</html>
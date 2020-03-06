<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="MainProject.WebContent.css.main.css" />

</head>
<body>
	<center>
		<img src="logo" id="logo" />
		<h2>Register Company</h2>
		<form action="home">
			<p>
				<input type="text" name="companyName"
					placeholder="Enter Company Name" />
			</p>
			<p>
				<input type="text" name="brandName"
					placeholder="Enter Brand Name" /> <img src="addBrand" id="addBrand" />
			</p>
			<input type="submit" id="Register" value="Register" />
		</form>
	</center>
</body>

</html>
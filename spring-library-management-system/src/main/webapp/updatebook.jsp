<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BOOK - UPDATE</title>
</head>
<body bgcolor="pink">
	<h1 style="color:red;background-color:yellow">UPDATE BOOK DETAILS</h1>
	<form action="updatebook" method="get">
		ENTER ID NUMBER:<br> <input type="text" name="id"><br>
		ENTER BOOK NAME:<br> <input type="text" name="name"><br>
		ENTER AUTHOR NAME: <br> <input type="text" name="author"><br>
		<input type="submit" value="UPDATE BOOK">
	</form>
</html>
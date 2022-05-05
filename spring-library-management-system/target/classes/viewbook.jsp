<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BOOK - VIEW</title>
</head>
<body bgcolor="pink">
	<h1 style="color:red;background-color:yellow">VIEW BOOK DETAILS</h1>
	<form action="viewbook" method="get">
		ENTER ID NUMBER:<br> <input type="text" name="id"><br>
		<input type="submit" value="VIEW BOOK">
	</form>
	<br>
	<br>
	<form action="viewallbook" method="get">
		<input type="submit" value="VIEW ALL BOOKS">
	</form>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Product Id: ${myProduct.productId}<br><br>
	Product Name: ${myProduct.productName}<br><br>
	Product Cost: ${myProduct.productPrice}<br><br>
	Product DOM: ${myProduct.manufactured_Date}<br><br>
	
	<input type="text" value=${myProduct.productName}>
	<input type="text" value=${myProduct.productPrice}>
</body>
</html>
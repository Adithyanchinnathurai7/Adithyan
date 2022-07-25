<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sports Shop</title>
</head>
<body><center>
<h1>Sports Shop</h1>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="shop" value="Shop2">
<input type="radio" name="Bat" value="F1">Bat
<input type="radio" name="Ball" value="F2">Ball
<input type="radio" name="stemp" value="F3">stemp
<input type="submit" value="Next">
</form>
</center>
</body>
</html>
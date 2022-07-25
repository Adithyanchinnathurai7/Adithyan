<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shop2 Shop</title>
<hr>
<jsp:include page="logout.jsp"/>
<hr>
</head>
<body bgcolor="yellow"><center>
<h1>Shop2 Shop</h1>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="shop" value="Shop3">
<input type="radio" name="chese" value="F1">chese
<input type="radio" name="carrom" value="F2">carrom
<input type="radio" name="tennies" value="F3">tennies
<input type="submit" value="Next">
</form>
</center>
</body>
</html>
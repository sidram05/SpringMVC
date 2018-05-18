<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Order Confirmation Form</title>
<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>
<body>
	<br><br>
	The Order is placed: 
	<br><br>
	Product Name: ${order.prodName}
	<br><br>
	Customer Name: ${order.customerName}
	<br><br>
	Quantity: ${order.quantity}
	<br><br>	
</body>
</html>
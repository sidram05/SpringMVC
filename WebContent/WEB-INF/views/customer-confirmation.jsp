<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Customer Confirmation Form</title>
<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>
<body>
	<br><br>
	The Student is confirmed: ${customer.firstName} ${customer.lastName}
	<br><br>
	Customer ID: ${customer.id}
	<br><br>
	Email: ${customer.email}
	<br><br>
	State: ${customer.state}
	<br><br>
	Postal Code: ${customer.postalCode}
	<br><br>
	Country: ${customer.country}
	<br><br>	
</body>
</html>
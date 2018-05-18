<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/css/my-test.css">
<title>Order Form</title>
</head>
<body>
	<form:form action="processOrderForm" modelAttribute="order">
	Product Name: <form:input path="prodName" />
	<form:errors path="prodName" cssClass="error">
	</form:errors>
		<br>
		<br>
		
	Customer Name: <form:input path="customerName" />
		<br>
		<br>
		
	Quantity: <form:input path="quantity"/>
	<form:errors path="quantity" cssClass="error">
	</form:errors>
	<br>
	<br>
	
	<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
</body>
</html>
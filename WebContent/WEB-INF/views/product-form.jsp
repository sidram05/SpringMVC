<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Form</title>
</head>
<body>
	<form:form action="processProductForm" modelAttribute="student">
	Product Name: <form:input path="productName" />
	<form:errors path="productName" cssClass="error">
	</form:errors>
		<br>
		<br>
		
	Product Description: <form:input path="productDescription" />
		<br>
		<br>
		
	Price: <form:input path="price"/>
	<form:errors path="price" cssClass="error">
	</form:errors>
	<br>
	<br>
	
	<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
</body>
</html>
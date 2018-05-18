<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<title>Customer Registration Form</title>
	<style>
		.error {color:red}
	</style>
</head>
<body>
<i>Fill out the form. Asterisk (*) means required.</i>
	<form:form action="processForm" modelAttribute="student">
	First Name: <form:input path="firstName" />
		<br>
		<br>
	Last Name (*): <form:input path="lastName" />
	<form:errors path="lastName" cssClass="error">
	</form:errors>
		<br>
		<br>
		
	Email: <form:input path="email"/>
	<form:errors path="email" cssClass="error">
	</form:errors>
	<br>
	<br>
	
	State: <form:input path="state"/>
	<form:errors path="state" cssClass="error">
	</form:errors>
	<br>
	<br>
			
	Postal Code: <form:input path="postalCode"/>
	<form:errors path="postalCode" cssClass="error">
	</form:errors>
	
	<br>
	<br>
	
	Country: <form:select path="country">
				<form:options items="${student.countryOptions}"/>
			</form:select>
			
	<br>
	<br>
	
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
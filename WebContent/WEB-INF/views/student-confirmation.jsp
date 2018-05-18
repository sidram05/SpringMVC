<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation Form</title>
</head>
<body>
	<br><br>
	The Student is confirmed: ${student.firstName} ${student.lastName}
	<br><br>
	Email: ${student.email}
	<br><br>
	State: ${student.state}
	<br><br>
	Postal Code: ${student.postalCode}
	<br><br>
	Country: ${student.country}
	<br><br>	
</body>
</html>
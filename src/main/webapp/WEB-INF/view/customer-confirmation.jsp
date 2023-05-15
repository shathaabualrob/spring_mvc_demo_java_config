<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE /unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
			Customer Confirmation
		</title>
		<style>
			.error {color:red}
		</style>
	</head>
	<body>
		The customer is confirmed: ${customer.firstName} ${customer.lastName}
		<br><br>
		The number of free passes: ${customer.freePasses} 
		<br><br>
		Postal Code: ${customer.postalCode}
		<br><br>
		Course Code: ${customer.courseCode}
	</body>
</html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE /unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
			Customer Registration Form
		</title>
		<style>
			.error {color:red}
		</style>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="customer">
			First name: <form:input path="firstName"/>
			<br><br>
			Last name: <form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error"/>
			<br><br>
			Enter a value less than 0 and more than 10:
			<br><br>
			Free Passes: <form:input path="freePasses"/>
			<form:errors path="freePasses" cssClass="error"/>
			<br><br>
			PostalCode: <form:input path="postalCode"/>
			<form:errors path="postalCode" cssClass="error"/>
			<br><br>
			<input type="submit" value="Submit">
		
		</form:form>
	</body>
</html>
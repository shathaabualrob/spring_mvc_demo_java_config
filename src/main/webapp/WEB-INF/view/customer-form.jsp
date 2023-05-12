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
			
			<input type="submit" value="Submit">
		
		</form:form>
	</body>
</html>
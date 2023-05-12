<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<title>
			Student Registration Form
		</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First name: <form:input path="firstName"/>
			<br><br>
			Last name: <form:input path="lastName"/>
			<br><br>
			Country:
				<form:select path="country">
					<form:options items="${student.countryOptions }"/>
					<!-- 
						<form:option value="Brazil">Brazil</form:option>
						<form:option value="France">France</form:option>
						<form:option value="Germany">Germany</form:option>
						<form:option value="India">India</form:option>
					 -->
				</form:select>
			<br><br>
				Favorite Language:
				PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
				Java <form:radiobutton path="favoriteLanguage" value="Java"/>
				C# <form:radiobutton path="favoriteLanguage" value="C#"/>
				Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
			<br><br>
				Linux <form:checkbox path="operatingSystems" value="Linux"/>
				Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
				MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
			<br> <br>
			
			<input type="submit" value="Submit">
			
		</form:form>
	</body>
</html>

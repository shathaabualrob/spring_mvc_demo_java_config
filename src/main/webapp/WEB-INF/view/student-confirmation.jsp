<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<title>
			Student Confirmation
		</title>
	</head>
	<body>
		The student is confirmed: ${student.firstName } ${student.lastName }
		<br> <br>
		From the country: ${student.country }
		<!-- Both of those will call studnet.getFisrName()
				and student.getLastName() -->
		<br> <br>
		The student's prefers the language: ${student.favoriteLanguage }
		<br> <br>
		Operating System: ${student.operatingSystems }
	</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<title>Student Registration Form:</title>
</head>

<body>
	<form:form action ="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName"/>
	<br><br>
	Last Name: <form:input path="lastName"/>	
	<br><br>
	
	Country: <form:select path="country">
		<form:option value="India" label="India"></form:option>
		<form:option value="France" label="France"></form:option>
		<form:option value="Germany" label="Germany"></form:option>
		<form:option value="Brazil" label="Brazil"></form:option>
	</form:select>
	
	Operating System:
	 Linux <form:checkbox path="operatingSystems" value="Linux"/>
	 Windows <form:checkbox path="operatingSystems" value="Windows"/>
	 Mac <form:checkbox path="operatingSystems" value="Mac Os"/>
	 	
	
	<input type ="submit" value="Submit">
	
	</form:form>


</body>




</html>
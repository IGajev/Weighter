<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Weighter</title>
		<link rel="stylesheet"
			type="text/css"
			href="<c:url value="/resources/style.css" />" >
	</head>
	<body>
		<h1>Register</h1>
		
		<form method="POST">
			First Name: <input type="text" name="firstName" /><br/>
			Last Name: <input type="text" name="lastName" /><br/>
			User name: <input type="text" name="username" /><br/>
			Password: <input type="password" name="password" /><br/>
			Sex: 
				male<input type="radio" name="sex" value="male"/> 
				female<input type="radio" name="sex" value="female"/>
			<br/>
			Wrist: <input type="text" name="wrist" />cm<br/>
			Height: <input type="text" name="height" />cm<br/>
			Sport Factor: <br/>
			<input type="radio" name="sportFactor" value="0.5"/>	No training at all           <br/>
			<input type="radio" name="sportFactor" value="0.6"/>	Easy (walking)               <br/>
			<input type="radio" name="sportFactor" value="0.7"/>	Moderate(3 hours a week)     <br/>
			<input type="radio" name="sportFactor" value="0.8"/>	Active(5 hours a week)       <br/>
			<input type="radio" name="sportFactor" value="0.9"/>	Very active (10 hours a week)<br/>
			<input type="radio" name="sportFactor" value="1.0"/>	Ultimate(2 times a day)      <br/>
			<input type="submit" value="Register" />
		</form>
	</body>
</html>
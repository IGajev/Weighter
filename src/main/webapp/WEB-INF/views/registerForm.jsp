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
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />	
			First Name: <input type="text" name="firstName" /><br/>
			Last Name: <input type="text" name="lastName" /><br/>
			User name: <input type="text" name="username" /><br/>
			Password: <input type="password" name="password" /><br/>
			
			<script type="text/javascript">
			
			function maleFemaleCheck() {
			    if (document.getElementById('maleCheck').checked) {
			        document.getElementById('ifMale').style.display = 'block';
			    	document.getElementById('ifFemale').style.display = 'none';
			    }
			    else {
			    	document.getElementById('ifMale').style.display = 'none';
			    	document.getElementById('ifFemale').style.display = 'block';
			    }
			}
			</script>
			
			Sex: 
				male<input type="radio" onclick="javascript:maleFemaleCheck();" name="sex" value="male" id="maleCheck" checked="true"/> 
				female<input type="radio" onclick="javascript:maleFemaleCheck();" name="sex" value="female" id="femaleCheck"/>
			<br/>
			<div id="ifMale" style="display:block">
		         Wrist: <input type="text" name="wrist"/>cm<br/>
			 </div>
			<div id="ifFemale" style="display:none">
		         Height: <input type="text" name="height"/>cm<br/>
			 </div>
			
			Sport Factor: <br/>
			<input type="radio" name="sportFactor" value="0.5" checked="true"/>	No training at all           <br/>
			<input type="radio" name="sportFactor" value="0.6"/>	Easy (walking)               <br/>
			<input type="radio" name="sportFactor" value="0.7"/>	Moderate(3 hours a week)     <br/>
			<input type="radio" name="sportFactor" value="0.8"/>	Active(5 hours a week)       <br/>
			<input type="radio" name="sportFactor" value="0.9"/>	Very active (10 hours a week)<br/>
			<input type="radio" name="sportFactor" value="1.0"/>	Ultimate(2 times a day)      <br/>
			<input type="submit" value="Register" /><br/>
		</form>
		Already Registered?
		<a href="<c:url value="/profile" />">Login</a>
	</body>
</html>
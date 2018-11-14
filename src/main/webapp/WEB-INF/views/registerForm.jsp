<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
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
		
		<sf:form method="POST" commandName="weighter">
			First Name: <sf:input path="firstName" />
				<sf:errors path="firstName" cssClass="error"/>
					<br/>
			Last Name: <sf:input path="lastName" />
				<sf:errors path="lastName" cssClass="error"/>
				<br/>
			User name: <sf:input path="username" />
				<sf:errors path="username" cssClass="error"/>
					<br/>
			Password: <sf:password path="password" />
				<sf:errors path="password" cssClass="error"/>
					<br/>
			
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
				male<sf:radiobutton onclick="javascript:maleFemaleCheck();" path="sex" value="male" id="maleCheck" checked="true"/> 
				female<sf:radiobutton onclick="javascript:maleFemaleCheck();" path="sex" value="female" id="femaleCheck"/>
			<br/>
			<div id="ifMale" style="display:block">
		         Wrist: <sf:input path="wrist"/>cm
		         	<sf:errors path="wrist" cssClass="error"/>
		         		<br/>
			 </div>
			<div id="ifFemale" style="display:none">
		         Height: <sf:input path="height"/>cm
		         	<sf:errors path="height" cssClass="error"/>
		         		<br/>
			 </div>
			
			Sport Factor: <br/>
			<sf:radiobutton path="sportFactor" value="0.5" checked="true"/>	No training at all           <br/>
			<sf:radiobutton path="sportFactor" value="0.6"/>	            Easy (walking)               <br/>
			<sf:radiobutton path="sportFactor" value="0.7"/>	            Moderate(3 hours a week)     <br/>
			<sf:radiobutton path="sportFactor" value="0.8"/>	            Active(5 hours a week)       <br/>
			<sf:radiobutton path="sportFactor" value="0.9"/>	            Very active (10 hours a week)<br/>
			<sf:radiobutton path="sportFactor" value="1.0"/>	            Ultimate(2 times a day)      <br/>
			<sf:errors path="sportFactor" cssClass="error"/>
			<input type="submit" value="Register"/><br/>
		</sf:form>
		Already Registered?
		<a href="<c:url value="/profile" />">Login</a>
	</body>
</html>
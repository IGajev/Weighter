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
		<h1>Dear user, you are logged in as:</h1>
			<div class="weighter"><c:out value="${weighter.firstName}" /></div>
			<div class="weighter"><c:out value="${weighter.lastName}" /></div>
		<br/>
		<h2>You don't have any measures in our database! </h2>
		<h2>Please add at least one measure to start the process!</h2>
		<sf:form method="POST" commandName="measure">
			Weight:<sf:input path="weight"/>kg
				<sf:errors path="weight" cssClass="error"/>
					<br/>
		<script type="text/javascript">
		function maleFemaleCheck() {
			var sex = "${weighter.sex}";
			var compare = "male"
			if (sex == "male") {
		        document.getElementById('ifMale').style.display = 'block';
		    	document.getElementById('ifFemale').style.display = 'none';
		    }
		    else if (sex == "female"){
		    	document.getElementById('ifMale').style.display = 'none';
		    	document.getElementById('ifFemale').style.display = 'block';
		    }
		}
		</script>
		<div id="ifMale" style="display:none">
	         Waist: <sf:input path="waist"/>cm
	         	<sf:errors path="waist" cssClass="error"/>
	         		<br/>
		</div>
		<div id="ifFemale" style="display:none">
	         Hips: <sf:input path="hips"/>cm
	         	<sf:errors path="hips" cssClass="error"/>
	         		<br/>
		</div>
		<input type="submit" value="Submit Data"/><br/>
		</sf:form>
		<form method="POST" action="${pageContext.request.contextPath}/logout" id="form-logout">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />	
			<input type="submit" value="Log Out" /><br/>
		</form>
    <script>
    	maleFemaleCheck();
    </script>
	</body>
</html>


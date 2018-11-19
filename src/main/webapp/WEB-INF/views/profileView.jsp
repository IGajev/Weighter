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
		<script type="text/javascript">
		function displayCheck() {
			var sex = "${weighter.sex}";
			var lastWeight = "${lastMeasure.weight}";
			
			if (sex == "male") {
		        document.getElementById('ifMale').style.display = 'block';
		    	document.getElementById('ifFemale').style.display = 'none';
		    }
		    else if (sex == "female"){
		    	document.getElementById('ifMale').style.display = 'none';
		    	document.getElementById('ifFemale').style.display = 'block';
		    }
			if( lastWeight == 0 ) {
				document.getElementById('ifNull').style.display = 'block';
				document.getElementById('notNull').style.display = 'none';
			}
			else {
				document.getElementById('ifNull').style.display = 'none';
				document.getElementById('notNull').style.display = 'block';
			}
		}
		</script>
		<div id="ifNull" style="display:none">
			<h2>You don't have any measures in our database! </h2>
			<h2>Please add at least one measure to start the process!</h2>
		</div>
		<div id="notNull" style="display:none">
			<h2>Great your last weight measurement is: </h2>
			<div class="lastMeasure"><c:out value="${lastMeasure.weight}" /></div>
		</div>
		<sf:form method="POST" commandName="measure">
			Weight:<sf:input path="weight"/>kg
				<sf:errors path="weight" cssClass="error"/>
					<br/>
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
    displayCheck();
    </script>
	</body>
</html>


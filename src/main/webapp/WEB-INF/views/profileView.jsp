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
		<h1>Dear ${weighter.firstName}, you are logged in as: ${weighter.username} !</h1>
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
			<h2>${weighter.firstName}, add at least one measure to start the process!</h2>
		</div>
		<div id="notNull" style="display:none">
			<h2> Your data </h2>
			<h3> Your last weight measure is ${lastMeasure.weight}</h3>
			<jsp:include page="drawPlots.jsp" />
		</div>
		<h2>Post new measure ...</h2>
		<sf:form method="POST" commandName="measure">
			Weight:<sf:input path="weight"/>kg
				<sf:errors path="weight" cssClass="error"/>
					<br/>
	        Waist: <sf:input path="waist"/>cm
	         	<sf:errors path="waist" cssClass="error"/>
	         		<br/>
			<div id="ifMale" style="display:none">
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


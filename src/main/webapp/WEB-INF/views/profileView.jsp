<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Weighter</title>
		<link rel="stylesheet"
			type="text/css"
			href="<c:url value="/resources/css/style.css" />" >
		<link rel="stylesheet"
			type="text/css"
			href="<c:url value="/resources/css/bootstrap.min.css" />" >
		<script type="text/javascript">
		function displayCheck() {
			var sex = "${weighter.sex}";
			var lastWeight = "${lastMeasure.weight}";
			var goalCalculated = "${requiredWeight}";
			
			if (sex == "female") {
		        document.getElementById('ifGrownUp').style.display = 'block';
		    	document.getElementById('ifFemale').style.display = 'block';
		        document.getElementById('Fats').style.display = 'block';
		    	document.getElementById('femaleCard').style.display = 'block';
		    }
			else if (sex == "male") {
		        document.getElementById('ifGrownUp').style.display = 'block';
		        document.getElementById('Fats').style.display = 'block';
		    	document.getElementById('maleCard').style.display = 'block';
		    } else {
		    	document.getElementById('childCard').style.display = 'block';
		    }
			if( lastWeight == 0 ) {
				document.getElementById('ifNull').style.display = 'block';
			}
			else {
				document.getElementById('notNull').style.display = 'block';
				document.getElementById('showGraphs').style.display = 'block';
			}
			if ( goalCalculated > 0 ) {
				document.getElementById('goalCalculated').style.display = 'block';
			} 
		}
		</script>
	</head>
	<body>
		<div class="container">
			<div class="jumbotron text-center">
				<h1>Weighter</h1>
				<a href="<c:url value="/homepage" />">Home</a> |
				<a href="<c:url value="/register" />">Register</a>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<h2>Post new measure ...</h2>
					<br/>
					<sf:form method="POST" commandName="measure">
						Weight:<sf:input path="weight"/>kg
							<sf:errors path="weight" cssClass="error"/>
								<br/>
						<div id="ifGrownUp" style="display:none">
					        Waist  : <sf:input path="waist"/>cm
					         	<sf:errors path="waist" cssClass="error"/>
					         		<br/>
						</div>
						<div id="ifFemale" style="display:none">
					        Hips    : <sf:input path="hips"/>cm
					         	<sf:errors path="hips" cssClass="error"/>
					         		<br/>
						</div>
						<input type="submit" value="Submit Data"/><br/>
					</sf:form>
					<div id="ifNull" style="display:none">
						<h2>You don't have any measures in our database! </h2>
						<h2>${weighter.firstName}, add at least one measure to start the process!</h2>
					</div>
					<div id="notNull" style="display:none">
						<h2> ${weighter.firstName}'s data: </h2>
						<br/>
						<h4> Last weight ${lastMeasure.weight} [kg]</h4>
						<div id="goalCalculated" style="display:none">
							<h4> Required weight ${requiredWeight} [kg]</h4>
							<h4> Required fats ${requiredFatsPercent} [%]</h4>
							<h4> Daily protein needs ${dailyProteinRequirementGrams} [g]</h4>
							<h4> Daily protein needs ${dailyProteinRequirementBlocks} [blocks]</h4>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div id="childCard" style="display:none">
						<div class="card" style="width:400px">
						  <img class="card-img-top" src="/Weighter/resources/png/img_avatar7.png" alt="Card image">
						  <div class="card-body">
						    <h4 class="card-title">${weighter.firstName} ${weighter.lastName}</h4>
						    <p class="card-text">You are logged in as: ${weighter.username} <br/> <a href="<c:url value="/profile/update" />">Update Profile</a></p>
						  </div>
						</div>
					</div>
					<div id="femaleCard" style="display:none">
						<div class="card" style="width:400px">
						  <img class="card-img-top" src="/Weighter/resources/png/img_avatar5.png" alt="Card image">
						  <div class="card-body">
						    <h4 class="card-title">${weighter.firstName} ${weighter.lastName}</h4>
						    <p class="card-text">You are logged in as: ${weighter.username} <br/> <a href="<c:url value="/profile/update" />">Update Profile</a></p>
						  </div>
						</div>
					</div>
					<div id="maleCard" style="display:none">
						<div class="card" style="width:400px">
						  <img class="card-img-top" src="/Weighter/resources/png/img_avatar1.png" alt="Card image">
						  <div class="card-body">
						    <h4 class="card-title">${weighter.firstName} ${weighter.lastName}</h4>
						    <p class="card-text">You are logged in as: ${weighter.username} <br/> <a href="<c:url value="/profile/update" />">Update Profile</a></p>
						  </div>
						</div>
					</div>
				<form method="POST" action="${pageContext.request.contextPath}/logout" id="form-logout">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />	
					<input type="submit" value="Log Out" />
				</form>
				</div>
			</div>
			<div id="showGraphs" style="display:none">
			<br/>
			<br/>
				<jsp:include page="drawPlots.jsp" />
			</div>
		</div>
		<br/>
		<br/>
		<h6 align="center">Weighter - All rights reserved</h6>
	    <script>
	    displayCheck();
	    </script>
	</body>
</html>


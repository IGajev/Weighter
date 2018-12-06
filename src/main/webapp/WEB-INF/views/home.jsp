<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	</head>
	<body>
		<div class="container">
			<div class="jumbotron text-center">
				<h1>Welcome to Weighter</h1>
				<a href="<c:url value="/profile" />">Profile</a> |
				<a href="<c:url value="/register" />">Register</a>
			</div>
			<h5>This is the ultimate weighting machine.
			It keeps track of your weight and fat percent measurements.
			The data you post will be stored forever.
			You can post measures whenever you want, as much as you want.
			If you are a grown up fats percent are calculated based on your waist, wrist, height, and hips(male/female dependent).
			The weighting machine is perfect for keeping track of your child's weight increase.
			However, fats percent feature is available only for a grown up.
			The calculations are performed according to the ZONE diet.</h5>
			<br/>
			<br/>
			<h5>What are you waiting for? Go ahead and <a href="<c:url value="/register" />">register</a>.</h5>
			<br/>
			<br/>
			<h5>If you are already a registered user, go straight to your <a href="<c:url value="/profile" />">profile</a>.</h5>
		</div>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<h6 align="center">Weighter - All rights reserved</h6>
	</body>
</html>


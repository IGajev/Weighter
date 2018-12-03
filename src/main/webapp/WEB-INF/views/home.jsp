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
		</div>
	</body>
</html>


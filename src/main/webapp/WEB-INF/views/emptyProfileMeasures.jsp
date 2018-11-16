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
		<h1>Dear user, you are logged in as:</h1>
			<div class="weighter"><c:out value="${weighter.firstName}" /></div>
			<div class="weighter"><c:out value="${weighter.lastName}" /></div>
		<br/>
		<h2>You don't have any measures in our database! </h2>
		<h2>Please add at least one measure to start the process!</h2>
		<form method="POST" action="${pageContext.request.contextPath}/logout" id="form-logout">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />	
			<input type="submit" value="Log Out" /><br/>
		</form>
	</body>
</html>


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
		<h1>Oh crap! Something's not right ...</h1>
		<a href="<c:url value="/homepage" />">Send me home ...</a> |
		<a href="<c:url value="/profile" />">Profile</a> |
	</body>
</html>


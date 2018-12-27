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
    </head>
    <body>
		<div class="container">
			<div class="jumbotron text-center">
				<h1>Weighter</h1>
				<a href="<c:url value="/homepage" />">Home</a> |
				<a href="<c:url value="/profile" />">Profile</a>
			</div>
			<div class="row">
				<div class="col-sm-6">
			        <h2>Register</h2>
			        
			        <sf:form method="POST" commandName="generalWeighter">
			            First Name: <sf:input path="firstName" />
			                <sf:errors path="firstName" cssClass="error"/>
			                    <br/>
			            Last Name: <sf:input path="lastName" />
			                <sf:errors path="lastName" cssClass="error"/>
			                <br/>
			            User name: <sf:input path="username" />
			                <sf:errors path="username" cssClass="error"/>
			                    <br/>
			            Password  : <sf:password path="password" />
			                <sf:errors path="password" cssClass="error"/>
			                    <br/>
			            
			            <script type="text/javascript">
			            
			            function maleFemaleCheck() {
			                if (document.getElementById('maleCheck').checked) {
			                    document.getElementById('ifMale').style.display = 'block';
			                    document.getElementById('ifFemale').style.display = 'none';
			                    document.getElementById('ifNotChild').style.display = 'block';
			                }
			                else if (document.getElementById('femaleCheck').checked) {
			                    document.getElementById('ifMale').style.display = 'none';
			                    document.getElementById('ifFemale').style.display = 'block';
			                    document.getElementById('ifNotChild').style.display = 'block';
			                }
			                else {
			                    document.getElementById('ifMale').style.display = 'none';
			                    document.getElementById('ifFemale').style.display = 'none';
			                    document.getElementById('ifNotChild').style.display = 'none';
			                }
			            }
			            </script>
			            
			            Gender: 
			                child<sf:radiobutton onclick="javascript:maleFemaleCheck();" path="sex" value="child" id="childCheck"/>
			                male<sf:radiobutton onclick="javascript:maleFemaleCheck();" path="sex" value="male" id="maleCheck"/> 
			                female<sf:radiobutton onclick="javascript:maleFemaleCheck();" path="sex" value="female" id="femaleCheck"/>
			                <sf:errors path="sex" cssClass="error"/>
			            <br/>
			            <div id="ifMale" style="display:none">
			                Wrist : <sf:input path="wrist"/>cm
			                     <sf:errors path="wrist" cssClass="error"/>
			                         <br/>
			            </div>
			            <div id="ifFemale" style="display:none">
			                Height: <sf:input path="height"/>cm
			                     <sf:errors path="height" cssClass="error"/>
			                         <br/>
			            </div>
			             <div id="ifNotChild" style="display:none">
				            Sport Factor: <br/>
				            <sf:radiobutton path="sportFactor" value="0.5" checked="true"/>    No training at all           <br/>
				            <sf:radiobutton path="sportFactor" value="0.6"/>                Easy (walking)               <br/>
				            <sf:radiobutton path="sportFactor" value="0.7"/>                Moderate(3 hours a week)     <br/>
				            <sf:radiobutton path="sportFactor" value="0.8"/>                Active(5 hours a week)       <br/>
				            <sf:radiobutton path="sportFactor" value="0.9"/>                Very active (10 hours a week)<br/>
				            <sf:radiobutton path="sportFactor" value="1.0"/>                Ultimate(2 times a day)      <br/>
				            <sf:errors path="sportFactor" cssClass="error"/>
			            </div>
			            <input type="submit" value="Register"/><br/>
			        </sf:form>
				</div>
		        <div class="col-sm-6">
			        <h2>Already Registered?</h2>
			        <h4>Go straight to your profile page ...</h4>
			        <a href="<c:url value="/profile" />">Login now!</a>
		        </div>
			</div>
		</div>
		<h6 align="center">Weighter - All rights reserved</h6>
		<script>
			maleFemaleCheck();
		</script>
    </body>
</html>
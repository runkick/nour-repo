<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<link rel="stylesheet" href="../css/screen.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Identification</title>
</head>
<body>

<c:if test="${ not empty errorMessage}" >

<p>${errorMessage}</p>
</c:if>



<div class="ident">


<form:form commandName="pronostiqueur" style="padding:8px">

<p> 
	Email <br/>
	<form:input path="email"/>
</p>

<p> 
	Mot de passe <br/>
	<form:input path="mdp"/>
</p>

 <input type="submit" value="Connexion"/>
</form:form>

</div>
</body>
</html>
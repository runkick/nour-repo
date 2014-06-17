
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creation de Compte</title>
</head>
<body>

<form:form commandName="pronostiqueur" action="creationCompte" style="padding:8px">
    <p>
        First Name<br/>
        <form:input path="nom"/>
    </p>
    <p>
        Last Name<br/>
        <form:input path="prenom"/>
    </p>
    <p>
        Email <br/>
        <form:input  path="email"/>
    </p>
    
    
        Mot de passe<br/>
        <form:input type="password" path="mdp" />
    </p>
    
    <input type="submit" value="Save"/>
</form:form>


</body>
</html>
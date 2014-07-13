<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/screen.css" type="text/css" />

<title>Insert title here</title>
</head>
<body>



	<h3>Bonjour ${playeur.nom}</h3>

	<c:forEach items="${groupes}" var="groupe" varStatus="groupeLoop">
		<div class="groupe">
			<p class="groupe-header">Groupe ${groupe.id}</p>
			<table class="dataTable">
				<c:forEach items="${groupe.matchs}" var="match"
					varStatus="matchLoop">
					<tr>
						<td><p>${match.equipe1.nom}-${match.equipe2.nom}</p></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</c:forEach>


	<!--<span>Groupe A</span>
	
	
	
	<table class="PouleMatch">
		<tbody>



			<form:form  style="padding:8px" method="POST" commandName="pronosBean" >
				<tr class="match 1">
					<td class="eq1">Bresil</td>
					<td class="drap1">
						<div class="drap BRE"></div>
						</div> 
					</td>
	 	 	 				<td class="score">
					
					<form:input type="text" path="pronos1" id="score1" class="score" size="1" maxlength="1" value="0" />
					<form:input type="text"  path="pronos2" id="score2" class="score" size="1" maxlength="1" value="0" /></td>
					<td class="drap2" >
						<div class="drap CRO"></div>
						</div>
					</td>
					<td class="eq2">Croatie</td>
				</tr>


<input type="submit" value="Enregistrer"/>

			</form:form>


-->


</body>
</html>
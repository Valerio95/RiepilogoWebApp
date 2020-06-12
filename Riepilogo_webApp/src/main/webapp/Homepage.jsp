
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


<head>
<meta charset="ISO-8859-1">
<title></title>
</head>

<body>
	<div class="center">

		<%
			String messaggio = (String) request.getAttribute("mess");
		if (messaggio != null) {
		%>
		<h1 style="color: red;"><%=messaggio%></h1>

		<%
			}
		%>

		<h1>Benvenuto!</h1>

		


		

		<br> <br>Clicca qui per accedere al database <br> <br>
		<form action="Accesso" method="post">
			<input type="submit"  name="scelta"
				value="Accedi al database" />
		</form>
	</div>
</body>
</html>
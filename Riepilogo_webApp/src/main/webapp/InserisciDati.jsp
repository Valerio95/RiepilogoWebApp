<%@page import="java.util.List"%>
<%@page import="it.dstech.modelli.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
		List<Persona> listaUtenti = (List<Persona>) request.getAttribute("listaUtenti");
		
	%>
	
	
	<form action="Accesso" method="post">
			
				<label for="nome">Nome:</label><br> <input type="text"
					required="required" name="nome" placeholder="Nome"><br>
				<label for="cognnome">Cognome:</label><br> <input type="text"
					required="required" name="cognome" placeholder="Cognome"><br>
                <label for="codice">Codice:</label><br> <input type="number"
					required="required" name="codice" placeholder="Codice"><br>
			<input type="submit"  class="button"
				name="scelta" value="Inserisci" />
		</form>
	<table >

					<tr>
					<th><h5>
								Id
							</h5></th>
						<th><h5>
								Nome
							</h5></th>
						<th><h5>
								Cognome
							</h5></th>
						<th><h5>
								codice
							</h5></th>
						

						
					</tr>

					<%
						for (Persona persona : listaUtenti) {
					%>
					<tr>
						<td><h5>
								
									<%=persona.getId()%>
								
							</h5></td>
						<td><h5>
								
									<%=persona.getNome()%>
								
							</h5></td>
						

						<td><h5>
									<%=persona.getCognome()%>
							</h5></td>
                           <td><h5>
									<%=persona.getCodice()%>
							</h5></td>
						<%}%>

				</table>
				<form action="Accesso" method="post">
			
				
			<input type="submit"  class="button"
				name="scelta" value="Torna indietro" />
		</form>
	</body>
</html>
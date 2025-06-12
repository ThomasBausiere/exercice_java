<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.exercice_05.model.Dog" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<jsp:useBean id="dogs" type="java.util.List<org.example.exercice_05.model.Dog>" scope="request" />

<html>
<head>
    <title>Liste des chiens</title>
</head>
<body>

<h2>Liste des chiens</h2>

<% if (dogs.isEmpty()) { %>
<p>Il n'y a pas encore de chien enregistré.</p>
<% } else { %>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Race</th>
        <th>Date de naissance</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <% for (Dog dog : dogs) { %>
    <tr>
        <td><%= dog.getId() %></td>
        <td><%= dog.getDogName() %></td>
        <td><%= dog.getRaceName() %></td>
        <td><%= dog.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) %></td>
        <td>
            <form method="get" action="detail">
                <input type="hidden" name="id" value="<%= dog.getId() %>" />
                <button type="submit">Détail</button>
            </form>
        </td>
    </tr>
    <% } %>
    </tbody>
</table>
<% } %>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.exercice_05.model.Dog" %>
<%@ page import="java.time.format.DateTimeFormatter" %>

<jsp:useBean id="dog" type="org.example.exercice_05.model.Dog" scope="request" />

<html>
<head>
    <title>Détail du chien</title>
</head>
<body>

<h2>Détails du chien</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <td><%= dog.getId() %></td>
    </tr>
    <tr>
        <th>Nom</th>
        <td><%= dog.getDogName() %></td>
    </tr>
    <tr>
        <th>Race</th>
        <td><%= dog.getRaceName() %></td>
    </tr>
    <tr>
        <th>Date de naissance</th>
        <td><%= dog.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) %></td>
    </tr>
</table>

<br>
<a href="<%= request.getContextPath() %>/dog/show-all">← Retour à la liste</a>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.exercice_05.model.Dog" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<jsp:useBean id="dogs" type="java.util.List<org.example.exercice_05.model.Dog>" scope="request" />

<html>
<head>
    <title>Liste des chiens</title>
    <%@include file="/style/importCss.jsp"%>
</head>
<body>

<h2>- Dogs List -</h2>

<% if (dogs.isEmpty()) { %>
<p>There is no Dog already.</p>
<% } else { %>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Race</th>
        <th>Date of birth</th>
        <th>Actions</th>
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
<a class="add" href="add"> Add a Dog </a>

</body>
</html>

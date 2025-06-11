<%@ page import="org.example.exercice_01.entity.Personne" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="personnes" type="java.util.List<org.example.exercice_01.entity.Personne>" scope="request"/>

<html>
<head>
    <title>Exercice n°3</title>
    <%@include file="WEB-INF/monStyle.jsp"%>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>Nom</th>
        <th>Prénom</th>
        <th>Âge</th>
    </tr>
    </thead>

    <tbody>
        <% for (Personne personne : personnes ){ %>
        <tr>
            <td><%= personne.getName() %> </td>
            <td><%= personne.getFirstname() %> </td>
            <td><%= personne.getAge() %> </td>

        </tr>
        <% } %>
    </tbody>
</table>

</body>
</html>

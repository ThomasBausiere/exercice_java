<%@ page import="org.example.exo4.model.Cat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="cats" type="java.util.List<org.example.exo4.model.Cat>" scope="request"/>
<html>
<head>
    <title>Cat Page</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
</head>
<body>
<% if (cats.isEmpty() ){ %>
<h2> There is no cat already</h2>
<% } else {%>
<table>
    <thead>
    <tr>
        <th>Cat's name</th>
        <th>The race</th>
        <th>Food</th>
        <th>Birth date</th>
    </tr>
    </thead>

    <tbody>

    <% for (Cat cat : cats ){ %>
    <tr>
        <td><%= cat.getCatName() %> </td>
        <td><%= cat.getRaceName() %> </td>
        <td><%= cat.getFavoriteFood() %> </td>
        <td><%= cat.getBirthDate() %> </td>
    </tr>
    <% } }%>
    </tbody>
</table>

<form action="form" method="post">
    <h2>Form to add a cat</h2>
    <div>
        <label for="catname">Cat name: </label>
        <input type ="text" name="catname" id="catname">
    </div>
    <div>
        <label for="racename">Race name: </label>
        <input type ="text" name="racename" id="racename">
    </div>
    <div>
        <label for="favoritefood">Favorite Food: </label>
        <input type ="text" name="favoritefood" id="favoritefood">
    </div>
    <div>
        <label for="birthdate">Birth date: </label>
        <input type ="date"  name="birthdate" id="birthdate">
    </div>
    <button>Add</button>


</form>

</body>
</html>

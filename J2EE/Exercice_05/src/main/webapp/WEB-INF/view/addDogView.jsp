<%--
  Created by IntelliJ IDEA.
  User: 33659
  Date: 11/06/2025
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Dog</title>
    <%@include file="/style/importCss3.jsp"%>

</head>
<body>
<form action="form" method="post">
    <h2>- Add a Dog-</h2>
    <div>
        <label for="dogname">Dog name: </label>
        <input type ="text" name="dogname" id="dogname">
    </div>
    <div>
        <label for="racename">Race name: </label>
        <input type ="text" name="racename" id="racename">
    </div>

    <div>
        <label for="birthdate">Birth date: </label>
        <input type ="date"  name="birthdate" id="birthdate">
    </div>
    <button>Add Dog</button>

    <button class="button-80" role="button"><a href="/Exercice_05_war_exploded/"> Page d'accueil</a></button>


</form>


</body>
</html>

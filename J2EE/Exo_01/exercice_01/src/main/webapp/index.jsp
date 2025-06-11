<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <%@include file="WEB-INF/monStyle.jsp"%>
</head>
<body>
<header>
    <h1><%= "App JEE" %></h1>
</header>

<section>
    <h2>Exercice n°1</h2>
    <button class="button-80" role="button"><a href="text-brut"> Vers page générée par un Servlet en text brut</a></button>
    <button class="button-80" role="button"><a href="text-html"> Vers page générée par un Servlet en text html</a></button>
    <button class="button-80" role="button"><a href="page-jsp">  Vers page générée par un Servlet Java Single Page</a></button>
</section>

<section>
    <h2>Exercice n°2</h2>
        <button class="button-80" role="button"><a href="page2"> Vers la page 2, dont un include importe le CSS. </a></button>
        <button class="button-80" role="button"><a href="page3"> Vers la page 3, dont un include importe le CSS.</a></button>
</section>

<section>
    <h2>Exercice n°3</h2>
    <button class="button-80" role="button"><a href="person"> Exo 3 </a></button>


</section>

</body>
</html>
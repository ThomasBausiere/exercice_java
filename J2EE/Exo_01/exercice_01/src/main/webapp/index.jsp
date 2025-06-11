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
    <a href="text-brut"><button class="button-80" role="button"> Vers page générée par un Servlet en text brut</button></a>
    <a href="text-html"><button class="button-80" role="button"> Vers page générée par un Servlet en text html</button></a>
    <a href="page-jsp"><button class="button-80" role="button">  Vers page générée par un Servlet Java Single Page</button></a>
</section>

<section>
    <h2>Exercice n°2</h2>
    <a href="page2"><button class="button-80" role="button"> Vers la page 2, dont un include importe le CSS. </button></a>
    <a href="page3"><button class="button-80" role="button"> Vers la page 3, dont un include importe le CSS.</button></a>
</section>

<section>
    <h2>Exercice n°3</h2>
    <a href="person"><button class="button-80" role="button"> Exo 3 </button></a>


</section>

</body>
</html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <%@include file="WEB-INF/monStyle.jsp"%>
</head>
<body>
<h1><%= "App JEE" %></h1>
<section>
    <h2>exo 1</h2>
    <ul>
        <li><a href="text-brut"> Vers page générée par un Servlet en text brut</a></li>
        <li><a href="text-html"> Vers page générée par un Servlet en text html</a></li>
        <li><a href="page-jsp">  Vers page générée par unServlet JSP</a></li>
    </ul>
</section>

<section>
    <h2>exo 2</h2>
    <ul>
        <li><a href="page2"> Vers la page 2, dont un include importe le CSS. </a></li>
        <li><a href="page3"> Vers la page 3, dont un include importe le CSS.</a></li>
    </ul>
</section>




</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.exercice_05.model.Dog" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<jsp:useBean id="dog" type="org.example.exercice_05.model.Dog" scope="request" />

<html>
<head>
    <title>View a Dog</title>
    <%@include file="/style/importCss2.jsp"%>

</head>
<body class="body-view">

<form class="view-form">
    <h2>- View a Dog -</h2>

    <div>
        <label>Name:</label>
        <input type="text" value="<%= dog.getDogName() %>" readonly />
    </div>

    <div>
        <label>Breed:</label>
        <input type="text" value="<%= dog.getRaceName() %>" readonly />
    </div>

    <div>
        <label>Birth date:</label>
        <input type="text" value="<%= dog.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) %>" readonly />
    </div>

    <a href="<%= request.getContextPath() %>/dog/show-all">⟲ Return</a>
</form>

</body>
</html>

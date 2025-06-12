<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <%@include file="/style/importCss.jsp"%>

</head>
<body>

<div class="home-container">
    <h1>🐶 Hello World!</h1>

    <a href="<%= request.getContextPath() %>/dog/add"> Add a Dog</a>
    <a href="<%= request.getContextPath() %>/dog/show-all"> Show All Dogs</a>
</div>

</body>
</html>
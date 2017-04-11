<%-- 
    Document   : inicio
    Created on : 10/01/2017, 02:35:37 PM
    Author     : IVAN.ROCHA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="http://gaia.inegi.org.mx/mdm-api/api?key=mdmGIfDSZGc6rJYVVmirb6A7tmwfYgCE7UQivS5p6JJPpY" type="text/javascript"></script>
        <script src="<c:url value='resources/js/config_map.js'/>"></script>
    </head>
    <body>
        <div id="mapa"></div>
    </body>
</html>

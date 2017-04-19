<%-- 
    Document   : login
    Created on : 2/01/2017, 01:45:18 PM
    Author     : IVAN.ROCHA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="<c:url value='resources/css/w3.css'/>" />
        <link rel="stylesheet" type="text/css" href="<c:url value='resources/css/login.css'/>" />
        <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        
    </head>
    <body>
        <h2>Spring Landing Pag</h2>
      <p>Click below button to get a simple HTML page</p>
      
      <form:form method = "GET" action = "/pvags/validaUsuario">
         <table>
            <tr>
               <td>
                  <input type = "submit" value = "Get HTML Page"/>
               </td>
            </tr>
         </table>  
      </form:form>
    </body>
</html>





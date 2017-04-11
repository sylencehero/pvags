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
        <!--<img src="resources/img/Mapa.jpg" alt="" height="100%" width="100%" style="position: absolute">-->
        <div class="w3-modal" style="display: block;position:absolute">
            <div class="w3-modal-content" style="width: 20%!important;top: 20%">
                <div class="w3-card-24" style="width:100%;">
                    <header class="w3-container w3-light-grey w3-center">
                        <h2>Iniciar sesi&oacute;n</h2><i class="fa fa-2x fa-lock"></i>
                    </header>
                    <div class="w3-container">
                        <form:form method="post" commandName="log">
                            <form:errors path="*" element="div" cssClass="w3-panel w3-pale-red"/>
                            <hr/>
                            <div class="w3-row w3-center">
                                <div class="w3-rest">
                                    <div class="w3-row">
                                        <div class="w3-half">
                                            <form:label path="user"><i class="fa fa-user-circle-o"></i>&nbsp;Usuario:</form:label>
                                        </div>
                                        <div class="w3-half">
                                            <form:input path="user" cssClass="w3-small"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="w3-rest">
                                    <div class="w3-row">
                                        <div class="w3-half">
                                            <form:label path="pwd"><i class="fa fa-key"></i>&nbsp;Contraseña:</form:label>
                                        </div>
                                        <div class="w3-half">
                                            <form:password path="pwd" cssClass="w3-small"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="w3-center">
                                <input type="submit" id="binput" value="Entrar" class="w3-btn w3-round w3-blue-gray w3-border"/>
                            </div>
                            <hr/>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>





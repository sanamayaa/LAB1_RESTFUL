<%-- 
    Document   : response.jsp
    Created on : 22/03/2021, 09:37:24 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DATOS</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.salary.Calculos" />

        <jsp:setProperty name="mybean" property="name"/>
        <jsp:setProperty name="mybean" property="salario"/>
        <jsp:setProperty name="mybean" property="fecha"/>
        
        <h1>Hello, <jsp:getProperty name="mybean" property="name" />,
            <br>
                Su Calculo de salario es: <jsp:getProperty name="mybean" property="resultado2" />
            <br>
        </h1>
    </body>
</html>

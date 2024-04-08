<%-- 
    Document   : request
    Created on : Feb 7, 2024, 1:20:14 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Request Header Page</title>
    </head>
    <body>
        <h1>HTTP Headers</h1>
        <form action="HeaderServlet" method="post">
            <input type="submit" value="Click to Request">
        </form>
         
        <%--
        <h1>Request Headers!</h1>
        <form action="HeaderServlet" method="post">
            <input type="submit" value="Click to Request">
        </form>
        --%>
    </body>
</html>

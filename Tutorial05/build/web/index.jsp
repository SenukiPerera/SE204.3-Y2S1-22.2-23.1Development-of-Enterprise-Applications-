<%-- 
    Document   : index
    Created on : 08/04/2024, 5:37:39 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Image path</title>
    </head>
    <body>
        <h1>Image Path</h1>
        <form action="UploadImagePathServlet" method="GET">
            <label for="imagePath">Image Path:</label>
            <input type="text" id="imagePath" name="imagePath" required>
            <br>
            <button type="submit">Submit</button>
        </form>
    </body>
</html>

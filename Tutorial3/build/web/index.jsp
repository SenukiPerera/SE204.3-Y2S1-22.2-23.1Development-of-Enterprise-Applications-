

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
        <style>
            .container{
                width: 100%;
                height: 100vh;
                background:#c8f7dd;
                display: flex;
                align-items: center;
                justify-content: center;
            }
            .registration{
                background: white;
                padding: 50px;
            }
            .registration form input{
                border: 0;
                outline: 0;
                width: 100%;
                height: 40px;
                border-radius: 5px;
                box-shadow: -8px -8px 15px rgba(255,255,255,0.1),5px 5px 15px rgba(0,0,0,0.2);
                background: transparent;
                font-size: 18px;
                cursor: pointer;
                margin: 10px;
                align-items: center;
                justify-content: center;
                
            }
            form h1{
                color: #03ca2f;
                text-align: center;
            }
            form input.button{
                background: #03ca2f;
                color: #fff;
            }
            form input.fill{
                padding-right:10px;
                padding-left: 10px;
                font-size: 16px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="registration">
                <form action="SignUpservlet" method="POST">
                    <h1>Registration Form</h1>
                    <table>
                        <tbody>
                            <tr>
                                <td>Username:</td>
                                <td><input type="text" name="username" class="fill"></td>
                            </tr>
                            <tr>
                                <td>Email:</td>
                                <td><input type="email" name="email" class="fill"></td>
                            </tr>
                            <tr>
                                <td>Password:</td>
                                <td><input type="password" name="password" class="fill"></td>
                            </tr>
                            <tr>
                                <td>Confirm Password:</td>
                                <td><input type="password" name="compassword" class="fill"></td>
                            </tr>
                            <tr>
                                <td colspan="2"><input type="submit" value="Submit" name="submit" class="button"></td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>

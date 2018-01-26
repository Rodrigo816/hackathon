<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 26/01/2018
  Time: 00:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="javascript">
        //$("id")
    </script>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation-float.css">
    <link rel="stylesheet" type="text/css" href="style.css">
    <!--<link rel="stylesheet" type="text/css" href="css/teste.css"> -->

    <title>Document</title>
</head>
<body class="login">
    <div class="row login-box" style="width: 30%;">
        <div class="small-12">
            <div class="login-box-form-section">
                <h1 class="login-box-title">Sign up</h1>
                <form method="post" action="/hackathon/login">
                    <input class="login-box-input" type="email" name="email" placeholder="E-mail" />
                    <input class="login-box-input" type="password" name="password" placeholder="Password" />
                    <p id="error"> </p>
                    <input class="login-box-submit-button" type="submit" name="signup_submit" value="Sign me in" />
                </form>
            </div>
        </div>
    </div>

</body>
</html>

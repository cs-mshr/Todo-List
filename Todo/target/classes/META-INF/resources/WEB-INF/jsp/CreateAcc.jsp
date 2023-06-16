<html>
<head>
    <title> Account Creation - Page</title>
</head>

    <body>
    Create your Account for our Website or <a href="login">Login</a> !!

    <pre>${errorMessage}</pre>
    <form method = "post">
        Name: <input type="text" name = "name">
        Password: <input type="password" name = "password">
        Email: <input type="email" name="Email">
        <input type="Submit">
    </form>

    <pre><a href="login">${SuccesMessage}</a></pre>

    </body>
</html>
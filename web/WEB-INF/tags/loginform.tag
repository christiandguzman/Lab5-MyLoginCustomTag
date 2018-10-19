<%-- 
    Document   : loginform
    Created on : Oct 19, 2018, 3:53:00 PM
    Author     : 683676
--%>

<%@tag description="Provides the login forms for the login page" pageEncoding="UTF-8"%>


<%-- The list of normal or fragment attributes can be specified here: --%>

<%-- any content can be specified here e.g.: --%>
<h1>Login</h1>
<br>
<form method="post" action="login">
    Username: <input type="text" name="username" value=${username}>
    <br>
    Password: <input type="password" name="password">
    <br>
    <input type="checkbox" name="remember">Remember Me
    <br>
    <input type="submit" value="Login" checked>
    <br>
    ${invalid}
</form>
<br>
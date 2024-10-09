<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
    <h1>Login Page</h1>
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username"><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br>

        <input type="submit" value="Login">
    </form>
    <p>${loginMessage}</p>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>stack</title>
</head>
<body>
    <form th:action="@{/}" th:object="${welcome}" method="post">
        <input type="submit" class="button" name="push" value="PUSH"/>
        <input type="submit" class="button" name="pop" value="POP"/>
        <input type="submit" class="button" name="view" value="VIEW"/>
        <input type="submit" class="button" name="delete" value="RESET"/>
    </form>
</body>
</html>
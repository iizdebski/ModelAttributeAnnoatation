<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form:form action="/SpringMVCFormSubWebApp/registerSuccess" method="post" modelAttribute="user">
    <table>

        <tr>
            <td>User Name</td>
            <td><form:input path="name"/></td>
        </tr>

        <tr>
            <td>Email</td>
            <td><form:input path="email"/></td>
        </tr>


        <tr>
            <td>Age</td>
            <td><form:input path="age"/></td>
        </tr>

        <tr>
            <td>Country</td>
            <td>
                <form:select path="country">
                    <form:option value="Canada">Canada</form:option>
                    <form:option value="US">US</form:option>
                    <form:option value="Other">Other</form:option>
                </form:select>
            </td>
        </tr>

        <tr>
            <td><input type="submit" value="Register"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
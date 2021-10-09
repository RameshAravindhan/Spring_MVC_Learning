<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <title>
        Welcome to Main Menu Page
    </title>

<style>
    .error {color: red}
</style>
</head>

<body>


<form:form action="processStudentForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>

    <form:errors cssClass="error">
        <path>lastName</path>
    </form:errors>


    <br><br>
    <input type="submit" value="Submit"/>

</form:form>


</body>

</html>
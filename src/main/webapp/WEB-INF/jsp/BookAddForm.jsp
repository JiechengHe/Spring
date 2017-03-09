<%--
  Created by IntelliJ IDEA.
  User: hejiecheng
  Date: 17/3/9
  Time: 下午4:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Book Form</title>
    <style type="text/css">@import "css/main.css";</style>
</head>
<body>
    <div id="global">
        <form:form commandName="book" action="book_save" method="post">
            <fieldset>
                <legend>Add a book</legend>
                <p>
                    <label for="category">Category:
                    </label>
                    <form:select path="category.id" id="category" items="${categories}" itemLabel="name" itemValue="id"/>
                </p>
                <p>
                    <label for="title">Title:</label>
                    <form:input path="title" id="title" />
                </p>
                <p>
                    <label for="title">Author:</label>
                    <form:input path="author" id="author" />
                </p>
                <p>
                    <label for="title">ISBN:</label>
                    <form:input path="isbn" id="isbn" />
                </p>
                <p id="buttons">
                    <input id="reset" type="reset" tabindex="4"/>
                    <input id="submit" type="submit" tabindex="5" value="Add Book" />
                </p>
            </fieldset>
        </form:form>
    </div>
</body>
</html>

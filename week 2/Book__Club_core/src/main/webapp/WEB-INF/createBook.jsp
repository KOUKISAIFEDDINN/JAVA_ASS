<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Demo JSP</title>
    <!-- for Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/main.css" />
    <!-- For any Bootstrap that uses JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container position-absolute top-50 start-50 translate-middle shadow-lg p-4 mb-4 bg-white">
    <h1>Add A Book To your shelf</h1>
    <a href="/books">Back To the Shelf</a>
    <form:form action="/books/create" method="post"
               modelAttribute="book">
        
        <div  class="form-group" >
            <form:label  path="title" >Title</form:label>
            <form:errors  path="title"/>
            <form:input class="form-control" path="title" />
        </div  class="form-group">

        <div class="form-group">
        <form:label   path="author">Author</form:label>
        <form:errors  path="author"/>
        <form:input class="form-control" path="author" />
        </div>
        
        <div  class="form-group">
            <form:label   path="toughts">Tought</form:label>
            <form:errors path="toughts"/>
            <form:textarea class="form-control" path="toughts" cols="60" rows="5"/>
        </div>
        
        <input type="submit" value="Submit" class="btn btn-danger" />
    </form:form>
</div>
</body>
</html>
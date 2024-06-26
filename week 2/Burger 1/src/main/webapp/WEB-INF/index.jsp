
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Burger Tracker</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container p-5 ">
	<h1 class="p-3 text-center">Burger Tracker</h1>
	<table class="table text-center table table-bordered">
		<thead>
			<tr class="table-active">
				<th>Burger Name</th>
				<th>Restaurant Name</th>
				<th>Rating</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allBurgers}" var="one" >
				<tr>
					<td>${one.burgerName}</td>
					<td>${one.restaurantName}</td>
					<td>${one.rating}</td>

			</c:forEach>
			</tbody>
	</table>
	<h1 class="p-3 text-center">Add Burger</h1>
		<form:form class="col-6 text-end p-5" action="/processBurger" method="post" modelAttribute="burger">
	    <div class="p-3">
	        <form:label path="burgerName">Burger Name :</form:label>
	        <form:input class="col-6" path="burgerName"/>
	        <form:errors class="row text-danger" path="burgerName"/>
	    </div>
	    <div class="p-3">
	        <form:label path="restaurantName">Restaurant Name :</form:label>
	        <form:input class="col-6" path="restaurantName"/>
	        <form:errors class="row text-danger" path="restaurantName"/>
	    </div>
	    <div class="p-3">
	        <form:label path="rating">Rating :</form:label>
	        <form:input class="col-6" type="number" path="rating"/>
	        <form:errors class="row text-danger" path="rating"/>
	    </div>
	    <div class="p-3 ">
	        <form:label path="notes">Notes :</form:label>
	        <form:input class="col-6"  path="notes"/>
	        <form:errors class="row text-danger " path="notes"/>     
	    </div>    
	    <input class="col-4 btn btn-danger m-3" type="submit" value="Submit"/>
	</form:form> 
		
	
	
</div>
</body>
</html>
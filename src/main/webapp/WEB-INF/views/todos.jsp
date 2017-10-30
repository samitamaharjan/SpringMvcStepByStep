<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Todos</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<br/><br/>
		<h1>Todo Application</h1>
		<br/><br/>
		<form action="/todo" method="post">
			<div class="form-group">
    			<input type="text" name="description" class="form-control" placeholder="What do you want to do?">
    		</div> 
			<input type="submit" value="Add Todo" class="btn btn-primary">
		</form>
		<br/><br/><br/><br/>
		<ol class="list-group">
			<c:forEach var="item" items="${todos}">
				<li class="list-group-item justify-content-between">
					<a href="/todo/${item.id}" target="_blank">${item.description}</a>
					<span class="badge badge-default badge-pill">
						<a href="/todo/delete/${item.id}">delete</a>
					</span>
				</li>
			</c:forEach>
		</ol>	
	</div>
</body>
</html>
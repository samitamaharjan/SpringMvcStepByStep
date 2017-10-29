<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Todos</title>
</head>
<body>
	<form action="/todo" method="post">
		<input type="text" name="description"> 
		<input type="submit" value="Add Todo">
	</form>
	<ol>
		<c:forEach var="item" items="${todos}">
			<li>
				<a href="/todo/${item.id}" target="_blank">${item.description}</a>
				-
				<a href="/todo/delete/${item.id}">delete</a>
			</li>
		</c:forEach>
	</ol>
</body>
</html>
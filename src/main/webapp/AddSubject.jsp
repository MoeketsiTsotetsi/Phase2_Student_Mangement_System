<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Subject</title>
<link rel="stylesheet" href="./css/Style.css">
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>

<% 
Object result = session.getAttribute("result");
%>
<div class="container text-center">
<h3>Add New Subject</h3>

<form action="AddSubjectController" method="post">

<div class="mb-3">
<label>Subject Name</label>
<input type="text" name="subName">
<label>Subject Credit</label>
<input type="number" name="credit"> 
</div>


<input type="submit" value="Add Subject" class="btn btn-primary" id="btnAddSubject">
</form>
</div>
<br>

<p class="text-center"><core:out value="${result }"></core:out></p>

</body>
</html>
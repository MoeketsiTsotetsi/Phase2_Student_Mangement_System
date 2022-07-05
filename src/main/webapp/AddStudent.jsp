<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
<div class="container text-center">
<h3>Add New Student</h3>

<form action="StudentController" method="post">

<div class="mb-2">
<label>Student Name</label> 
<input type="text" name="fullname"><br>
 
</div>


<div class="mb-2">
<label>Class ID</label> 
<input type="number" name="class_id"><br>
 
</div>




<input type="submit" value="Add Student" class="btn btn-primary" id="btnAddSubject">
</form>
</div>
<br>

<p class="text-center"><core:out value="${result }"></core:out></p>


</body>
</html>
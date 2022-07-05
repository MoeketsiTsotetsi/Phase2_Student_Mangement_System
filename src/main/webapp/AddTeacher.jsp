<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Teacher</title>
<link rel="stylesheet" href="./css/Style.css">
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
<div class="container text-center">
<h3>Add New Subject</h3>

<form action="TeacherServlet" method="post">

<div class="mb-2">
<label>Teacher Name</label> 
<input type="text" name="fullaname"><br>
 
</div>
<div class="mb-2">
<label>Level(Junior/Senior)</label> 
<input type="text" name="level"><br>
 
</div>
<div class="mb-2">
<label>Subject ID</label> 
<input type="number" name="sub_id"><br>
 
</div>




<input type="submit" value="Add Teacher" class="btn btn-primary" id="btnAddSubject">
</form>
</div>
<br>

<p class="text-center"><core:out value="${result }"></core:out></p>


</body>
</html>
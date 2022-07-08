<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new Class
</title>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>

<% 
Object result = session.getAttribute("result");
%>
<div class="container text-center">
<h3>Add New Class</h3>

<form action="ClassServlet" method="post">

<div class="mb-3">

<label>Class Name</label>
<input type="text" name="cname">

</div>
<div class="mb-3">

<label>Hours</label>
<input type="number" name="hours">

</div>
<div class="mb-3">

<label>Subject ID</label>
<input type="number" name="s_id">

</div>


<input type="submit" value="Add Subject" class="btn btn-primary" id="btnAddSubject">
</form>
</div>
<br>

<p class="text-center"><core:out value="${result }"></core:out></p>


</body>
</html>
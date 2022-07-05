<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Class Report</title>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
<%
Object c = session.getAttribute("class");
Object t = session.getAttribute("t");
Object sl = session.getAttribute("ls");
Object sub = session.getAttribute("sub");
%>
<div class="container">
<h2 class="text-center">Class Report</h2> <br>


<!-- Class details-->
<h2 class="text-center">Class Details</h2>
<table class="table table-striped">

<tr>
<th>Class ID</th>
<th>Name</th>
<th>Hours</th>

</tr>
<tr>
<td><core:out value="${c.classId }"></core:out></td>
<td><core:out value="${c.name }"></core:out></td>
<td><core:out value="${c.hours }"></core:out></td>

</tr>


</table>

<table class="table table-striped">
<tr>
<th>Subject ID</th>
<th>Subject Name</th>
<th>Subject Credit</th>
</tr>

<tr>

<td><core:out value="${sessionScope.sub.subject_id }"></core:out></td>
<td><core:out value="${sessionScope.sub.name }"></core:out></td>
<td><core:out value="${sessionScope.sub.credit }"></core:out></td>
</tr>

</table>

<h2 class="text-center">Teacher Details</h2>
<table class="table table-striped">
<tr>
<th>Teacher ID</th>
<th>Fullname</th>
<th>Level</th>
</tr>

<tr>
<td><core:out value="${sessionScope.t.teacher_id }"></core:out></td>
<td><core:out value="${sessionScope.t.fullname }"></core:out></td>
<td><core:out value="${sessionScope.t.level }"></core:out></td>

</tr>

</table>

<h2 class="text-center">Student List</h2>

<table class="table table-striped">

<tr>
<th>Student ID</th>
<th>Student Name</th>
</tr>

<core:forEach items="${sessionScope.ls }" var="s">
<tr>
<td><core:out value="${s.studentId }"></core:out></td>
<td><core:out value="${s.fullname }"></core:out></td>


</tr>


</core:forEach>

</table>

</div>
</body>
</html>
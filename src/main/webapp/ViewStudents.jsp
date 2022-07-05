<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Students</title>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>

<div class="container">

<table class="table table-striped">
	<tr>
		<th>Student ID</th>
		<th>Name</th>
		<th>Class ID</th>
	</tr>

<core:forEach items="${sessionScope.listStudent }" var="s">
<tr>

<td><core:out value="${s.studentId }"></core:out></td>

<td><core:out value="${s.fullname }"></core:out></td>

<td><core:out value="${s.c_id }"></core:out></td>

</tr>

</core:forEach>
</table>



</div>

</body>
</html>
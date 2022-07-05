<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Class"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Subjects</title>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>

<div class="container">

<table class="table table-striped">
	<tr>
		<th>Subject ID</th>
		<th>Name</th>
		<th>Hours</th>
	</tr>

<core:forEach items="${sessionScope.subList }" var="s">
<tr>

<td><core:out value="${s.subject_id }"></core:out></td>

<td><core:out value="${s.name }"></core:out></td>

<td><core:out value="${s.credit }"></core:out></td>

</tr>

</core:forEach>
</table>



</div>

</body>
</html>
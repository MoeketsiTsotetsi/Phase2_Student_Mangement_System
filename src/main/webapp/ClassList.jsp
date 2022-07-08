<%@page import="com.bean.Class"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Class List</title>
<link rel="stylesheet" href="./css/Style.css">
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>

<div class="container text-center">

<h2>List Of Classes</h2>

<table class="table table-striped table-dark">
<tr>
<th>Class ID</th>
<th>Class Name</th>
<th>Class Duration</th>
<th>Subject ID</th>

</tr>

<core:forEach items="${sessionScope.list}" var="l">
<tr>
<td><core:out value="${l.classId }"></core:out></td>
<td><core:out value="${l.name }"></core:out></td>
<td><core:out value="${l.hours }"></core:out></td>
<td><core:out value="${l.s_id }"></core:out></td>


</tr>

</core:forEach>

</table>
<form action="ClassReportController">
<input class="btn btn-primary" type="submit" value="View Class Report">
<br>
<br>
<input type="number"  name="c_id">
</form>


<core:out value="${result }"></core:out>
</div>






</body>
</html>
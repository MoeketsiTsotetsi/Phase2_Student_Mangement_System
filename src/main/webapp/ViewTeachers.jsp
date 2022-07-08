<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Teachers</title>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
<%
Object tlist = session.getAttribute("tList");

%>

<div class="container">
<h2 class="text-center">Teacher List</h2>

<table class="table table-striped table-dark">
<tr>
<th>Teacher ID</th>
<th>Name</th>
<th>Level</th>

</tr>

<core:forEach items="${sessionScope.tList }" var="tl">
<tr>
<td><core:out value="${tl.teacher_id }"></core:out></td>
<td><core:out value="${tl.fullname}"></core:out></td>
<td><core:out value="${tl.level}"></core:out></td>

</tr>


</core:forEach>
</table>
</div>
</body>
</html>
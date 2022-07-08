<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="./css/Style.css">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#">Student Management</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="Home.jsp">Home</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="AddSubject.jsp"> Add Subjects</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="AddSubjectController">View Subjects</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="AddTeacher.jsp"> Add Teachers</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="TeacherServlet">View Teachers</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="AddClass.jsp"> Add Classes</a>
      </li>
      
           <li class="nav-item">
        <a class="nav-link" href="ClassServlet">View Classes</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="AddStudent.jsp"> Add Students</a>
      </li>

      
      
      <li class="nav-item">
        <a class="nav-link" href="StudentController">View Students</a>
      </li>
      
    </ul>
  </div>
</nav>
</body>
</html>
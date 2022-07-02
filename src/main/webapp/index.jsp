<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Please Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="./css/Style.css">

</head>
<body >

<h2 class="text-center" id="signHeader">Please Sign In Here</h2>

<div class="container text-center" id="loginDiv">
<form action="UserController" method="get">
<div class="mb-3">
  <label for="lblUsername" id="lblUsername" class="form-label">Username</label>
  <input type="text" name="username" class="form-control" id="username" placeholder="Enter Username">
  <label for="lblPassword" id="lblPassword" class="form-label">Password</label>
  <input type="password" name="password" class="form-control" id="password" placeholder="Enter Password">
</div>
<input class="btn btn-success" id="btnLogin" type="submit" value="Login">
</form>
</div>









<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
crossorigin="anonymous"></script>
</body>
</html>
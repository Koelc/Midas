<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="resources/registration.css">

<style>
.err {
	color: aqua;
}

.err_bdr {
	border: 1px solid red;
}

.bdr {
	border: 1px solid gray;
}
</style>
</head>
<body>
            <jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

<div class="container">
 <h1>Registration Form</h1>
 <div class="col-lg-12">
  <div class="row">
  <form:form modelAttribute="User" action="saveRegister" method="post">
     <div class="col-lg-12">
          <div class="form-group">
    <form:errors path="email" cssClass="err"/><br>
     <label>Email:</label>
     <br>
     <form:input path="email" placeholder="Enter Mail Id.." class="form-control"/>
     </div>
         <div class="form-group">
    <form:errors path="uname" cssClass="err"/><br>
     <label>Name:</label>
     <br>
     <form:input path="uname" placeholder="Enter name ..." class="form-control"/>
     </div>
     
     <div class="form-group">
     <form:errors path="password" cssClass="err"/><br>
     <label>Password:</label>
     <br>
     <form:input path="password" type="password" placeholder="Enter password.." class="form-control"/>
     </div>
     
     
     
    <button type="submit" class="btn btn-lg btn-info" >Submit</button>
						<button type="reset" class="btn btn-lg btn-info">Cancel</button>
     </div>
    </form:form>
     </div>     
     
  
  
   
   
  </div>
  
 
 </div>

</div>
</body>
</html>
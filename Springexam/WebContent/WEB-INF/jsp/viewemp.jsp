<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
</head>
<body>
  
  
  
<table border="2" width="70%" cellpadding="3">  
	<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th></tr>

   <c:forEach var="emp" items="${list}">   
	   <tr>  
		   <td>${emp.id}</td>  
		   <td>${emp.name}</td>  
		   <td>${emp.salary}</td>  
		   <td>${emp.designation}</td>  
	   </tr>  
   </c:forEach>  
   </table>
   <br/>  
   <a href="empform">Add New Employee</a>
     
</body>
</html>
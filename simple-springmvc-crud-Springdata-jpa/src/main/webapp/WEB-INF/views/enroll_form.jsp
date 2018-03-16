<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>

<title>Enrollment</title>
</head>
<body>
<br/>
<h2>Please , Fill The Form To Enroll YourSelf As  Blood Donor</h2>
<spring:url value="/donor/review/"   var="formEntry"/>
<form:form action="${formEntry }"  method="POST" modelAttribute="donor"  >
First Name :<form:input path="firstName"/><br/>
Last Name :<form:input path="lastName"/><br/>
Phone Number : <form:input path="phNo"/><br/>
Blood Group :<form:radiobuttons path="bloodTypes" items="${radioOptions}"/><br/>
	<button type="submit" >Submit</button>
</form:form>

<!-- <a href="<spring:url value="/donor/proceed/"/>">Proceed</a> -->
</body>
</html>
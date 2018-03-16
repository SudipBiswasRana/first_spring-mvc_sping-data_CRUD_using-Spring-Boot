<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>

<title>Delete Entry </title>
</head>
<body>
<h2> Enter First Your Name To Delete Your Entries From Database ..</h2><br/><br/>
<spring:url value="/donor/delete/{firstName}"   var="del"/>
<form:form action="${del}"  method="delete"  modelAttribute ="donor">
Name : <form:input path="firstName"/>
<button type="submit" >Delete</button>
</form:form>
</body>
</html>
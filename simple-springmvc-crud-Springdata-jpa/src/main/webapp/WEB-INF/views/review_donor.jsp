<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>

<title>Review</title>
</head>
<body>
 <h1>This Is Review Page .. Think Before You Confirm ..</h1><br/><br/>
 <table>
 <tr><th>First Name</th><th>Last Name </th><th>Phone No </th><th> Blood Type </th></tr>
 <tr><td>${donor.firstName}</td><td>${donor.lastName}</td><td>${donor.phNo}</td><td>${donor.bloodTypes}</td></tr>
 </table>
 <br/><br/>
 <a href="<spring:url value="/donor/continue/ "/>">Confirm</a> <br/> <br/>
 <a href="<spring:url value="/donor/edit/"/>">Reset</a> <br/><br/>
 <a href="<spring:url value="/donor/cancel"/>">Cancel</a> <br/><br/>
 
</body>
</html>
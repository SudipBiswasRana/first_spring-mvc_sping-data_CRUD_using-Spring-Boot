<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>

<title>Continue</title>
</head>
<body>


 <spring:url value="/donor/save"   var="sv"/>
 <form action="${sv }" method="post" >
 <input type="hidden" name="firstName" value="${donor.firstName}"/><br/>
 <input type="hidden" name="lastName"  value="${donor.lastName}"/><br/>
 <input type="hidden"  name="phNo"  value="${donor.phNo}"/><br/>
 <input type="hidden"  name="bloodTypes" value="${donor.bloodTypes}"/><br/>
 <button type="submit" >OK</button>
  </form>
</body>
</html>
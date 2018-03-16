
  <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>

<title>Welcome</title>
</head>
<body>
 <h1> This Is My First Spring MVC Project With Spring Data JPA</h1>
  <h2> Going To Do Simple CRUD Operations </h2>
  <br/>
  <h2> Enrollment Portal  For Blood Donation Event</h2>
  <br/>
  <h2><a href="<spring:url value='/donor/entry/'/>">Enroll Donor</a></h2><br/><br/>
  
  <h2><a href="<spring:url value='/donor/making_delete/'/>">Delete Entry</a></h2><br/><br/>
  
 <h2><a href="<spring:url value='/donor/all/'/>">Find All Records</a></h2><br/><br/>
</body>
</html>
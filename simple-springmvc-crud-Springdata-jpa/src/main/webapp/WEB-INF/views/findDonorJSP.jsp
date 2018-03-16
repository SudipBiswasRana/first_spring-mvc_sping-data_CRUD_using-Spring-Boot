<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>Find A Donor</title>
</head>
<body>
	<h2>Persisted Data As Follows ...</h2>
	<br />
	<br />



	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Phone No</th>
			<th>Blood Type</th>
			<th></th>
			<th>DELETE</th>
		</tr>
		<c:forEach items="${records }" var="r">
			<tr>
			    <td>${r.id}</td>
				<td>${r.firstName}</td>
				<td>${r.lastName}</td>
				<td>${r.phNo}</td>
				<td>${r.bloodTypes}</td>
				<td></td>
				<td><a
					href="<spring:url value="/delete/${r.id}"/>">delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
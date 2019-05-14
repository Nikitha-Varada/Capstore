<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>Delete Operation</h1>
<form action="getUserDetailsDel">
<table border="1">
<tr>
<td>Enter User Name</td>
<td><input type="text" name="uname"></td>
<td><input type="submit" value="Delete"></td>
</tr>
</table>
</form>
<c:if test ="${user!=null }">
<h1>User Info</h1>
<form action="deleteUser">
<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>UserName</th>
<th>Gender</th>
<th>City</th>
</tr>
<tr>
<td>${user.firstName }</td>
<td>${user.lastName }</td>
<td>${user.userName }</td>
<td>${user.gender }</td>
<td>${user.city }</td>
</tr>
<tr>
<td><input type="submit" value="Delete"></td>
</tr>
</table>
</form>
</c:if>
</body>
</html>
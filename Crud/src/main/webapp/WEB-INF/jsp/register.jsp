<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
<form:form action="http://localhost:8089/firstapp/registerUser">
<table bgcolor=lightblue width=50% align=center>
<caption>User Registration Form</caption>
<tr>
<th>First Name</th>
<td><form:input path="firstName"/></td>
</tr>
<tr>
<th>Last Name</th>
<td><form:input path="lastName"/></td>
</tr>
<tr>
<th>User Name</th>
<td><form:input  path="userName"/></td>
</tr>
<tr>
<th>Password</th>
<td><form:password path="password"/></td>
</tr>
<tr>
<th>Gender</th>
<td>Male<form:radiobutton path="gender" value="Male"/></td>
<td>Female<form:radiobutton path="gender" value="Female"/></td>
</tr>
<tr>
<th>City</th>
<td><form:select path="city">
<form:option value="Hyderabad" label="Hyderabad"/>
<form:option value="secunderabad" label="Secunderabad"/>
<form:option value="Medak" label="Medak"/>
<form:option value="Medchal" label="Medchal"/>
</form:select></td>
</tr>
<tr>
<td><input type="submit" value="Register"></td>
<td><input type="reset" value="Cancel"></td>
</tr></table></form:form>
</body>
</html>
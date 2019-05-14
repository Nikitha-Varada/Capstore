<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>
Your are Registered successfully............Your Details Are......</h1>
<table style="width:50px;border:1px solid red;background-color: aqua;color: red">
<tr>
<th>First Name</th>
<td>${user.firstName }</td>
</tr>
<tr>
<th>Last Name</th>
<td>${user.lastName }</td>
</tr>
<tr>
<th>User Name</th>
<td>${user.userName }</td>
</tr>
<tr>
<th>Password</th>
<td>${user.password }</td>
</tr>
<tr>
<th>Gender</th>
<td>${user.gender }</td>
</tr>
<tr>
<th>City</th>
<td>${user.city }</td>
</tr>
</table>
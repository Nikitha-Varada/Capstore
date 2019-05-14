<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<form action="getUserDetails">
Select UserName
<select name="userNames">
<c:forEach var="u" items="${userNames }">
<option value="${u }">${u }</c:forEach></select><br>
<input type="submit" value="GetUserDetails">
</form>
</body>
</html>
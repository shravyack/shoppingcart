<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Landing Page</title>
</head>
<body>
<p>Hello admin!</p>

<form:form method="POST" action="AdminLanding" commandName="adminList">
   <table>
   <!--  <tr>
        <td><form:label path="emailId"><font color="red">Name</font></form:label></td>
      
      
    <td><form:input path="emailId" /></td>
    <td><form:errors path="emailId" cssclass="error"></form:errors></td> 
    </tr>
    <tr>
        <td><form:label path="password"><font color="red">Password</font></form:label></td>
        <td><form:input type="password" path="password" /></td>
        <td><form:errors path="password" cssclass="error"></form:errors></td> 
    </tr>
    <tr>
        <td colspan="2">
             <input type="submit"  value="Submit"/>
        </td>
    </tr> -->
    
    
</table>  

<table border="1">
<thead>
<tr>User List</tr>
<tr>
    <th>User FirstName</th>
    <th>User LastName</th>
    <th>EmailId</th>
    
  </tr>
</thead>

<tbody> 
 <c:forEach items="${datas}" var="users">
    <tr>
      <td>${users.getFirstname()}</td>
      <td>${users.getLastname()}</td>
      <td>${users.getEmailId()}</td>
     
    </tr>
  </c:forEach> 
  </tbody>
</table>






</form:form>

</body>
</html>
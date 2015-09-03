<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring Form</title>
</head>
<body>


<h2>Sign In </h2>
<form:form method="POST" action="userLoginSubmit" commandName="loginForm">
   <table>
    <tr>
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
    </tr>
</table>  
</form:form>
<form action="http://localhost:8090/shoppingcart/registerUser">
 <p> New User? Sign up here! </p>
 <input type="submit"  value="SignUp!"/> 
 </form>
</body>
</html>



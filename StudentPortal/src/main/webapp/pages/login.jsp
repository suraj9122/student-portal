<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Leeds Beckett University </h1>
 <form method="post" action="register">
      <label for="field1">Field 1:</label>
      <input type="text" name="id" id="field1" /><br />
      <label for="field2">Field 2:</label>
      <input type="text" name="pass" id="field2" /><br />
      <button type="submit" name="submit" value="Login">Save</button>
        <button type="submit" name="submit1" value="Login">Register</button>
   
    </form>
    	<p>Not registered? <a href="register">Login here</a></p>
    
</body>
</html>
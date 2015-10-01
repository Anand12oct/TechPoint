<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<span>User Name : </span><input type="text" name="newname" id="newname" />
<br />
<input type="button" name="changename" id="changename" value="Change User Name" onclick="javascript:alert('User Name is changed.');"/>
</body>
</html>

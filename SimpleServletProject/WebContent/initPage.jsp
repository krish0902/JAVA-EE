<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%!
public void jspInit()
{

	String defaultUser =getServletConfig().getInitParameter("defaultUser");
	ServletContext context =getServletContext();
	context.setAttribute("defaultUser",defaultUser);
	
	

}%>

<body>

The default user name is 
<%=getServletConfig().getInitParameter("defaultUser")%>

The value in the Servlet Context is: <%=getServletContext().getAttribute("defaultUser") %>





</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h3> Testing JSPs</h3>

<%!
public int add(int a,int b)
{
	return a+b;
}
%>


<%
int i=1;
int j=2;
int k;
 
k=i +j;

/* out.println("Value of k is "+k);
 */
%>

The value of k is: <%=k %>


<% k=add(23433,23233); %>

<br>
The value of k is: <%=k %>
 
<% for(i=0;i<5;i++) 
{%>
	
	<br> The new value of i=<%=i %>

<%} %>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head><title>[twoDelete.jsp]</title></head>
<body>
	<h1><font color=red>[twoDelete.jsp]</font></h1>
	<form action="delete.action">
		<b>삭제할사번:</b>
		  <input type=text  name="sabun"  style="font-size:18pt"> 
		 <input type=submit  value="struts2삭제" style="font-size:18pt">
	</form>
	
	<p>
	<h1>
		<a href="two.jsp"> [two.jsp] </a> &nbsp; 
		<a href="list.action"> [list.action] </a>&nbsp;
		<a href="twoDelete.jsp"> [삭제] </a> &nbsp; 
	</h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head><title>[two.jsp]</title></head>
<body>
	<h1><font color=red>[two.jsp]</font></h1>
	<form action="add.action">
		���:  <input type=text  name="bean.sabun"  style="font-size:18pt"> <br>
		�̸�:  <input type=text  name="bean.name"  style="font-size:18pt" > <br>
		�޿�: <input type=text  name="bean.pay"  style="font-size:18pt" > <p>
		<input type=submit  value="struts2����" style="font-size:18pt">
		<input type=reset  value="struts2���" style="font-size:18pt">
	</form>
	
	<p>
	<h1>
		<a href="two.jsp"> [two.jsp] </a> &nbsp; 
		<a href="list.action"> [list.action] </a>&nbsp;
		<a href="twoDelete.jsp"> [����] </a> &nbsp; 
	</h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head><title>[twoEdit.jsp]</title></head>
<body>
	<h1><font color=red>[twoEdit.jsp]</font></h1>
	<form action="edit.action">
		<b>���:</b>
		   <input type=text  name="bean.sabun"   value="${bean.sabun}"  readonly style="font-size:18pt"> <br>
		<b>�̸�:</b> 
		   <input type=text  name="bean.name"   value="${bean.name}"  style="font-size:18pt"> <br>
		<b>�޿�:</b> 
		   <input type=text  name="bean.pay"      value="${bean.pay}"  style="font-size:18pt"> <br>
		
		<input type=submit  value="struts2����"  style="font-size:18pt">
		<input type=reset  value="struts2���"  style="font-size:18pt">
	</form>
	
	<p>
	<h1>
		<a href="two.jsp"> [two.jsp] </a> &nbsp; 
		<a href="list.action"> [list.action] </a>&nbsp;
		<a href="twoDelete.jsp"> [����] </a> &nbsp; 
	</h1>
</body>
</html>
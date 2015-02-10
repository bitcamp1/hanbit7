<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@  taglib  prefix="c"   uri="http://java.sun.com/jsp/jstl/core"   %>
<%@  taglib  prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt"   %>

<html>
<head><title>[twoDetail.jsp]</title>
	<style type="text/css">
		td{ text-decoration:none; font-size:20pt;  font-family:Comic Sans MS; }
		a{ text-decoration:none; font-size:18pt;  font-family:Comic Sans MS; }
		a:hover{ text-decoration:underline;  font-size:38pt;  font-family:Comic Sans MS; }
	</style>
</head>
<body>
	<h1><font color=red>[twoDetail.jsp]</font></h1>
	<table width=700  border=1>
			<tr  bgcolor=pink  height=55>
				<td colspan=4 align="center">
					<font size=6><b> ${bean.getName( )}님의 상세정보 </b></font> 
				</td>  
			</tr>
			<tr>
				<td>${bean.sabun} </td>
				<td>${bean.name } </td>
				<td><fmt:formatDate value="${bean.nalja}"  pattern="yyyy-MM-dd" />  </td>
				<td>${bean.getPay( ) } </td>
			</tr>
	</table>
	<p>
	<h1>
		<a href="two.jsp"> [two.jsp] </a> &nbsp; 
		<a href="list.action"> [list.action] </a>&nbsp;
		<a href="twoDelete.jsp"> [삭제] </a> &nbsp; 
		<a href="editPre.action?idx=${bean.sabun}"> [수정] </a> &nbsp; 
	</h1>
</body>
</html>





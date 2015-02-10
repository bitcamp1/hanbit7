<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@  taglib  prefix="c"   uri="http://java.sun.com/jsp/jstl/core"   %>
<%@  taglib  prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt"   %>

<html>
<head><title>[twoList.jsp]</title>
	<style type="text/css">
		td{ text-decoration:none; font-size:20pt;  font-family:Comic Sans MS; }
		a{ text-decoration:none; font-size:18pt;  font-family:Comic Sans MS; }
		a:hover{ text-decoration:underline;  font-size:38pt;  font-family:Comic Sans MS; }
	</style>
</head>
<body>
	<h1><font color=red>[twoList.jsp]</font></h1>
	<table width=600  border=1>
			<tr  bgcolor=yellow  height=35>
				<td>사번</td> <td>이름</td>  <td>날짜</td>  <td>급여</td> 
			</tr>
		<c:forEach  var="bean"  items="${list}">
			<tr>
				<td>${bean.sabun} </td>
				<td><a href="detail.action?idx=${bean.sabun}"> ${bean.getName( ) } </a> </td>
				<td><fmt:formatDate value="${bean.nalja}"  pattern="yyyy-MM-dd" />  </td>
				<td>${bean.getPay( ) } </td>
			</tr>
		</c:forEach>
	</table>
	<p>
	<h1>
		<a href="two.jsp"> [two.jsp] </a> &nbsp; 
		<a href="list.action"> [list.action] </a>&nbsp;
		<a href="twoDelete.jsp"> [삭제] </a> &nbsp; 
	</h1>
</body>
</html>
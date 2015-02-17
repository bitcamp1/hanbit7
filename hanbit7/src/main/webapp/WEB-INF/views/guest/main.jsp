<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!doctype html>
<html lang="ko">
<head>
	<jsp:include page="../common/head.jsp"/>
		
</head>
<body>
	<div class="wrap">
		<div class="header">
			<jsp:include page="../common/header.jsp" />
		</div>
	
		<div class='container'>
			<jsp:include page="list.jsp"/>	
			<%-- <div id="content">
				<div id="url-navi">yeSooL Community</div>
						<c:choose>
				<c:when test="${result eq 'detail'}">
					<jsp:include page="detail.jsp"/>
				</c:when>
				<c:otherwise>
					<jsp:include page="list.jsp"/>	
				</c:otherwise>
				</c:choose>
			</div> --%>
		</div>
		</div>
		
		

		<jsp:include page="../common/bottom.jsp" />
	
</body>
</html>
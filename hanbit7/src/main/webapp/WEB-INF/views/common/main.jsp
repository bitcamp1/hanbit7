<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE HTML>
<html>
	<head>
		<jsp:include page="head.jsp"/>
	</head>
	<body>
			
			<div class="wrap">
				<div class="header">
			<jsp:include page="../common/header.jsp"/>
			</div>
			
			<div style='width:1000px;height:500px;background-color: gray;margin: 0 auto;'class="text-slider">
		
					<h1>${hello}</h1>
					<%-- <jsp:include page="da_slider.jsp"/> --%>
			    
			</div>
		<div class="content">
			<jsp:include page="top_grid.jsp"/>
		</div>
		<jsp:include page="bottom.jsp"/>
		</div>
		<script type="text/javascript">
			$(function() {
				$('#da-slider').cslider({
					autoplay	: true,
					bgincrement	: 450
				});
			
			});
		</script>
	</body>
</html>


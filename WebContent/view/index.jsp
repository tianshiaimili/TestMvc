<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<?xml version="1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>课程列表</title>
</head>
<body>
	<div style="margin-left: 50%;">
		用户信息：<br /> 用户名：${UserName}<br /> 用户权限:${UserRole}
	</div>

	<div style="margin-left: 50%;">
		<ul>
			<c:forEach var="item" items="${listCourse}" varStatus="status">
				<li><h1>
						<span><a
							href="chapter.asp?courseID=${item.courseID}&courseName=${item.courseName}">${item.courseName}</a></span>
					</h1></li>
				<li>学时统计：<strong><a
						href="reportCourseTime.asp?courseID=${item.courseID}&userID=1"
						target="_blank">查看</a></strong></li>
				<li>课程简介：${item.courseDescript}</li>
			</c:forEach>
		</ul>

	</div>



</body>
</html>


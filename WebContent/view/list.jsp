<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>MVC测试</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<link rel="stylesheet" type="text/css" href="css/main.css">
<script type="text/javascript" src="script/jquery.js"></script>
<script type="text/javascript" src="script/test.js"></script>
</head>

<body>
	<span id="a"> <c:forEach items="${listUsers}" var="str"> 
            用户名：${str.userName}<br />
            密码：${str.passWord}<br />
		</c:forEach>
	</span>
	<br /> 请求字符串:${pageContext.request.requestURL}
	<br /> 服务的web application 的名称:${pageContext.request.contextPath}
	<br /> 取得用户名称:${pageContext.request.remoteUser}
	<br /> 取得用户的IP 地址:${pageContext.request.remoteAddr }
	<br /> 取得session 的ID:${pageContext.session.id}
	<br /> 取得主机端的服务信息:${pageContext.servletContext.serverInfo}
	<br /> 服务器信息是：${message}
	<br />

	<br /> 你好,现在时间是<%= new Date()%>第一次测试，成功了

</body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>MVC����</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<link rel="stylesheet" type="text/css" href="css/main.css">
<script type="text/javascript" src="script/jquery.js"></script>
<script type="text/javascript" src="script/test.js"></script>
</head>

<body>
	<span id="a"> <c:forEach items="${listUsers}" var="str"> 
            �û�����${str.userName}<br />
            ���룺${str.passWord}<br />
		</c:forEach>
	</span>
	<br /> �����ַ���:${pageContext.request.requestURL}
	<br /> �����web application ������:${pageContext.request.contextPath}
	<br /> ȡ���û�����:${pageContext.request.remoteUser}
	<br /> ȡ���û���IP ��ַ:${pageContext.request.remoteAddr }
	<br /> ȡ��session ��ID:${pageContext.session.id}
	<br /> ȡ�������˵ķ�����Ϣ:${pageContext.servletContext.serverInfo}
	<br /> ��������Ϣ�ǣ�${message}
	<br />

	<br /> ���,����ʱ����<%= new Date()%>��һ�β��ԣ��ɹ���

</body>
</html>

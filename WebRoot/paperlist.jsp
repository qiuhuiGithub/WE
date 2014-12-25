<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'querybyname.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

</head>

<body bgcolor=ADD2DA>
<input type="hidden" value="<s:property value="ID" />">
	<!-- <table align="center" border="1" style="width:100%;"> -->
	<!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
	<button type="button" class="btn btn-primary" onClick="window.location.href='paperadd.jsp'">增加</button>
	<!-- Indicates a dangerous or potentially negative action -->
	<!-- <button type="button" class="btn btn-danger">删除</button>
	 -->
	<table class="table table-hover">
		<!-- <tr>
			<th colspan="3" align="center">文档列表</th>
		
		</tr> -->
		<tr>
			<th>文档名</th>
			<!-- <th>内容</th> -->
			<th>类型</th>
			<th>删除</th>
		 </tr>
		 <s:iterator value="paperlist">
			<tr>
				
				<td><a href="content.jsp?name=<s:property value="name" />"><font color="black"><s:property value="name" /></font></a></td>
				<!-- <td><s:property value="content" /></td> -->
				<td><s:property value="type" /></td>
				<td><a href="delete.action?ID=${ID}&id=20">删除</a></td>
			</tr>
	   </s:iterator>
	</table>
	
	</body>
	</html>
<%@taglib uri="/struts-tags" prefix="s"%><%@ page language="java"
	import="java.util.*" pageEncoding="UTF-8"%>
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

<title>My JSP 'success.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body bgcolor=d3eaef>
	<table align="center" border="1" style="width:100%;">
		<tr>
			<th colspan="7" align="center">设备申请列表</th>
		
		</tr>
		<tr>
			<td>申请人</td>
			<td>职业</td>
			<td>设备ID</td>
			<td>设备名称</td>
			<td>借用时间</td>
			<td>是否同意</td>
		 </tr>
		 <s:iterator value="borrowbyuserlist">
			<tr>
				<td><s:property value="borrowman" /></td>
				<td><s:property value="profession" /></td>
				<td><s:property value="ID" /></td>
			    <td><s:property value="name" /></td>
				<td><s:property value="time" /></td>
				<td><a href="request.action?i=1">同意</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="request.action?i=0">不同意</a></td>
			</tr>
			</s:iterator>
	</table>
	 <a href="right.jsp">返回主页</a>
	</body>
	</html>
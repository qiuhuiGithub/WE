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
			<th colspan="6" align="center">设备丢失列表</th>
		
		</tr>
		<tr>
			<td>丢失人</td>
			<td>设备编号</td>
			<td>设备名称</td>
			<td>丢失时间</td>
			<td>证明</td>
			<td>金额</td>
		 </tr>
		 <s:iterator value="lostlist">
			<tr>
				<td><s:property value="lostman" /></td>
				<td><s:property value="ID" /></td>
				<td><s:property value="lostname" /></td>
			    <td><s:property value="losttime" /></td>
				<td><s:property value="approval" /></td>
				<td><s:property value="lostmoney" /></td>
			</tr>
			</s:iterator>
	</table>
	 <a href="right.jsp">返回主页</a>
	</body>
	</html>
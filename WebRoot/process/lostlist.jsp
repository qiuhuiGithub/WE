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
			<th colspan="9" align="center">设备丢失列表</th>
		
		</tr>
		<tr>
			<th>报失人</th>
			<th>设备编号</th>
			<th>设备名称</th>
			<th>型号</th>
			<th>规格</th>
			<th>丢失时间</th>
			<th>证明</th>
			<th>金额</th>
			<th>审批</th>
		 </tr>
		 <s:iterator value="lostlist">
			<tr>
				<td><s:property value="lostman" /></td>
				<td><s:property value="ID" /></td>
				<td><s:property value="lostname" /></td>
				 <td><s:property value="model" /></td>
				  <td><s:property value="spec" /></td>
			    <td><s:property value="losttime" /></td>
				<td><s:property value="approval" /></td>
				<td><s:property value="lostmoney" /></td>
				<td><a href="shenpi.jsp?id=4&ID=<s:property value="ID" />"><s:property value="shenpi"/></a></td>
			</tr>
			</s:iterator>
	</table>
	 <a href="right.jsp">返回主页</a>
	</body>
	</html>
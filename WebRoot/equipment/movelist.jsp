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
			<th colspan="10" align="center">设备调拨列表</th>
		
		</tr>
		<tr>
			<th>设备编号</th>
			<th>设备名称</th>
			<th>型号</th>
			<th>规格</th>
			<th>起始地</th>
			<th>目的地</th>
			<th>调拨人</th>
			<th>接收人</th>
			<th>证明</th>
			<th>时间</th>
		 </tr>
		 <s:iterator value="Move">
			<tr>
				<td><s:property value="ID" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="model" /></td>
				<td><s:property value="spec" /></td>
				<td><s:property value="from" /></td>
			    <td><s:property value="to" /></td>
				<td><s:property value="moveman" /></td>
				<td><s:property value="recieveman" /></td>
				<td><s:property value="approval"/></td>
				<td><s:property value="movedate"/></td>
			</tr>
			</s:iterator>
	</table>
	${msg}<br/>
	<table width="1000px">
	<tr><td valign="middle" align="center">
第${pageNumber}页|总共${totalPage }页
<a href="movelist.action?pageNumber=1">首页</a>&nbsp;&nbsp;
<a href="movelist.action?pageNumber=${pageNumber-1}">上一页</a>&nbsp;&nbsp;
<a href="movelist.action?pageNumber=${pageNumber+1}">下一页</a>&nbsp;&nbsp;
<a href="movelist.action?pageNumber=${totalPage}">末页</a>&nbsp;&nbsp;
	 </td></tr></table>
	 <a href="right.jsp">返回主页</a>
	</body>
	</html>
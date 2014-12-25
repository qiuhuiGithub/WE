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

<title>My JSP 'equipment.jsp' starting page</title>

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
			<th colspan="17" align="center">所有设备</th>
		</tr>
		<tr>
		    <th>领用单位号</th>
			<th>单位名称</th>
			<th>ID</th>
			<th>名称</th>
			<th>型号</th>
			<th>规格</th>
			<th>价格</th>
			<th>厂商</th>
			<th>出厂号</th>
			<th>出厂日期</th>
			<th>购置日期</th>
			<th>领用人</th>
			<th>经费科目</th>
			<th>经手人</th>
			<th>部门</th>
			<th>存放地点</th>
			<th>当前状态</th>
		</tr>
		<s:iterator value="Equipment">
			<tr>
				<td><s:property value="unitno" /></td>
				<td><s:property value="unitname" /></td>
				<td><s:property value="ID" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="model" /></td>
				<td><s:property value="spec" /></td>
				<td><s:property value="price" /></td>
				<td><s:property value="vender" /></td>
				<td><s:property value="serialnumber" /></td>
				<td><s:property value="outdate" /></td>
				<td><s:property value="buydate" /></td>
				<td><s:property value="useman" /></td>
				<td><s:property value="researchno" /></td>
				<td><s:property value="brokerman" /></td>
				<td><s:property value="partment" /></td>
				<td><s:property value="location" /></td>
				<td><s:property value="status" /></td>
			</tr>
		</s:iterator>
	</table>
	${msg}<br/>
	<table width="1000px">
	<tr><td valign="middle" align="center">
第${pageNumber}页|总共${totalPage }页
<a href="equiplist.action?pageNumber=1">首页</a>&nbsp;&nbsp;
<a href="equiplist.action?pageNumber=${pageNumber-1}">上一页</a>&nbsp;&nbsp;
<a href="equiplist.action?pageNumber=${pageNumber+1}">下一页</a>&nbsp;&nbsp;
<a href="equiplist.action?pageNumber=${totalPage}">末页</a>&nbsp;&nbsp;
	 </td></tr></table>
	 <a href="right.jsp">返回主页</a>
</body>
</html>

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

</head>

<body bgcolor=ADD2DA>
<div style="overflow:auto;height:100%px">
	<table align="center" border="1" style="width:1470px;">
		<tr>
			<th colspan="19" align="center">按厂家查询</th>
		
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
			<th>编辑</th>
			<th>删除</th>
		 </tr>
		 <s:iterator value="venderlist">
			<tr>
				<td><s:property value="unitno" /></td>
				<td><s:property value="unitname" /></td>
				<td><s:property value="ID" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="model" /></td>
			    <td><s:property value="spec" /></td>
				<td><s:property value="price" /></td>
				<td><s:property value="vender" /></td>
				<td><s:property value="serialnumber"/></td>
				<td><s:property value="outdate"/></td>
				<td><s:property value="buydate"/></td>
				<td><s:property value="useman" /></td>
				<td><s:property value="researchno" /></td>
				<td><s:property value="brokerman" /></td>
				<td><s:property value="partment" /></td>
				<td><s:property value="location"/></td>
				<td><s:property value="status"/></td>
				<td><a href="select.action?ID=${ID}">编辑</a></td>
				<td><a href="delete.action?ID=${ID}">删除</a></td>
			</tr>
	   </s:iterator>
	</table>
	</div>
	<form action="equipment/editquery2.jsp" method="post">
	<input type="submit" name="submit" value="查询">
	</form>
	 <a href="right.jsp">返回主页</a>
	</body>
	</html>
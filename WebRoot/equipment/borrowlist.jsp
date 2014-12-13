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
			<th colspan="7" align="center">设备借出列表</th>
		
		</tr>
		<tr>
			<td>借用单位号</td>
			<td>借用单位名称</td>
			<td>设备编号</td>
			<td>领用人</td>
			<td>经费科目</td>
			<td>科研号</td>
			<td>经手人</td>
		 </tr>
		 <s:iterator value="Borrow">
			<tr>
				<td><s:property value="unitno" /></td>
				<td><s:property value="unitname" /></td>
				<td><s:property value="ID" /></td>
			    <td><s:property value="recipients" /></td>
				<td><s:property value="money" /></td>
				<td><s:property value="researchno" /></td>
				<td><s:property value="brokerage"/></td>
			</tr>
			</s:iterator>
	</table>
	${msg}<br/>
	<table width="1000px">
	<tr><td valign="middle" align="center">
第${pageNumber}页|总共${totalPage }页
<a href="borrowlist.action?pageNumber=1">首页</a>&nbsp;&nbsp;
<a href="borrowlist.action?pageNumber=${pageNumber-1}">上一页</a>&nbsp;&nbsp;
<a href="borrowlist.action?pageNumber=${pageNumber+1}">下一页</a>&nbsp;&nbsp;
<a href="borrowlist.action?pageNumber=${totalPage}">末页</a>&nbsp;&nbsp;
	 </td></tr></table>
	 <a href="right.jsp">返回主页</a>
	</body>
	</html>
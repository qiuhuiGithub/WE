<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="StyleSheet" href="dtree.css" type="text/css" />
	<script type="text/javascript" src="dtree.js"></script>
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<div class="dtree">
<p><a href="javascript: d.openAll();">全部打开</a> | <a href="javascript: d.closeAll();">全部关闭</a></p>
	<script type="text/javascript">
		d = new dTree('d');

		d.add(0,-1,'设备管理');
		d.add(1,0,'设备查询');
		d.add(10,1,'部门设备','partlist.action?username=<s:property value="username" />',"","right");
		d.add(2,1,'设备查询','equipment/querybyuser.jsp?username=<s:property value="username" />',"","right");
		d.add(3,0,'业务列表');
		d.add(4,3,'设备购置','userbuy.jsp',"","right");
		d.add(5,3,'设备借出','userborrow.jsp',"","right");
		d.add(6,3,'设备报废','userbroke.jsp',"","right");
		d.add(7,3,'设备报失','userlost.jsp',"","right");
		d.add(8,3,'设备移动','usermove.jsp',"","right");
		d.add(9,0,'回收站','mainuser.jsp','','img/trash.gif');
		document.write(d);
		</script>
</div>
  </body>
</html>

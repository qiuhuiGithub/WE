<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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

		d.add(0,-1,'设备查询');
		//d.add(1,0,'设备列表','list.action',"","right");
		//d.add(2,0,'设备增加','equipment/equipadd.jsp',"","right");
		d.add(3,0,'设备查询','left.jsp',"","left");
		d.add(4,3,'按设备名称查询','equipment/query.jsp',"","right");
		d.add(5,3,'按设备ID查询','equipment/query1.jsp',"","right");
		d.add(6,3,'按厂商查询','equipment/query2.jsp',"","right");
		d.add(7,3,'按价格查询','equipment/query3.jsp',"","right");
		/* d.add(8,0,'申请借用','equipment/borrowbyuser.jsp',"","right");
		d.add(9,0,'申请结果','rusultlist.action',"","right"); */
		//d.add(10,0,'设备报废','equipment/equipdelete.jsp',"","right");
		//d.add(11,0,'设备报失','equipment/equiplost.jsp',"","right");
		//d.add(12,0,'设备移动','equipment/equipmove.jsp',"","right");
		d.add(13,0,'回收站','left2.jsp','','','img/trash.gif');

		document.write(d);
		</script>

</div>
  </body>
</html>

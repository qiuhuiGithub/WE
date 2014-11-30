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

		d.add(0,-1,'设备管理');
		d.add(1,0,'设备列表','equiplist.action',"","right");
	//	d.add(2,0,'设备增加','equipment/equipadd.jsp',"","right");
		d.add(3,0,'设备查询','left.jsp',"","left");
		d.add(4,3,'按设备名称查询','equipment/query.jsp',"","right");
		d.add(5,3,'按设备ID查询','equipment/query1.jsp',"","right");
		d.add(6,3,'按厂商查询','equipment/query2.jsp',"","right");
		d.add(7,3,'按价格查询','equipment/query3.jsp',"","right");
	//	d.add(8,0,'设备借出','equipment/borrow.jsp',"","right");
		d.add(9,0,'借出列表','borrowlist.action',"","right");
		d.add(10,0,'报废列表','brokelist.action',"","right");
		d.add(11,0,'报失列表','lostlist.action',"","right");
		d.add(12,0,'移动列表','movelist.action',"","right");
		d.add(14,0,'申请列表','borrowbyuserlist.action',"","right");
		d.add(13,0,'回收站','left.jsp','','','img/trash.gif');

		document.write(d);
		</script>
		<br>
		<p><a href="javascript: e.openAll();">全部打开</a> | <a href="javascript: e.closeAll();">全部关闭</a></p>
		<script type="text/javascript">
		e = new dTree('e');
		e.add(0,-1,'权限管理');
		e.add(1,0,'管理员','left.jsp',"","left");
		e.add(2,1,'管理员员列表','list.action?id=1',"","right");
		/* e.add(3,1,'修改权限','change.action?id=1',"","right"); */
		e.add(4,0,'数据员','left.jsp',"","left");
		e.add(5,4,'数据员列表','list.action?id=2',"","right");
		/* e.add(6,4,'修改权限','change.action?id=2',"","right"); */
		e.add(7,0,'普通用户','left.jsp',"","left");
		e.add(8,7,'用户列表','list.action?id=3',"","right");
		/* e.add(9,7,'修改权限','change.action?id=3',"","right"); */
		e.add(10,0,'回收站','left.jsp','','','img/trash.gif');

		document.write(e);

	</script>
</div>
  </body>
</html>

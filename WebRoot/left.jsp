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

		d.add(0,-1,'设备管理系统');
		d.add(1,0,'设备管理');
		d.add(2,0,'设备审批');
		//d.add(3,0,'文档管理','left.jsp',"","left");
		d.add(4,0,'权限管理');
		d.add(40,1,'设备列表');
		d.add(5,40,'所有设备','equiplist.action',"","right");
	//	d.add(6,40,'按价格','left.jsp',"","right");
		d.add(7,40,'按设备状态');
		d.add(8,40,'按部门');
		d.add(9,0,'设备查询');
		d.add(16,2,'设备购置','equiplist1.action',"","right");//购置
		d.add(10,2,'设备报废','brokelist1.action',"","right");//报废
		d.add(11,2,'设备报失','lostlist1.action',"","right");//报失
		d.add(12,2,'设备移动','movelist1.action',"","right");//移动
		d.add(13,2,'设备借出','borrowlist1.action',"","right");//借出
		//d.add(14,3,'所有文档','movelist.action',"","right");
		
		d.add(15,4,'管理员','list.action?id=1',"","right");
		//d.add(16,4,'数据员','left.jsp',"","left");
		d.add(17,4,'数据员','list.action?id=2',"","right");	
		//d.add(18,4,'普通用户','left.jsp',"","left");
		d.add(19,4,'用户','list.action?id=3',"","right");
		d.add(20,0,'回收站','left.jsp','','','img/trash.gif');
		//d.add(21,6,'0-1000元','list.action?id=3',"","right");
		//d.add(22,6,'1000-2000元','list.action?id=3',"","right");
		//d.add(23,6,'2000元以上','list.action?id=3',"","right");
		d.add(24,7,'在用','equiplist1.action?id=10',"","right");
		d.add(25,7,'报废','equiplist1.action?id=2',"","right");
		d.add(26,7,'丢失','equiplist1.action?id=3',"","right");
		d.add(27,7,'外借','equiplist1.action?id=4',"","right");
		d.add(28,9,'按ID','equipment/query1.jsp',"","right");
		d.add(29,9,'按名称','equipment/query.jsp',"","right");
		d.add(30,9,'按价格','equipment/query3.jsp',"","right");
		d.add(31,9,'按厂家','equipment/query2.jsp',"","right");
		d.add(32,8,'舞蹈组','equiplist1.action?id=5',"","right");
		d.add(33,8,'仿人组','equiplist1.action?id=6',"","right");
		d.add(34,8,'对抗组','equiplist1.action?id=7',"","right");
		d.add(35,8,'熊猫组','equiplist1.action?id=8',"","right");
		d.add(36,1,'借出列表','borrowlist.action',"","right");
		d.add(37,1,'报废列表','brokelist.action',"","right");
		d.add(38,1,'报失列表','lostlist.action',"","right");
		d.add(39,1,'移动列表','movelist.action',"","right");
		document.write(d);
		</script>
</div>
  </body>
</html>

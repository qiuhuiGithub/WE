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
		d.add(36,0,'设备管理');//移动
		d.add(21,36,'设备列表');//移动
		d.add(22,21,'所有设备','equiplist.action?id=1',"","right");
		d.add(23,21,'按设备状态');
		d.add(28,21,'按部门');
		d.add(24,23,'在用','equiplist1.action?id=10&dou=1',"","right");
		d.add(25,23,'报废','equiplist1.action?id=2&dou=1',"","right");
		d.add(26,23,'丢失','equiplist1.action?id=3&dou=1',"","right");
		d.add(27,23,'外借','equiplist1.action?id=4&dou=1',"","right");
		d.add(32,28,'舞蹈组','equiplist1.action?id=5&dou=1',"","right");
		d.add(33,28,'仿人组','equiplist1.action?id=6&dou=1',"","right");
		d.add(34,28,'对抗组','equiplist1.action?id=7&dou=1',"","right");
		d.add(35,28,'熊猫组','equiplist1.action?id=8&dou=1',"","right");
		d.add(1,0,'审批列表');
		d.add(20,0,'业务管理');
		d.add(3,0,'设备查询');
		d.add(2,20,'设备增加','equipadd.jsp',"","right");
		d.add(4,3,'按设备名称查询','equipment/editquery.jsp',"","right");
		d.add(5,3,'按设备ID查询','equipment/editquery1.jsp',"","right");
		d.add(6,3,'按厂商查询','equipment/editquery2.jsp',"","right");
		d.add(7,3,'按价格查询','equipment/editquery3.jsp',"","right");
		d.add(8,20,'设备借出','borrow.jsp',"","right");
		//d.add(9,0,'借出列表','borrowlist.action',"","right");
		d.add(10,20,'设备报废','equipdelete.jsp',"","right");
		d.add(11,20,'设备报失','equiplost.jsp',"","right");
		d.add(12,20,'设备移动','equipmove.jsp',"","right");
		d.add(16,1,'购置列表','equiplist1.action?id=1',"","_blank");//购置
		d.add(17,1,'报废列表','brokelist1.action?id=1',"","_blank");//报废
		d.add(18,1,'报失列表','lostlist1.action?id=1',"","_blank");//报失
		d.add(19,1,'移动列表','movelist1.action?id=1',"","_blank");//移动
		d.add(10,1,'借出列表','borrowlist1.action?id=1',"","_blank");//借出
		d.add(40,36,'借出列表','borrowlist.action?id=1',"","right");
		d.add(37,36,'报废列表','brokelist.action?id=1',"","right");
		d.add(38,36,'报失列表','lostlist.action?id=1',"","right");
		d.add(39,36,'移动列表','movelist.action?id=1',"","right");
		d.add(13,36,'回收站','left1.jsp','','','img/trash.gif');
		document.write(d);
		</script>
</div>
  </body>
</html>

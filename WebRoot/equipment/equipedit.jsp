<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
    <title>My JSP 'equipedit.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <h2 align="center">设备编辑页面</h2>
  <body bgcolor=d3eaef>
  <form action="edit.action" method="post">
  <table align="center" border="0" style="width:50%;" >
  <tr>
  <td>领用单位号:</td>
  <td>
  <input type="text" name="unitno" value=<s:property value="Equipment.unitno" />>
  </td>
  <!-- </tr>
  <tr> -->
  <td>单位名称:</td>
  <td>
  <input type="text" name="unitname" value=<s:property value="Equipment.unitname" />>
  </td>
  </tr>
  <tr>
  <td>设备名称:</td>
  <td>
  <input type="text" name="name" value=<s:property value="Equipment.name" />>
  </td>
 <!--  </tr>
  <tr> -->
  <td>设备型号:</td>
  <td>
  <input type="text" name="model" value=<s:property value="Equipment.model" />>
  </td>
  </tr>
  <tr>
  <td>设备规格:</td>
  <td>
	<input type="text" name="spec" value=<s:property value="Equipment.spec" />>  
  </td>
  <!-- </tr>
  <tr> -->
  <td>设备价格：</td>
  <td>
  <input type="text" name="price" value=<s:property value="Equipment.price" />>  
  </td>
  </tr>
  <tr>
  <td>厂商：</td>
  <td><input type="text" name="vender" value=<s:property value="Equipment.vender" />></td>
 <!--  </tr>
  <tr> -->
  <td>出厂号：</td>
  <td>
  <input type="text" name="serialnumber" value=<s:property value="Equipment.serialnumber" />>
  </td>
  </tr>
  <tr>
  <td>出厂日期：</td>
  <td><input id="d11" name="outdate" type="text" onClick="WdatePicker()"value=<s:property value="Equipment.outdate" />></td>
  <!-- </tr>
  <tr> -->
  <td>购置日期：</td>
  <td><input id="d11" name="buydate" type="text" onClick="WdatePicker()" value=<s:property value="Equipment.buydate" />></td>
  </tr>
  <tr>
  <td>领用人:</td>
  <td>
  <input type="text" name="useman" value=<s:property value="Equipment.useman" />>
  </td>
 <!--  </tr>
  <tr> -->
  <td>经费科目:</td>
  <td>
  <input type="text" name="researchno" value=<s:property value="Equipment.researchno" />>
  </td>
  </tr>
  <tr>
  <td>经手人:</td>
  <td>
  <input type="text" name="brokerman" value=<s:property value="Equipment.brokerman" />>
  </td>
  <!-- </tr>
  <tr> -->
  <td>部门:</td>
  <td>
  <input type="text" name="partment" value=<s:property value="Equipment.partment" />>
  </td>
  </tr>
  <tr>
  <td>存放位置：</td>
  <td><input type="text" name="location" value=<s:property value="Equipment.location" />></td>
<!-- 	</tr><tr> -->
  <td>当前状态：</td>
  <td><input type="text" name="status" value=<s:property value="Equipment.status" />></td>
  </tr>
  <tr>
  <td>
  <input type="submit" name="submit" value="编辑" style="width:50px; height:25px; background-color:white;border:solid 1px #153966;font-size:12px; color:black;">
  <input type="reset" name="reset" value="重置" style="width:50px; height:25px; background-color:white; border:solid 1px #153966; font-size:12px; color:black;">
  <input type="hidden" name="ID" value=<s:property value="Equipment.ID" />>
  </td>
  </tr>
  </table>
  </form>
  </body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'borrow.jsp' starting page</title>
    
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
  <h1 align="center">仪器调拨界面</h1>
  <form action="move.action" method="post">
  <table align="center">
  <tr>
  <td>
  	设备ID:
  	</td>
  <td><input type="text" name="ID"></td>
  </tr>
  <tr>
  <td>
  	设备名称:
  	</td>
  <td><input type="text" name="name"></td>
  </tr>
  <tr>
  <td>
   出发地：
  </td>
   <td><input type="text" name="from"></td>
  </tr>
  <tr>
  <td>
   目的地：
  </td>
   <td><input type="text" name="to"></td>
  </tr>
  <tr>
  <td>
  	调拨人:
  	</td>
  <td><input type="text" name="moveman"></td>
  </tr>
  <tr>
  <td>
  	接收人:
  	</td>
  <td><input type="text" name="recieveman"></td>
  </tr>
  <tr>
  <td>
  	证明:
  	</td>
  <td><input type="text" name="approval"></td>
  </tr>
  <tr>
  <td>
  	日期:
  	</td>
  <td><input type="text" name="movedate"></td>
  </tr>
  <tr><td><input type="submit"  name="submit" value="调拨"></td>
  <td><input type="reset"  name="reset" value="重置"></td></tr>
  </table>
  </form>
  </body>
</html>

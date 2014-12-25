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
  <script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
  <body bgcolor=d3eaef>
  <h1 align="center">设备报失界面</h1>
  <form action="lost.action" method="post">
  <table class="table table-hover" align="center">
  <tr>
  <td>
  	报失人:
  	</td>
  <td><input type="text" name="lostman"></td>
 <!--  </tr>
  <tr> -->
  <td>
  	设备ID:
  	</td>
  <td><input type="text" name="ID"></td>
  </tr>
  <tr>
  <td>
  	丢失设备:
  	</td>
  <td><input type="text" name="lostname"></td>
  <!-- </tr>
  <tr> -->
  <td>
  	型号:
  	</td>
  <td><input type="text" name="model"></td>
  </tr>
  <tr>
  <td>
  	规格:
  	</td>
  <td><input type="text" name="spec"></td>
  <!-- </tr>
  <tr> -->
  <td>
  	丢失时间:
  	</td>
  <td><input id="d6" name="losttime" type="text" onClick="WdatePicker()"/></td>
  </tr>
  <tr>
  <td>
  	证明:
  	</td>
  <td><input type="text" name="approval"></td>
  <!-- </tr>
  <tr> -->
  <td>
  	金额:
  	</td>
  <td><input type="text" name="lostmoney"></td>
  </tr>
  <tr><td><input type="submit"  name="submit" value="提交"></td>
  <td><input type="reset"  name="reset" value="重置"></td><td><input type="hidden" name="i" value="1"></td></tr>
  </table>
  </form>
  </body>
</html>

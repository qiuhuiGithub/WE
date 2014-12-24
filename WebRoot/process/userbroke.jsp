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
  <h1 align="center">设备报废界面</h1>
  <form action="broke.action" method="post">
  <table align="center">
  <tr>
  <td>
  	损坏人:
  	</td>
  <td><input type="text" name="brokeman"></td>
  </tr>
  <tr>
  <td>
  	损坏原因:
  	</td>
  <td><input type="text" name="reason"></td>
  </tr>
  <tr>
  <td>
  	设备ID:
  	</td>
  <td><input type="text" name="ID"></td>
  </tr>
  <tr>
  <td>
  	损坏设备:
  	</td>
  <td><input type="text" name="brokename"></td>
  </tr>
  <tr>
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
  </tr>
  <tr>
  <td>
  	证明:
  	</td>
  <td><input type="text" name="approval"></td>
  </tr>
  <tr>
  <td>
  	损坏时间:
  	</td>
  <td><input id="d3" name="broketime" type="text" onClick="WdatePicker()"/></td>
  </tr>
  <tr>
  <td>
  	金额:
  	</td>
  <td><input type="text" name="brokemoney"></td>
  <td><input type="hidden" name="i" value="1"></td>
  </tr>
  <tr><td><input type="submit"  name="submit" value="提交"></td>
  <td><input type="reset"  name="reset" value="重置"></td></tr>
  </table>
  </form>
  </body>
</html>

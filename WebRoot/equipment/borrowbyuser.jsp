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
  <h1 align="center">申请借用</h1>
  <form action="borrowbyuser.action" method="post">
  <table align="center">
  <tr>
  <td>
  	借用人:
  	</td>
  <td><input type="text" name="borrowman"></td>
  </tr>
  <tr>
  <td>
  	职业:
  	</td>
  <td><input type="text" name="profession"></td>
  </tr>
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
  	借用日期:
  	</td>
  <td><input type="text" name="time"></td>
  </tr>
  <tr><td><input type="submit"  name="submit" value="提交"></td>
  <td><input type="reset"  name="reset" value="重置"></td></tr>
  </table>
  </form>
  </body>
</html>

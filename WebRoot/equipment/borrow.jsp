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
  <h1 align="center">仪器借出界面</h1>
  <form action="borrow.action" method="post">
  <table align="center">
  <tr>
  <td>
  	借用单位号:
  	</td>
  <td><input type="text" name="unitno"></td>
  </tr>
  <tr>
  <td>
  	借用单位名称:
  	</td>
  <td><input type="text" name="unitname"></td>
  </tr>
  <tr>
  <td>
  	设备ID:：
  	</td>
  <td><input type="text" name="ID"></td>
  </tr>
  <tr>
  <td>
  	领用人:：
  	</td>
  <td><input type="text" name="recipients"></td>
  </tr>
  <tr>
  <td>
  	经费科目:：
  	</td>
  <td><input type="text" name="money"></td>
  </tr>
  <tr>
  <td>
  	科研号:：
  	</td>
  <td><input type="text" name="researchno"></td>
  </tr>
  <tr>
  <td>
  	经手人:：
  	</td>
  <td><input type="text" name="brokerage"></td>
  </tr>
  <tr><td><input type="submit"  name="submit" value="借出"></td>
  <td><input type="reset"  name="reset" value="重置"></td></tr>
  </table>
  </form>
  </body>
</html>

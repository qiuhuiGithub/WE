<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shenpi.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
 <%
	String name=request.getParameter("id");
	String II=request.getParameter("ID");
	%>
  <body>
  <h1>审批页面</h1>
 <form action="shenpi.action" method="post">
 <table>
 <tr><td>
 <input type="hidden" name="i" value=<%=name %>>
 <input type="hidden" name="ID" value=<%=II %>>
  <tr>
    <td>
    	意见：
    </td>
    <td>
   <select name="shenpi">
   <option value="同意">
   	同意</option>
   	<option value="不同意">
   	不同意</option>
   	</select>
    </td>
    </tr>
     <tr><td><input type="submit" name="submit" value="提交"></td></tr>
 </table>
 </form>
  </body>
</html>

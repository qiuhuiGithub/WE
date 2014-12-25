<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<%@ page import="java.sql.*" %>
<%@ page import="database.DbCtrl"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   <!--  <meta http-equiv="Content-Type" content="text/html; charset=gb2312"> -->
    <title>My JSP 'content.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
  </head>
  
  <body>
    <table>
    <%
    	/* String name1=request.getParameter("name"); */
    	String name1 = new String(request.getParameter("name").getBytes("ISO-8859-1"),"UTF-8");
    	System.out.println(name1);
		Connection conn=null;
		Statement stmt1,stmt,stmt2;
		DbCtrl dbctrl;
		dbctrl=new DbCtrl();
		String value=null;
		conn=dbctrl.getConnection();
		String sql="select content from paper where name='"+name1+"'";
		stmt=conn.createStatement();
		ResultSet result=stmt.executeQuery(sql);
		if(result.next()){
			value=result.getString(1);
				}
		%>
	<tr><td valign="middle" align="center"> <h2><%=name1 %></h2></td></tr>
    <tr><td><textarea name="area"cols ="140" rows = "10"><%=value %></textarea></td></tr>
    </table>
  </body>
</html>

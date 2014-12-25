<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<%@ page import="java.sql.*" %>
<%@ page import="database.DbCtrl"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'equipadd.jsp' starting page</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
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
<!--   <body style="background:url('images/regist1.jpg') no-repeat;"> -->
<body  bgcolor=d3eaef>
  <form action="add.action" method="post">
<!--   <table align="center" border="1" style="width:80%;"> -->
 <table class="table table-condensed" align="left">
<%
		Connection conn=null;
		Statement stmt1,stmt,stmt2;
		DbCtrl dbctrl;
		int n=0; 
		dbctrl=new DbCtrl();
		conn=dbctrl.getConnection();
		String sql="select n from number";
		stmt=conn.createStatement();
		ResultSet result=stmt.executeQuery(sql);
		if(result.next()){
			n=result.getInt(1);
				}				
				String ID=""+n;
		%>

<tr>
<td align="left">标题</td>
<td align="left"><input type="text" name="name"></td></tr>
  <tr>
<td align="left">类型</td>
<td align="left">
   <select name="type">
   <option value="合同">
   	合同</option>
   	<option value="使用手册">
   	使用手册</option>
   	<option value="设计手册">
   	设计手册</option>
   		<option value="其它文档">
   	其它文档</option>
   	</select>
    </td>
<tr>
<td align="left">内容</td>
<td align="left"><textarea name="content" cols ="140" rows = "10"></textarea></td></tr>
  <tr>
  <td>
  <input type="submit" name="submit" value="增加">
  <input type="reset" name="reset" value="重置">
  <input type="hidden" name="i" value=<%=20 %>>
  </td>
  </tr>
  </table>
  </form>
  </body>
</html>

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
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
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
  <script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
  <h2 align="center">设备增加页面</h2>
  <body style="background:url('images/regist1.jpg') no-repeat;">
  <form action="add.action" method="post">
 <!--  <table align="center" border="1" style="width:50%;"> -->
 <table>
<%
		Connection conn=null;
		Statement stmt1,stmt,stmt2;
		DbCtrl dbctrl;
		long num;
		int n=0; 
		dbctrl=new DbCtrl();
		conn=dbctrl.getConnection();
		String datetime=new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()); 
		long m = Long.parseLong((datetime)) * 10000;
		String sql="select n from number";
		stmt=conn.createStatement();
		ResultSet result=stmt.executeQuery(sql);
		if(result.next()){
			n=result.getInt(1);
				}
				 num = m + n;
				String ID=""+num;
		%>
		
  <tr>
  <td>设备ID:</td>
  <td>
  <input type="text" name="ID" value=<%=ID %>>
  </td>
  </tr>
	<tr>
  <td>领用单位号:</td>
  <td>
  <input type="text" name="unitno">
  </td>
  </tr>
  <tr>
  <td>单位名称:</td>
  <td>
  <input type="text" name="unitname">
  </td>
  </tr>
  <tr>
  <td>设备名称:</td>
  <td>
  <input type="text" name="name">
  </td>
  </tr>
  <tr>
  <td>设备型号:</td>
  <td>
  <input type="text" name="model">
  </td>
  </tr>
  <tr>
  <td>设备规格:</td>
  <td>
	<input type="text" name="spec">  
  </td>
  </tr>
  <tr>
  <td>设备价格：</td>
  <td>
  <input type="text" name="price">  
  </td>
  </tr>
  <tr>
  <td>厂商：</td>
  <td><input type="text" name="vender"></td>
  </tr>
  <tr>
  <td>出厂号：</td>
  <td>
  <input type="text" name="serialnumber">
  </td>
  </tr>
  <tr>
  <td>购置日期：</td>
  <!-- <td>
  <select name="buyyear" style="width:65px; height:17px; background-color:white; border:solid 1px #153966; font-size:12px; color:black; ">
   <option value="2005年">
   	2005年</option>
   	<option value="2006年">
   	2006年</option>
   	<option value="2007年">
   	2007年</option>
   	<option value="2008年">
   	2008年</option>
   	<option value="2009年">
   	2009年</option>
   <option value="2010年">
   	2010年</option>
   	<option value="2011年">
   	2011年</option>
   	<option value="2012年">
   	2012年</option>
   	<option value="2013年">
   	2013年</option>
   	<option value="2014年">
   	2014年</option>
   	</select>
   	 <select name="buymonth" style="width:50px; height:17px; background-color:white; border:solid 1px #153966; font-size:12px; color:black; ">
   <option value="1月">
   	1月</option>
   	<option value="2月">
   	2月</option>
   	<option value="3月">
   	3月</option>
   	<option value="4月">
   	4月</option>
   	<option value="5月">
   	5月</option>
   	<option value="6月">
   	6月</option>
   	<option value="7月">
   	7月</option>
   	<option value="8月">
   	8月</option>
   	<option value="9月">
   	9月</option>
   	<option value="10月">
   	10月</option>	
   	<option value="11月">
   	11月</option>
   	<option value="12月">
   	12月</option>
   	</select>
  </td> -->
  <td><input id="d11" name="buydate" type="text" onClick="WdatePicker()"/></td>
  </tr>
  <tr>
  <td>出厂日期：</td>
  <!-- <td>
  <select name="outyear" style="width:65px; height:17px; background-color:white; border:solid 1px #153966; font-size:12px; color:black; ">
   <option value="2005年">
   	2005年</option>
   	<option value="2006年">
   	2006年</option>
   	<option value="2007年">
   	2007年</option>
   	<option value="2008年">
   	2008年</option>
   	<option value="2009年">
   	2009年</option>
   <option value="2010年">
   	2010年</option>
   	<option value="2011年">
   	2011年</option>
   	<option value="2012年">
   	2012年</option>
   	<option value="2013年">
   	2013年</option>
   	<option value="2014年">
   	2014年</option>
   	</select>
   	 <select name="outmonth" style="width:50px; height:17px; background-color:white; border:solid 1px #153966; font-size:12px; color:black; ">
   <option value="1月">
   	1月</option>
   	<option value="2月">
   	2月</option>
   	<option value="3月">
   	3月</option>
   	<option value="4月">
   	4月</option>
   	<option value="5月">
   	5月</option>
   	<option value="6月">
   	6月</option>
   	<option value="7月">
   	7月</option>
   	<option value="8月">
   	8月</option>
   	<option value="9月">
   	9月</option>
   	<option value="10月">
   	10月</option>	
   	<option value="11月">
   	11月</option>
   	<option value="12月">
   	12月</option>
   	</select> -->
  <td><input id="d11" name="outdate" type="text" onClick="WdatePicker()"/></td>
  </tr>
  <tr>
  <td>领用人:</td>
  <td>
  <input type="text" name="useman">
  </td>
  </tr>
  <tr>
  <td>经费科目:</td>
  <td>
  <input type="text" name="researchno">
  </td>
  </tr>
  <tr>
  <td>经手人:</td>
  <td>
  <input type="text" name="brokerman">
  </td>
  </tr>
  <tr>
  <td>部门:</td>
  <td>
  <input type="text" name="partment">
  </td>
  </tr>
  <tr>
  <td>存放位置：</td>
  <td><input type="text" name="location"></td>
  </tr>
  <tr>
  <td>
  <input type="submit" name="submit" value="增加">
  <input type="reset" name="reset" value="重置">
  <input type="hidden" name="n" value=<%=n %>>
  </td>
  </tr>
  </table>
  </form>
  </body>
</html>

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
	
  </head>
  <script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
  <h2 align="center">设备增加页面</h2>
<!--   <body style="background:url('images/regist1.jpg') no-repeat;"> -->
<body  bgcolor=d3eaef>
  <form action="add.action" method="post">
<!--   <table align="center" border="1" style="width:80%;"> -->
 <table class="table table-condensed" align="center">
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
  <!-- </tr>
	<tr> -->
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
 <!--  </tr>
  <tr> -->
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
 <!--  </tr>
  <tr> -->
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
 <!--  </tr>
  <tr> -->
  <td>厂商：</td>
  <td><input type="text" name="vender"></td>
  </tr>
  <tr>
  <td>出厂号：</td>
  <td>
  <input type="text" name="serialnumber">
  </td>
  <!-- </tr>
  <tr> -->
  <td>购置日期：</td>
  <td><input id="d11" name="buydate" type="text" onClick="WdatePicker()"/></td>
  </tr>
  <tr>
  <td>出厂日期：</td>
  <td><input id="d12" name="outdate" type="text" onClick="WdatePicker()"/></td>
  <!-- </tr>
  <tr> -->
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
  <!-- </tr>
  <tr> -->
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
 <!--  </tr>
  <tr> -->
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

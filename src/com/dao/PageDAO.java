package com.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javabean.Lost;
import database.DbCtrl; 
public class PageDAO {
DbCtrl dbc = new DbCtrl();
private Lost lost;
PreparedStatement ps;
ResultSet rs;
public List<Lost> Lost(int pageSize,int pageNumber){
List<Lost> list=new ArrayList<Lost>();
// sql="select * from (select a.*,rownum as a_rownum from (select * from tb_car order by car_id) a where rownum<=pageSize) b where b.a_rownum> (pageNumber*pageSize-pageSize)";
try {
 if(pageSize>0&&pageNumber>0){
ps=dbc.getConnection().prepareStatement("select * from lost limit "+(pageNumber*pageSize-pageSize)+","+pageSize);
}
rs=ps.executeQuery();
while(rs.next()){
lost=new Lost();
lost.setLostman(rs.getString(1));
 lost.setID(rs.getString(2));
lost.setLostname(rs.getString(3));
lost.setModel(rs.getString(4));
lost.setSpec(rs.getString(5));
lost.setLosttime(rs.getString(6));
lost.setApproval(rs.getString(7));
lost.setLostmoney(rs.getString(8));
list.add(lost);
 }
list.toArray();
} catch (Exception e) {
e.printStackTrace();
}
return list;
}
//获得总记录数?
public int getLostAmount(){
int i=0;
String sql="select count(*) from lost";
PreparedStatement ps=null;
try {
 ps=dbc.getConnection().prepareStatement(sql);
 ResultSet rs =ps.executeQuery();
if(rs.next()){
 i=rs.getInt(1);
}
 } catch (Exception e) {
e.printStackTrace();
 }
 return i;
 }
}
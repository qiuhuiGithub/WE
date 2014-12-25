package com.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javabean.Broke;
import database.DbCtrl; 
public class PageDAOBroke {
DbCtrl dbc = new DbCtrl();
PreparedStatement ps;
ResultSet rs;
public List<Broke> Broke(int pageSize,int pageNumber){
List<Broke> list=new ArrayList<Broke>();
// sql="select * from (select a.*,rownum as a_rownum from (select * from tb_car order by car_id) a where rownum<=pageSize) b where b.a_rownum> (pageNumber*pageSize-pageSize)";
try {
 if(pageSize>0&&pageNumber>0){
ps=dbc.getConnection().prepareStatement("select * from broken limit "+(pageNumber*pageSize-pageSize)+","+pageSize);
}
rs=ps.executeQuery();
while(rs.next()){
	Broke tmp=new Broke();
	tmp.setBrokeman(rs.getString(1));
	tmp.setReason(rs.getString(2));
	tmp.setID(rs.getString(3));
	tmp.setBrokename(rs.getString(4));
	tmp.setModel(rs.getString(5));
	tmp.setSpec(rs.getString(6));
	tmp.setApproval(rs.getString(7));
	tmp.setBroketime(rs.getString(8));
	tmp.setBrokemoney(rs.getString(9));
	list.add(tmp);
 }
list.toArray();
} catch (Exception e) {
e.printStackTrace();
}
return list;
}
//获得总记录数?
public int getBrokeAmount(){
int i=0;
String sql="select count(*) from broken";
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
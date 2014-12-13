package com.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javabean.Equipment;
import database.DbCtrl; 
public class PageDAOEquip {
DbCtrl dbc = new DbCtrl();
PreparedStatement ps;
ResultSet rs;
public List<Equipment> Equipment(int pageSize,int pageNumber){
List<Equipment> list=new ArrayList<Equipment>();
// sql="select * from (select a.*,rownum as a_rownum from (select * from tb_car order by car_id) a where rownum<=pageSize) b where b.a_rownum> (pageNumber*pageSize-pageSize)";
try {
 if(pageSize>0&&pageNumber>0){
ps=dbc.getConnection().prepareStatement("select * from equipment limit "+(pageNumber*pageSize-pageSize)+","+pageSize);
}
rs=ps.executeQuery();
while(rs.next()){
	Equipment tmp=new Equipment();
	tmp.setUnitno(rs.getString(1));
	tmp.setUnitname(rs.getString(2));
	tmp.setID(rs.getString(3));
	tmp.setName(rs.getString(4));
	tmp.setModel(rs.getString(5));
	tmp.setSpec(rs.getString(6));
	tmp.setPrice(rs.getDouble(7));
	tmp.setVender(rs.getString(8));
	tmp.setSerialnumber(rs.getString(9));
	tmp.setBuydate(rs.getString(10));
	tmp.setOutdate(rs.getString(11));
	tmp.setUseman(rs.getString(12));
	tmp.setResearchno(rs.getString(13));
	tmp.setBrokerman(rs.getString(14));
	tmp.setLocation(rs.getString(15));
	tmp.setStatus(rs.getString(16));
	list.add(tmp);
 }
list.toArray();
} catch (Exception e) {
e.printStackTrace();
}
return list;
}
//获得总记录数?
public int getEquipmentAmount(){
int i=0;
String sql="select count(*) from equipment";
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
package com.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javabean.Move;
import database.DbCtrl; 
public class PageDAOMove {
DbCtrl dbc = new DbCtrl();
PreparedStatement ps;
ResultSet rs;
public List<Move> Move(int pageSize,int pageNumber){
List<Move> list=new ArrayList<Move>();
// sql="select * from (select a.*,rownum as a_rownum from (select * from tb_car order by car_id) a where rownum<=pageSize) b where b.a_rownum> (pageNumber*pageSize-pageSize)";
try {
 if(pageSize>0&&pageNumber>0){
ps=dbc.getConnection().prepareStatement("select * from move limit "+(pageNumber*pageSize-pageSize)+","+pageSize);
}
rs=ps.executeQuery();
while(rs.next()){
	Move tmp=new Move();
	tmp.setID(rs.getString(1));
	tmp.setName(rs.getString(2));
	tmp.setModel(rs.getString(3));
	tmp.setSpec(rs.getString(4));
	tmp.setFrom(rs.getString(5));
	tmp.setTo(rs.getString(6));
	tmp.setMoveman(rs.getString(7));
	tmp.setRecieveman(rs.getString(8));
	tmp.setApproval(rs.getString(9));
	tmp.setMovedate(rs.getString(10));
	list.add(tmp);
 }
list.toArray();
} catch (Exception e) {
e.printStackTrace();
}
return list;
}
//获得总记录数?
public int getMoveAmount(){
int i=0;
String sql="select count(*) from move";
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
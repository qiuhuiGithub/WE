package com.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javabean.Borrow;
import database.DbCtrl; 
public class PageDAOBorrow {
DbCtrl dbc = new DbCtrl();
PreparedStatement ps;
ResultSet rs;
public List<Borrow> Borrow(int pageSize,int pageNumber){
List<Borrow> list=new ArrayList<Borrow>();
// sql="select * from (select a.*,rownum as a_rownum from (select * from tb_car order by car_id) a where rownum<=pageSize) b where b.a_rownum> (pageNumber*pageSize-pageSize)";
try {
 if(pageSize>0&&pageNumber>0){
ps=dbc.getConnection().prepareStatement("select * from borrow limit "+(pageNumber*pageSize-pageSize)+","+pageSize);
}
rs=ps.executeQuery();
while(rs.next()){
	Borrow tmp=new Borrow();
	tmp.setUnitno(rs.getString(1));
	tmp.setUnitname(rs.getString(2));
	tmp.setID(rs.getString(3));
	tmp.setName(rs.getString(4));
	tmp.setModel(rs.getString(5));
	tmp.setSpec(rs.getString(6));
	tmp.setRecipients(rs.getString(7));
	tmp.setMoney(rs.getString(8));
	tmp.setResearchno(rs.getString(9));
	tmp.setBrokerage(rs.getString(10));
	tmp.setBorrowdate(rs.getString(11));
	tmp.setReturndate(rs.getString(12));
	list.add(tmp);
 }
list.toArray();
} catch (Exception e) {
e.printStackTrace();
}
return list;
}
//获得总记录数?
public int getBorrowAmount(){
int i=0;
String sql="select count(*) from borrow";
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
package equipAction;

import com.opensymphony.xwork2.ActionSupport;

import javabean.Lost;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import database.DbCtrl;

@SuppressWarnings("serial")
public class EquipLostListAction extends ActionSupport {
		private Lost Lost=new Lost();
		private String lostman;
		private String ID;
		private String lostname;
		private String model;
		private String spec;
		private String losttime;
		private String approval;
		private String lostmoney;
		private String shenpi;
		private int id;
		
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;

		private List<Lost> lostlist = new ArrayList<Lost>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				if(id==1){
					String sql="select * from lost_copy where shenpi='"+"ЭЌвт'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Lost tmp=new Lost();
						tmp.setLostman(rs.getString(1));
						 tmp.setID(rs.getString(2));
						tmp.setLostname(rs.getString(3));
						tmp.setModel(rs.getString(4));
						tmp.setSpec(rs.getString(5));
						tmp.setLosttime(rs.getString(6));
						tmp.setApproval(rs.getString(7));
						tmp.setLostmoney(rs.getString(8));
						tmp.setShenpi(rs.getString(9));
						lostlist.add(tmp);
						ret="success1";
					}
					lostlist.toArray();
				}
				else{
				String sql="select * from lost_copy";
				stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next()){
					Lost tmp=new Lost();
					tmp.setLostman(rs.getString(1));
					 tmp.setID(rs.getString(2));
					tmp.setLostname(rs.getString(3));
					tmp.setModel(rs.getString(4));
					tmp.setSpec(rs.getString(5));
					tmp.setLosttime(rs.getString(6));
					tmp.setApproval(rs.getString(7));
					tmp.setLostmoney(rs.getString(8));
					tmp.setShenpi(rs.getString(9));
					lostlist.add(tmp);
					ret=SUCCESS;
				}
				lostlist.toArray();}
			}catch(Exception e) {
				e.printStackTrace();
				ret = ERROR;
			} finally {
				if (conn != null) {
					try {
						conn.close();
					} catch (Exception e) {
					}
				}
			}
			return ret;
	}
		
		public Lost getLost(){
			return Lost;
		}
		public void setLost(Lost Lost){
			this.Lost=Lost;
		}
		public String getLostman(){
			return lostman;
		}
		public void setLostman(String lostman){
			this.lostman=lostman;
		}
		public String getID(){
			return ID;
		}
		public void setID(String ID){
			this.ID=ID;
		}
		public String getLostname(){
			return lostname;
		}
		public void setLostname(String lostname){
			this.lostname=lostname;
		}
		
		public String getModel(){
			return model;
		}
		public void setModel(String model){
			this.model=model;
		}

		public String getSpec(){
			return spec;
		}
		public void setSpec(String spec){
			this.spec=spec;
		}
		
		public String getLosttime(){
			return losttime;
		}
		public void setLosttime(String losttime){
			this.losttime=losttime;
		}
		public String getApproval(){
			return approval;
		}
		public void setApproval(String approval){
			this.approval=approval;
		}
		public String getLostmoney(){
			return lostmoney;
		}
		public void setLostmoney(String lostmoney){
			this.lostmoney=lostmoney;
		}
		public String getShenpi(){
			return shenpi;
		}
		public void setShenpi(String shenpi){
			this.shenpi=shenpi;
		}
		public int getId(){
			return id;
		}
		public void setId(int id){
			this.id=id;
		}
		public List<Lost> getLostlist() {
			return lostlist;
		}
		public void getLostlist(List<Lost> lostlist) {
			this.lostlist = lostlist;
		}
}

package equipAction;

import com.opensymphony.xwork2.ActionSupport;

import javabean.Broke;
import javabean.Lost;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import database.DbCtrl;

@SuppressWarnings("serial")
public class EquipLostListAction extends ActionSupport {
		private Lost Lost=new Lost();
		public String lostman;
		public String ID;
		public String lostname;
		public String losttime;
		public String approval;
		public String lostmoney;
		
		
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;

		private List<Lost> lostlist = new ArrayList<Lost>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				String sql="select * from lost";
				stmt=conn.createStatement();
				ResultSet result=stmt.executeQuery(sql);
				while(result.next()){
					Lost tmp=new Lost();
					tmp.setLostman(result.getString(1));
					tmp.setID(result.getString(2));
					tmp.setLostname(result.getString(3));
					tmp.setLosttime(result.getString(4));
					tmp.setApproval(result.getString(5));
					tmp.setLostmoney(result.getString(6));
					lostlist.add(tmp);
					ret=SUCCESS;
				}
				lostlist.toArray();
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
		public List<Lost> getLostlist() {
			return lostlist;
		}
		public void getLostlist(List<Lost> lostlist) {
			this.lostlist = lostlist;
		}
}

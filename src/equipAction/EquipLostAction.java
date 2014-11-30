package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Lost;
import java.sql.*;
import database.DbCtrl;
@SuppressWarnings("serial")
public class EquipLostAction extends ActionSupport {
		private Lost Lost=new Lost();
		private String lostman;
		private String ID;
		private String lostname;
		private String losttime;
		private String approval;
		private String lostmoney;
		
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;
	
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				String sql="insert into lost values('"+lostman+"'"+","+"'"+ID+"'"+","+"'"+lostname+"'"+","+"'"+losttime+"','"+approval+"','"
						+lostmoney+"')";
				stmt=conn.createStatement();
				stmt.executeUpdate(sql); 
				ret=SUCCESS;
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
		public String getID(){
			return ID;
		}

		public void setID(String ID){
			this.ID=ID;
		}
		
		public String getLostman(){
			return lostman;
		}
		public void setLostman(String lostman){
			this.lostman=lostman;
		}
		
		public String getLostname(){
			return lostname;
		}
		public void setLostname(String lostname){
			this.lostname=lostname;
		}
		
		public String getApproval(){
			return approval;
		}
		public void setApproval(String approval){
			this.approval=approval;
		}
		public String getLosttime(){
			return losttime;
		}
		public void setLosttime(String losttime){
			this.losttime=losttime;
		}
		
		public String getLostmoney(){
			return lostmoney;
		}
		
		public void setLostmoney(String lostmoney){
			this.lostmoney=lostmoney;
		}
}

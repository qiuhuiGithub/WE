package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Broke;
import java.sql.*;
import database.DbCtrl;
@SuppressWarnings("serial")
public class EquipBrokeAction extends ActionSupport {
		private Broke Broke=new Broke();
		private String brokeman;
		private String reason;
		private String ID;
		private String brokename;
		private String approval;
		private String broketime;
		private String brokemoney;
		
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt,stmt1;
		private String status="Ëð»µ";
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				String sql="insert into broken values('"+brokeman+"'"+","+"'"+reason+"'"+","+"'"+ID+"'"+","+"'"+brokename+"','"+approval+"','"
						+broketime+"','"+brokemoney+"')";
				stmt=conn.createStatement();
				stmt.executeUpdate(sql); 
				String sql1="update equipment set status='"+status+"' "+"where ID='"+ID+"'";
				stmt1=conn.createStatement();
				stmt1.executeUpdate(sql1);
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
		
		public Broke getBroke(){
			return Broke;
		}
		public void setBroke(Broke Broke){
			this.Broke=Broke;
		}
		public String getID(){
			return ID;
		}

		public void setID(String ID){
			this.ID=ID;
		}
		
		public String getBrokeman(){
			return brokeman;
		}
		public void setBrokeman(String brokeman){
			this.brokeman=brokeman;
		}
		
		public String getReason(){
			return reason;
		}
		public void setReason(String reason){
			this.reason=reason;
		}
		
		public String getBrokename(){
			return brokename;
		}
		public void setBrokename(String brokename){
			this.brokename=brokename;
		}
		
		public String getApproval(){
			return approval;
		}
		public void setApproval(String approval){
			this.approval=approval;
		}
		public String getBroketime(){
			return broketime;
		}
		public void setBroketime(String broketime){
			this.broketime=broketime;
		}
		
		public String getBrokemoney(){
			return brokemoney;
		}
		
		public void setBrokemoney(String brokemoney){
			this.brokemoney=brokemoney;
		}
}

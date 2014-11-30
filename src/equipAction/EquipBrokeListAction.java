package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Broke;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import database.DbCtrl;

@SuppressWarnings("serial")
public class EquipBrokeListAction extends ActionSupport {
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
		private Statement stmt;

		private List<Broke> brokelist = new ArrayList<Broke>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				String sql="select * from broken";
				stmt=conn.createStatement();
				ResultSet result=stmt.executeQuery(sql);
				while(result.next()){
					Broke tmp=new Broke();
					tmp.setBrokeman(result.getString(1));
					tmp.setReason(result.getString(2));
					tmp.setID(result.getString(3));
					tmp.setBrokename(result.getString(4));
					tmp.setApproval(result.getString(5));
					tmp.setBroketime(result.getString(6));
					tmp.setBrokemoney(result.getString(7));
					brokelist.add(tmp);
					ret=SUCCESS;
				}
				brokelist.toArray();
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
		public String getBrokeman(){
			return brokeman;
		}
		public void setBrokeman(String brokeman) {
			this.brokeman=brokeman;
		}
		
		public String getReason(){
			return reason;
		}
		public void setReason(String reason) {
			this.reason=reason;
		}
		
		public String getID(){
			return ID;
		}
		public void setID(String ID) {
			this.ID=ID;
		}
		public String getBrokename(){
			return brokename;
		}
		public void setBrokename(String brokename) {
			this.brokename=brokename;
		}
		public String getApproval(){
			return approval;
		}
		public void setApproval(String approval) {
			this.approval=approval;
		}
		public String getBroketime(){
			return broketime;
		}
		public void setBroketime(String broketime) {
			this.broketime=broketime;
		}
		public String getBrokemoney(){
			return brokemoney;
		}
		public void setBrokemoney(String brokemoney) {
			this.brokemoney=brokemoney;
		}
		public List<Broke> getBrokelist() {
			return brokelist;
		}
		public void getBrokelist(List<Broke> brokelist) {
			this.brokelist = brokelist;
		}
}

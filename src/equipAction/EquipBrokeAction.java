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
		private String model;
		private String spec;
		private String approval;
		private String broketime;
		private String brokemoney;
		private String shenpi;
		private int i;
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt,stmt1,stmt2;
		private String status="±®∑œ";
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				if(i==1){
					String sql2="insert into broken_copy values('"+brokeman+"'"+","+"'"+reason+"'"+","+"'"+ID+"'"+","+"'"+brokename+"','"+model+"','"+spec+"','"+approval+"','"
							+broketime+"','"+brokemoney+"','"+"Œ¥…Û≈˙"+"')";
					stmt2=conn.createStatement();
					stmt2.executeUpdate(sql2); 
					ret=SUCCESS;
				}
				String sql="insert into broken values('"+brokeman+"'"+","+"'"+reason+"'"+","+"'"+ID+"'"+","+"'"+brokename+"','"+model+"','"+spec+"','"+approval+"','"
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
		public String getShenpi(){
			return shenpi;
		}
		public void setShenpi(String shenpi){
			this.shenpi=shenpi;
		}
		public int getI(){
			return i;
		}
		public void setI(int i){
			this.i=i;
		}
}

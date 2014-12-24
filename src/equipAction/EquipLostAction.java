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
		private String model;
		private String spec;
		private String losttime;
		private String approval;
		private String lostmoney;
		private String status="¶ªÊ§";
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt,stmt1,stmt2;
		private String shenpi;
		private int i;
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				if(i==1){
					String sql2="insert into lost_copy values('"+lostman+"'"+","+"'"+ID+"'"+","+"'"+lostname+"','"+model+"','"+spec+"'"+","+"'"+losttime+"','"+approval+"','"
							+lostmoney+"','"+"Î´ÉóÅú"+"')";
					stmt2=conn.createStatement();
					stmt2.executeUpdate(sql2);
					ret=SUCCESS;
				}
				
				else{
				String sql="insert into lost values('"+lostman+"'"+","+"'"+ID+"'"+","+"'"+lostname+"','"+model+"','"+spec+"'"+","+"'"+losttime+"','"+approval+"','"
						+lostmoney+"')";
				stmt=conn.createStatement();
				stmt.executeUpdate(sql);
				String sql1="update equipment set status='"+status+"' "+"where ID='"+ID+"'";
				stmt1=conn.createStatement();
				stmt1.executeUpdate(sql1);
				ret=SUCCESS;}
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

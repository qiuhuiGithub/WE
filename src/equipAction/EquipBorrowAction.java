package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Borrow;
import java.sql.*;
import database.DbCtrl;
@SuppressWarnings("serial")
public class EquipBorrowAction extends ActionSupport {
		private Borrow Borrow=new Borrow();
		private String unitno;
		private String unitname;
		private String ID;
		private String recipients;
		private String money;
		private String researchno;
		private String brokerage;
		
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;
	
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{

				String sql="insert into borrow values('"+unitno+"'"+","+"'"+unitname+"'"+","+"'"+ID+"'"+","+"'"+recipients+"','"+money+"','"
						+researchno+"','"+brokerage+"')";
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
		
		public Borrow getBorrow(){
			return Borrow;
		}
		public void setBorrow(Borrow Borrow){
			this.Borrow=Borrow;
		}
		public String getID(){
			return ID;
		}

		public void setID(String ID){
			this.ID=ID;
		}
		
		public String getUnitname(){
			return unitname;
		}
		public void setUnitname(String unitname){
			this.unitname=unitname;
		}
		
		public String getUnitno(){
			return unitno;
		}
		public void setUnitno(String unitno){
			this.unitno=unitno;
		}
		
		public String getRecipients(){
			return recipients;
		}
		public void setRecipients(String recipients){
			this.recipients=recipients;
		}
		
		public String getMoney(){
			return money;
		}
		public void setMoney(String money){
			this.money=money;
		}
		
		public String getResearchno(){
			return researchno;
		}
		
		public void setResearchno(String researchno){
			this.researchno=researchno;
		}
		public String getBrokerage(){
			return brokerage;
		}
		public void setBrokerage(String brokerage){
			this.brokerage=brokerage;
		}
}

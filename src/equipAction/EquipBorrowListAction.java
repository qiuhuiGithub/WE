package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Borrow;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import database.DbCtrl;

@SuppressWarnings("serial")
public class EquipBorrowListAction extends ActionSupport {
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

		private List<Borrow> borrowlist = new ArrayList<Borrow>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				String sql="select * from borrow";
				stmt=conn.createStatement();
				ResultSet result=stmt.executeQuery(sql);
				while(result.next()){
					Borrow tmp=new Borrow();
					tmp.setUnitno(result.getString(1));
					tmp.setUnitname(result.getString(2));
					tmp.setID(result.getString(3));
					tmp.setRecipients(result.getString(4));
					tmp.setMoney(result.getString(5));
					tmp.setResearchno(result.getString(6));
					tmp.setBrokerage(result.getString(7));
					borrowlist.add(tmp);
					ret=SUCCESS;
				}
				borrowlist.toArray();
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
		public String getUnitno() {
			return unitno;
		}
		 
		public void setUnitno(String unitno) {
			this.unitno=unitno;
		}

		public String getUnitname() {
			return unitname;
		}
		public void setUnitname(String unitname) {
			this.unitname=unitname;
		}

		public String getID() {
			return ID;
		}
		 
		public void setID(String ID) {
			this.ID=ID;
		}
		public String getRecipients() {
			return recipients;
		}
		 
		public void setRecipients(String recipients) {
			this.recipients=recipients;
		}
		public String getMoney() {
			return money;
		}
		 
		public void setMoney(String money) {
			this.money=money;
		}
		public String getResearchno() {
			return researchno;
		}
		 
		public void setResearchno(String researchno) {
			this.researchno=researchno;
		}
		public String getBrokerage() {
			return brokerage;
		} 
		public void setBrokerage(String brokerage) {
			this.brokerage=brokerage;
		}
		public List<Borrow> getBorrowlist() {
			return borrowlist;
		}
		public void getBorrowlist(List<Borrow> borrowlist) {
			this.borrowlist = borrowlist;
		}
}

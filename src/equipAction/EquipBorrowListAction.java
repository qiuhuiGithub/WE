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
		private String name;
		private String model;
		private String spec;
		private String recipients;
		private String money;
		private String researchno;
		private String brokerage;

		private String borrowdate;
		private String returndate;
		private String shenpi;
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt,stmt1;
		private int id;
		private List<Borrow> borrowlist = new ArrayList<Borrow>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				if(id==1){
					String sql1="select * from borrow_copy where shenpi='"+"ЭЌвт'";
					stmt1=conn.createStatement();
					ResultSet rs=stmt1.executeQuery(sql1);
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
						tmp.setShenpi(rs.getString(13));
						borrowlist.add(tmp);
						ret="success1";
					}
					borrowlist.toArray();
				}
				else{
				String sql="select * from borrow_copy";
				stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
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
					tmp.setShenpi(rs.getString(13));
					borrowlist.add(tmp);
					ret=SUCCESS;
				}
				borrowlist.toArray();}
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

		public String getName() {
			return name;
		}
		 
		public void setName(String name) {
			this.name=name;
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
		public String getBorrowdate() {
			return borrowdate;
		}
		 
		public void setBorrowdate(String borrowdate) {
			this.borrowdate=borrowdate;
		}
		public String getReturndate() {
			return returndate;
		}
		 
		public void setReturndate(String returndate) {
			this.returndate=returndate;
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
		
		public List<Borrow> getBorrowlist() {
			return borrowlist;
		}
		public void getBorrowlist(List<Borrow> borrowlist) {
			this.borrowlist = borrowlist;
		}
}

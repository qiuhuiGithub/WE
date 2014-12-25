package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Borrowbyuser;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import database.DbCtrl;

@SuppressWarnings("serial")
public class EquipBorrowbyuserListAction extends ActionSupport {
		private Borrowbyuser Borrowbyuser=new Borrowbyuser();
		private String borrowman;
		private String profession;
		private String ID;
		private String name;
		private String time;
		private String agree;
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;

		private List<Borrowbyuser> borrowbyuserlist = new ArrayList<Borrowbyuser>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				String sql="select * from borrowbyuser";
				stmt=conn.createStatement();
				ResultSet result=stmt.executeQuery(sql);
				while(result.next()){
					Borrowbyuser tmp=new Borrowbyuser();
					tmp.setBorrowman(result.getString(1));
					tmp.setProfession(result.getString(2));
					tmp.setID(result.getString(3));
					tmp.setName(result.getString(4));
					tmp.setTime(result.getString(5));
					borrowbyuserlist.add(tmp);
					ret=SUCCESS;
				}
				borrowbyuserlist.toArray();
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
		
		public Borrowbyuser getBorrowbyuser(){
			return Borrowbyuser;
		}
		public void setBorrowbyuser(Borrowbyuser Borrowbyuser){
			this.Borrowbyuser=Borrowbyuser;
		}
		public String getBorrowman() {
			return borrowman;
		}
		 
		public void setBorrowman(String borrowman) {
			this.borrowman=borrowman;
		}

		public String getProfession() {
			return profession;
		}
		public void setProfession(String profession) {
			this.profession=profession;
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
		public String getTime() {
			return time;
		}
		 
		public void setTime(String time) {
			this.time=time;
		}
		public String getAgree() {
			return agree;
		}
		 
		public void setAgree(String agree) {
			this.agree=agree;
		}
		public List<Borrowbyuser> getBorrowbyuserlist() {
			return borrowbyuserlist;
		}
		public void getBorrowbyuserlist(List<Borrowbyuser> borrowbyuserlist) {
			this.borrowbyuserlist = borrowbyuserlist;
		}
}

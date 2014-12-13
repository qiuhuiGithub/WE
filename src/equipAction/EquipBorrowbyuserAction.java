package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Borrow;
import java.sql.*;
import database.DbCtrl;
@SuppressWarnings("serial")
public class EquipBorrowbyuserAction extends ActionSupport {
		private Borrow Borrow=new Borrow();
		private String borrowman;
		private String profession;
		private String ID;
		private String name;
		private String time;
		private String agree;
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;
	
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{

				String sql="insert into borrowbyuser values('"+borrowman+"'"+","+"'"+profession+"'"+","+"'"+ID+"'"+","+"'"+name+"','"+time+"','"+"0"+"')";
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
}

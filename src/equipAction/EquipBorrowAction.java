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
		private String name;
		private String model;
		private String spec;
		private String recipients;
		private String money;
		private String researchno;
		private String brokerage;

		private String borrowdate;
		private String returndate;
		private String status="Õ‚ΩË";
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
					String sql2="insert into borrow_copy values('"+unitno+"'"+","+"'"+unitname+"'"+","+"'"+ID+"','"+name+"','"+model+"','"+spec+"'"+","+"'"+recipients+"','"+money+"','"
							+researchno+"','"+brokerage+"','"+borrowdate+"','"+returndate+"','"+"Œ¥…Û≈˙"+"')";
					stmt2=conn.createStatement();
					stmt2.executeUpdate(sql2);
					ret=SUCCESS;
				}
				else{
				String sql="insert into borrow values('"+unitno+"'"+","+"'"+unitname+"'"+","+"'"+ID+"','"+name+"','"+model+"','"+spec+"'"+","+"'"+recipients+"','"+money+"','"
						+researchno+"','"+brokerage+"','"+borrowdate+"','"+returndate+"')";
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
		public int getI(){
			return i;
		}
		public void setI(int i){
			this.i=i;
		}
}

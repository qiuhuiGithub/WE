package equipAction;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;
import database.DbCtrl;
@SuppressWarnings("serial")
public class EquipShenpiAction extends ActionSupport {
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt,stmt1,stmt2,stmt3,stmt4;
		private int i;
		private String ID,shenpi;
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				System.out.println(i);
				System.out.println(ID);
				if(i==1){
					String sql="update borrow_copy set shenpi='"+shenpi+"' "+"where ID='"+ID+"'";
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
					ret=SUCCESS;
				}
				else if(i==2){
					String sql1="update broken_copy set shenpi='"+shenpi+"' "+"where ID='"+ID+"'";
					stmt1=conn.createStatement();
					stmt1.executeUpdate(sql1);
					ret=SUCCESS;
				}
				else if(i==3){
					String sql2="update equipment_copy set shenpi='"+shenpi+"' "+"where ID='"+ID+"'";
					stmt2=conn.createStatement();
					stmt2.executeUpdate(sql2);
					ret=SUCCESS;
				}
				else if(i==4){
					String sql3="update lost_copy set shenpi='"+shenpi+"' "+"where ID='"+ID+"'";
					stmt3=conn.createStatement();
					stmt3.executeUpdate(sql3);
					ret=SUCCESS;
				}
				else if(i==5){
					String sql4="update move_copy set shenpi='"+shenpi+"' "+"where ID='"+ID+"'";
					stmt4=conn.createStatement();
					stmt4.executeUpdate(sql4);
					ret=SUCCESS;
				}
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
		
		public String getShenpi(){
			return shenpi;
		}
		public void setShenpi(String shenpi){
			this.shenpi=shenpi;
		}
		public String getID(){
			return ID;
		}
		public void setID(String ID){
			this.ID=ID;
		}
		public void setName(String shenpi){
			this.shenpi=shenpi;
		}
		public int getI(){
			return i;
		}
		public void setI(int i){
			this.i=i;
		}
}

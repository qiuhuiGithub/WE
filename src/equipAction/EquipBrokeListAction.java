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
		private String model;
		private String spec;
		private String approval;
		private String broketime;
		private String brokemoney;
		private String shenpi;
		private int id;
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;

		private List<Broke> brokelist = new ArrayList<Broke>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				if(id==1){
					String sql="select * from broken_copy where shenpi='"+"ЭЌвт'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Broke tmp=new Broke();
						tmp.setBrokeman(rs.getString(1));
						tmp.setReason(rs.getString(2));
						tmp.setID(rs.getString(3));
						tmp.setBrokename(rs.getString(4));
						tmp.setModel(rs.getString(5));
						tmp.setSpec(rs.getString(6));
						tmp.setApproval(rs.getString(7));
						tmp.setBroketime(rs.getString(8));
						tmp.setBrokemoney(rs.getString(9));
						tmp.setShenpi(rs.getString(10));
						brokelist.add(tmp);
						ret="success1";
					}
					brokelist.toArray();
				}
				else{
				String sql="select * from broken_copy";
				stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next()){
					Broke tmp=new Broke();
					tmp.setBrokeman(rs.getString(1));
					tmp.setReason(rs.getString(2));
					tmp.setID(rs.getString(3));
					tmp.setBrokename(rs.getString(4));
					tmp.setModel(rs.getString(5));
					tmp.setSpec(rs.getString(6));
					tmp.setApproval(rs.getString(7));
					tmp.setBroketime(rs.getString(8));
					tmp.setBrokemoney(rs.getString(9));
					tmp.setShenpi(rs.getString(10));
					brokelist.add(tmp);

					ret=SUCCESS;
				}
				brokelist.toArray();}
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
		public int getId(){
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		public String getBrokename(){
			return brokename;
		}
		public void setBrokename(String brokename) {
			this.brokename=brokename;
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
		public String getShenpi(){
			return shenpi;
		}
		public void setShenpi(String shenpi){
			this.shenpi=shenpi;
		}
		public List<Broke> getBrokelist() {
			return brokelist;
		}
		public void getBrokelist(List<Broke> brokelist) {
			this.brokelist = brokelist;
		}
}

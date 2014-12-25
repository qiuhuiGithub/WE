package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Equipment;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import database.DbCtrl;

@SuppressWarnings("serial")
public class PartListAction extends ActionSupport {
		private Equipment Equipment=new Equipment();
		private String unitno;
		private String unitname;
		private String ID;
		private String name;
		private String model;
		private String spec;
		private double price;
		private String vender;
		private String serialnumber;
		private String buydate;
		private String outdate;
		private String useman;
		private String researchno;
		private String brokerman;
		private String partment;
		private String location;
		private String status;
		private String username;
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt,stmt1;
		private String part;
		private List<Equipment> equiplist = new ArrayList<Equipment>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				String sql1="select partment from user where username="+"'"+username+"'";
			    stmt1 = conn.createStatement();
				ResultSet result1=stmt1.executeQuery(sql1);
				while(result1.next()){
					part=result1.getString(1);
				}
				System.out.println(part);
				String sql="select * from equipment where partment="+"'"+part+"'";
				stmt=conn.createStatement();
				ResultSet result=stmt.executeQuery(sql);
				while(result.next()){
					Equipment tmp=new Equipment();
					tmp.setUnitno(result.getString(1));
					tmp.setUnitname(result.getString(2));
					tmp.setID(result.getString(3));
					tmp.setName(result.getString(4));
					tmp.setModel(result.getString(5));
					tmp.setSpec(result.getString(6));
					tmp.setPrice(result.getDouble(7));
					tmp.setVender(result.getString(8));
					tmp.setSerialnumber(result.getString(9));
					tmp.setBuydate(result.getString(10));
					tmp.setOutdate(result.getString(11));
					tmp.setUseman(result.getString(12));
					tmp.setResearchno(result.getString(13));
					tmp.setBrokerman(result.getString(14));
					tmp.setPartment(result.getString(15));
					tmp.setLocation(result.getString(16));
					tmp.setStatus(result.getString(17));
					equiplist.add(tmp);
					ret=SUCCESS;
				}
				equiplist.toArray();
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
		
		public Equipment getEquipment(){
			return Equipment;
		}
		public void setEquipment(Equipment Equipment){
			this.Equipment=Equipment;
		}
		
		public String getUsername(){
			return username;
		}

		public void setUsername(String username){
			this.username=username;
		}
		
		public String getUnitno(){
			return unitno;
		}

		public void setUnitno(String unitno){
			this.unitno=unitno;
		}
		public String getUnitname(){
			return unitname;
		}

		public void setUnitname(String unitname){
			this.unitname=unitname;
		}
		public String getID(){
			return ID;
		}

		public void setID(String ID){
			this.ID=ID;
		}
		
		public String getName(){
			return name;
		}
		public void setName(String name){
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
		
		public double getPrice(){
			return price;
		}
		public void setPrice(double price){
			this.price=price;
		}
		
		public String getVender(){
			return vender;
		}
		
		public void setVender(String vender){
			this.vender=vender;
		}
		public String getSerialnumber(){
			return serialnumber;
		}
		public void setSerialnumber(String serialnumber){
			this.serialnumber=serialnumber;
		}
		public String getBuydate(){
			return buydate;
		}
		
		public void setBuydate(String buydate){
			this.buydate=buydate;
		}
		
		public String getOutdate(){
			return outdate;
		}
		
		public void setOutdate(String outdate){
			this.outdate=outdate;
		}
		
		public String getUseman(){
			return useman;
		}
		
		public void setUseman(String useman){
			this.useman=useman;
		}
		
		public String getResearchno(){
			return researchno;
		}
		
		public void setResearchno(String researchno){
			this.researchno=researchno;
		}
		public String getBrokerman(){
			return brokerman;
		}
		
		public void setBrokerman(String brokerman){
			this.brokerman=brokerman;
		}
		public String getPartment(){
			return partment;
		}
		public void setPartment(String partment){
			this.partment=partment;
		}
		public String getLocation(){
			return location;
		}
		public void setLocation(String location){
			this.location=location;
		}
		public String getStatus(){
			return status;
		}
		public void setStatus(String status){
			this.status=status;
		}
		public List<Equipment> getEquiplist() {
			return equiplist;
		}
		public void getEquiplist(List<Equipment> equiplist) {
			this.equiplist = equiplist;
		}
}

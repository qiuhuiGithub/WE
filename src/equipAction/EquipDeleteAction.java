package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Equipment;
import java.sql.*;
import database.DbCtrl;

@SuppressWarnings("serial")
public class EquipDeleteAction extends ActionSupport {
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
		private int id;
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;

		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			//buydate=buyyear+buymonth;
			//outdate=outyear+outmonth;
			try{
				if(id==1){
					String sql="delete from borrow where ID='"+ID+"'";
					stmt=conn.createStatement();
					System.out.println(sql);
					stmt.executeUpdate(sql);
					ret=SUCCESS;
				}
				else if(id==2){
					String sql="delete from broken where ID='"+ID+"'";
					stmt=conn.createStatement();
					System.out.println(sql);
					stmt.executeUpdate(sql);
					ret=SUCCESS;
				}
				else if(id==3){
					String sql="delete from lost where ID='"+ID+"'";
					stmt=conn.createStatement();
					System.out.println(sql);
					stmt.executeUpdate(sql);
					ret=SUCCESS;
				}
				else if(id==4){
					String sql="delete from move where ID='"+ID+"'";
					stmt=conn.createStatement();
					System.out.println(sql);
					stmt.executeUpdate(sql);
					ret=SUCCESS;
				}
				else{
				String sql="delete from equipment where ID='"+ID+"'";
				stmt=conn.createStatement();
				System.out.println(sql);
				stmt.executeUpdate(sql);
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
		public int getId(){
			return id;
		}
		public void setId(int id){
			this.id=id;
		}
		public Equipment getEquipment(){
			return Equipment;
		}
		public void setEquipment(Equipment Equipment){
			this.Equipment=Equipment;
		}
		
		public String getID(){
			return ID;
		}

		public void setID(String ID){
			this.ID=ID;
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
}

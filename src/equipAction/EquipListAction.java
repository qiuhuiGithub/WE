package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Equipment;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import database.DbCtrl;

@SuppressWarnings("serial")
public class EquipListAction extends ActionSupport {
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
		private String shenpi;
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;
		private int id,dou;
		private List<Equipment> equiplist = new ArrayList<Equipment>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				System.out.println(id);
				if(id==10){
					String sql="select * from equipment where status='"+"可用'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Equipment tmp=new Equipment();
						tmp.setUnitno(rs.getString(1));
						tmp.setUnitname(rs.getString(2));
						tmp.setID(rs.getString(3));
						tmp.setName(rs.getString(4));
						tmp.setModel(rs.getString(5));
						tmp.setSpec(rs.getString(6));
						tmp.setPrice(rs.getDouble(7));
						tmp.setVender(rs.getString(8));
						tmp.setSerialnumber(rs.getString(9));
						tmp.setBuydate(rs.getString(10));
						tmp.setOutdate(rs.getString(11));
						tmp.setUseman(rs.getString(12));
						tmp.setResearchno(rs.getString(13));
						tmp.setBrokerman(rs.getString(14));
						tmp.setPartment(rs.getString(15));
						tmp.setLocation(rs.getString(16));
						tmp.setStatus(rs.getString(17));
						//tmp.setShenpi(rs.getString(18));
						equiplist.add(tmp);
						if(dou==1){
							ret="success2";
						}
						else{
						ret="success1";}
				    }
					equiplist.toArray();
				}
				else if(id==2){
					String sql="select * from equipment where status='"+"报废'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Equipment tmp=new Equipment();
						tmp.setUnitno(rs.getString(1));
						tmp.setUnitname(rs.getString(2));
						tmp.setID(rs.getString(3));
						tmp.setName(rs.getString(4));
						tmp.setModel(rs.getString(5));
						tmp.setSpec(rs.getString(6));
						tmp.setPrice(rs.getDouble(7));
						tmp.setVender(rs.getString(8));
						tmp.setSerialnumber(rs.getString(9));
						tmp.setBuydate(rs.getString(10));
						tmp.setOutdate(rs.getString(11));
						tmp.setUseman(rs.getString(12));
						tmp.setResearchno(rs.getString(13));
						tmp.setBrokerman(rs.getString(14));
						tmp.setPartment(rs.getString(15));
						tmp.setLocation(rs.getString(16));
						tmp.setStatus(rs.getString(17));
						//tmp.setShenpi(rs.getString(18));
						equiplist.add(tmp);
						if(dou==1){
							ret="success2";
						}
						else{
						ret="success1";}
				    }
					equiplist.toArray();
				}
				else if(id==3){
					String sql="select * from equipment where status='"+"丢失'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Equipment tmp=new Equipment();
						tmp.setUnitno(rs.getString(1));
						tmp.setUnitname(rs.getString(2));
						tmp.setID(rs.getString(3));
						tmp.setName(rs.getString(4));
						tmp.setModel(rs.getString(5));
						tmp.setSpec(rs.getString(6));
						tmp.setPrice(rs.getDouble(7));
						tmp.setVender(rs.getString(8));
						tmp.setSerialnumber(rs.getString(9));
						tmp.setBuydate(rs.getString(10));
						tmp.setOutdate(rs.getString(11));
						tmp.setUseman(rs.getString(12));
						tmp.setResearchno(rs.getString(13));
						tmp.setBrokerman(rs.getString(14));
						tmp.setPartment(rs.getString(15));
						tmp.setLocation(rs.getString(16));
						tmp.setStatus(rs.getString(17));
						//tmp.setShenpi(rs.getString(18));
						equiplist.add(tmp);
						if(dou==1){
							ret="success2";
						}
						else{
						ret="success1";}
				    }
					equiplist.toArray();
				}
				else if(id==4){
					String sql="select * from equipment where status='"+"外借'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Equipment tmp=new Equipment();
						tmp.setUnitno(rs.getString(1));
						tmp.setUnitname(rs.getString(2));
						tmp.setID(rs.getString(3));
						tmp.setName(rs.getString(4));
						tmp.setModel(rs.getString(5));
						tmp.setSpec(rs.getString(6));
						tmp.setPrice(rs.getDouble(7));
						tmp.setVender(rs.getString(8));
						tmp.setSerialnumber(rs.getString(9));
						tmp.setBuydate(rs.getString(10));
						tmp.setOutdate(rs.getString(11));
						tmp.setUseman(rs.getString(12));
						tmp.setResearchno(rs.getString(13));
						tmp.setBrokerman(rs.getString(14));
						tmp.setPartment(rs.getString(15));
						tmp.setLocation(rs.getString(16));
						tmp.setStatus(rs.getString(17));
						//tmp.setShenpi(rs.getString(18));
						equiplist.add(tmp);
						if(dou==1){
							ret="success2";
						}
						else{
						ret="success1";}
				    }
					equiplist.toArray();
				}
				else if(id==5){
					String sql="select * from equipment where partment='"+"舞蹈组'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Equipment tmp=new Equipment();
						tmp.setUnitno(rs.getString(1));
						tmp.setUnitname(rs.getString(2));
						tmp.setID(rs.getString(3));
						tmp.setName(rs.getString(4));
						tmp.setModel(rs.getString(5));
						tmp.setSpec(rs.getString(6));
						tmp.setPrice(rs.getDouble(7));
						tmp.setVender(rs.getString(8));
						tmp.setSerialnumber(rs.getString(9));
						tmp.setBuydate(rs.getString(10));
						tmp.setOutdate(rs.getString(11));
						tmp.setUseman(rs.getString(12));
						tmp.setResearchno(rs.getString(13));
						tmp.setBrokerman(rs.getString(14));
						tmp.setPartment(rs.getString(15));
						tmp.setLocation(rs.getString(16));
						tmp.setStatus(rs.getString(17));
						//tmp.setShenpi(rs.getString(18));
						equiplist.add(tmp);
						if(dou==1){
							ret="success2";
						}
						else{
						ret="success1";}
				    }
					equiplist.toArray();
				}
				else if(id==6){
					String sql="select * from equipment where partment='"+"仿人组'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Equipment tmp=new Equipment();
						tmp.setUnitno(rs.getString(1));
						tmp.setUnitname(rs.getString(2));
						tmp.setID(rs.getString(3));
						tmp.setName(rs.getString(4));
						tmp.setModel(rs.getString(5));
						tmp.setSpec(rs.getString(6));
						tmp.setPrice(rs.getDouble(7));
						tmp.setVender(rs.getString(8));
						tmp.setSerialnumber(rs.getString(9));
						tmp.setBuydate(rs.getString(10));
						tmp.setOutdate(rs.getString(11));
						tmp.setUseman(rs.getString(12));
						tmp.setResearchno(rs.getString(13));
						tmp.setBrokerman(rs.getString(14));
						tmp.setPartment(rs.getString(15));
						tmp.setLocation(rs.getString(16));
						tmp.setStatus(rs.getString(17));
						//tmp.setShenpi(rs.getString(18));
						equiplist.add(tmp);
						if(dou==1){
							ret="success2";
						}
						else{
						ret="success1";}
				    }
					equiplist.toArray();
				}
				else if(id==7){
					String sql="select * from equipment where partment='"+"对抗组'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Equipment tmp=new Equipment();
						tmp.setUnitno(rs.getString(1));
						tmp.setUnitname(rs.getString(2));
						tmp.setID(rs.getString(3));
						tmp.setName(rs.getString(4));
						tmp.setModel(rs.getString(5));
						tmp.setSpec(rs.getString(6));
						tmp.setPrice(rs.getDouble(7));
						tmp.setVender(rs.getString(8));
						tmp.setSerialnumber(rs.getString(9));
						tmp.setBuydate(rs.getString(10));
						tmp.setOutdate(rs.getString(11));
						tmp.setUseman(rs.getString(12));
						tmp.setResearchno(rs.getString(13));
						tmp.setBrokerman(rs.getString(14));
						tmp.setPartment(rs.getString(15));
						tmp.setLocation(rs.getString(16));
						tmp.setStatus(rs.getString(17));
						//tmp.setShenpi(rs.getString(18));
						equiplist.add(tmp);
						if(dou==1){
							ret="success2";
						}
						else{
						ret="success1";}
				    }
					equiplist.toArray();
				}
				else if(id==8){
					String sql="select * from equipment where partment='"+"熊猫组'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Equipment tmp=new Equipment();
						tmp.setUnitno(rs.getString(1));
						tmp.setUnitname(rs.getString(2));
						tmp.setID(rs.getString(3));
						tmp.setName(rs.getString(4));
						tmp.setModel(rs.getString(5));
						tmp.setSpec(rs.getString(6));
						tmp.setPrice(rs.getDouble(7));
						tmp.setVender(rs.getString(8));
						tmp.setSerialnumber(rs.getString(9));
						tmp.setBuydate(rs.getString(10));
						tmp.setOutdate(rs.getString(11));
						tmp.setUseman(rs.getString(12));
						tmp.setResearchno(rs.getString(13));
						tmp.setBrokerman(rs.getString(14));
						tmp.setPartment(rs.getString(15));
						tmp.setLocation(rs.getString(16));
						tmp.setStatus(rs.getString(17));
						//tmp.setShenpi(rs.getString(18));
						equiplist.add(tmp);
						if(dou==1){
							ret="success2";
						}
						else{
						ret="success1";}
				    }
					equiplist.toArray();
				}
				else if(id==1){
					String sql="select * from equipment_copy where shenpi='"+"同意'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Equipment tmp=new Equipment();
						tmp.setUnitno(rs.getString(1));
						tmp.setUnitname(rs.getString(2));
						tmp.setID(rs.getString(3));
						tmp.setName(rs.getString(4));
						tmp.setModel(rs.getString(5));
						tmp.setSpec(rs.getString(6));
						tmp.setPrice(rs.getDouble(7));
						tmp.setVender(rs.getString(8));
						tmp.setSerialnumber(rs.getString(9));
						tmp.setBuydate(rs.getString(10));
						tmp.setOutdate(rs.getString(11));
						tmp.setUseman(rs.getString(12));
						tmp.setResearchno(rs.getString(13));
						tmp.setBrokerman(rs.getString(14));
						tmp.setPartment(rs.getString(15));
						tmp.setLocation(rs.getString(16));
						tmp.setStatus(rs.getString(17));
						tmp.setShenpi(rs.getString(18));
						equiplist.add(tmp);
						ret="success1";
					}
					equiplist.toArray();
				}
				else{
				String sql="select * from equipment_copy";
				stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next()){
					Equipment tmp=new Equipment();
					tmp.setUnitno(rs.getString(1));
					tmp.setUnitname(rs.getString(2));
					tmp.setID(rs.getString(3));
					tmp.setName(rs.getString(4));
					tmp.setModel(rs.getString(5));
					tmp.setSpec(rs.getString(6));
					tmp.setPrice(rs.getDouble(7));
					tmp.setVender(rs.getString(8));
					tmp.setSerialnumber(rs.getString(9));
					tmp.setBuydate(rs.getString(10));
					tmp.setOutdate(rs.getString(11));
					tmp.setUseman(rs.getString(12));
					tmp.setResearchno(rs.getString(13));
					tmp.setBrokerman(rs.getString(14));
					tmp.setPartment(rs.getString(15));
					tmp.setLocation(rs.getString(16));
					tmp.setStatus(rs.getString(17));
					tmp.setShenpi(rs.getString(18));
					equiplist.add(tmp);
					ret=SUCCESS;
				}
				equiplist.toArray();}
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
	
	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
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
	public String getPartment(){
		return partment;
	}
	public void setPartment(String partment){
		this.partment=partment;
	}
	public String getShenpi(){
		return shenpi;
	}
	public void setShenpi(String shenpi){
		this.shenpi=shenpi;
	}
	public int getDou(){
		return dou;
	}
	public void setDou(int dou){
		this.dou=dou;
	}
		public List<Equipment> getEquiplist() {
			return equiplist;
		}
		public void getEquiplist(List<Equipment> equiplist) {
			this.equiplist = equiplist;
		}
}

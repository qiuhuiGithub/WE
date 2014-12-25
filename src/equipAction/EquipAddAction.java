package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Equipment;

import java.sql.*;
import database.DbCtrl;
//import java.util.*;
//import java.text.*;
@SuppressWarnings("serial")
public class EquipAddAction extends ActionSupport {
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
		private String shenpi;
			private String content;
			private String type;
		private int i;
		//private String buyyear,buymonth,outyear,outmonth;
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt1,stmt,stmt2,stmt3;
		//private long num;
		private int n;
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				if(i==20){
					String sql="select n from number_copy";
					stmt=conn.createStatement();
					ResultSet result=stmt.executeQuery(sql);
					if(result.next()){
						n=result.getInt(1);
							}
					n=n+1;
					String sql2="update number_copy set n="+n;
					stmt2=conn.createStatement();
					stmt2.executeUpdate(sql2);
					String sql3="insert into paper values('"+n+"','"+name+"','"+content+"','"+type+"')";
					stmt3=conn.createStatement();
					stmt3.executeUpdate(sql3); 
					ret=SUCCESS;
				}
				else{
				String sql="select n from number";
				stmt=conn.createStatement();
				ResultSet result=stmt.executeQuery(sql);
				if(result.next()){
					n=result.getInt(1);
						}
				n=n+1;
				String sql2="update number set n="+n;
				stmt2=conn.createStatement();
				stmt2.executeUpdate(sql2);
				System.out.println(i);
				if(i==1){
					String sql3="insert into equipment_copy values('"+unitno+"','"+unitname+"','"+n+"'"+","+"'"+name+"'"+","+"'"+model+"'"+","+"'"+spec+"','"+price+"','"
							+vender+"','"+serialnumber+"','"+buydate+"','"+outdate+"','"+useman+"','"+researchno+"','"+brokerman+"','"+partment+"','"+location+"','"+"可用"+"','"+"未审批"+"')";
					stmt3=conn.createStatement();
					stmt3.executeUpdate(sql3); 
					ret=SUCCESS;
				}
				else{
				String sql1="insert into equipment values('"+unitno+"','"+unitname+"','"+ID+"'"+","+"'"+name+"'"+","+"'"+model+"'"+","+"'"+spec+"','"+price+"','"
						+vender+"','"+serialnumber+"','"+buydate+"','"+outdate+"','"+useman+"','"+researchno+"','"+brokerman+"','"+partment+"','"+location+"','"+"可用"+"')";
				stmt1=conn.createStatement();
				stmt1.executeUpdate(sql1); 
				ret=SUCCESS;
				}
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
		
		public Equipment getEquipment(){
			return Equipment;
		}
		public void setEquipment(Equipment Equipment){
			this.Equipment=Equipment;
		}
		public int getNumber(){
			return n;
		}
		public void setNumber(int n){
			this.n=n;
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
		public String getContent(){
			return content;
		}
		public void setContent(String content){
			this.content=content;
		}
		public String getType(){
			return type;
		}
		public void setType(String type){
			this.type=type;
		}
}

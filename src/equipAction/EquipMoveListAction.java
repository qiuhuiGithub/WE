package equipAction;

import com.opensymphony.xwork2.ActionSupport;

import javabean.Move;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import database.DbCtrl;

@SuppressWarnings("serial")
public class EquipMoveListAction extends ActionSupport {
		private Move Move=new Move();
		private String ID;
		private String name;
		private String model;
		private String spec;
		private String from;
		private String to;
		private String moveman;
		private String recieveman;
		private String approval;
		private String movedate;
		private String shenpi;
		private int id;
		
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;

		private List<Move> movelist = new ArrayList<Move>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				if(id==1){
					String sql="select * from move_copy where shenpi='"+"ЭЌвт'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						Move tmp=new Move();
						tmp.setID(rs.getString(1));
						tmp.setName(rs.getString(2));
						tmp.setModel(rs.getString(3));
						tmp.setSpec(rs.getString(4));
						tmp.setFrom(rs.getString(5));
						tmp.setTo(rs.getString(6));
						tmp.setMoveman(rs.getString(7));
						tmp.setRecieveman(rs.getString(8));
						tmp.setApproval(rs.getString(9));
						tmp.setMovedate(rs.getString(10));
						tmp.setShenpi(rs.getString(11));
						movelist.add(tmp);
						ret="success1";
					}
					movelist.toArray();
				}
				else{
				String sql="select * from move_copy";
				stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next()){
					Move tmp=new Move();
					tmp.setID(rs.getString(1));
					tmp.setName(rs.getString(2));
					tmp.setModel(rs.getString(3));
					tmp.setSpec(rs.getString(4));
					tmp.setFrom(rs.getString(5));
					tmp.setTo(rs.getString(6));
					tmp.setMoveman(rs.getString(7));
					tmp.setRecieveman(rs.getString(8));
					tmp.setApproval(rs.getString(9));
					tmp.setMovedate(rs.getString(10));
					tmp.setShenpi(rs.getString(11));
					movelist.add(tmp);
					ret=SUCCESS;
				}
				movelist.toArray();}
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
		
		public Move getMove(){
			return Move;
		}
		public void setMove(Move Move){
			this.Move=Move;
		}
		public void setID(String ID){
			this.ID=ID;
		}
		public String getID(){
			return ID;
		}
		public void setId(int id){
			this.id=id;
		}
		public int getId(){
			return id;
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
		
		public String getFrom(){
			return from;
		}
		public void setFrom(String from){
			this.from=from;
		}
		public String getTo(){
			return to;
		}
		public void setTo(String to){
			this.to=to;
		}
		public String getMoveman(){
			return moveman;
		}
		public void setMoveman(String moveman){
			this.moveman=moveman;
		}
		public String getRecieveman(){
			return recieveman;
		}
		public void setRecieveman(String recieveman){
			this.recieveman=recieveman;
		}
		public String getApproval(){
			return approval;
		}
		public void setApproval(String approval){
			this.approval=approval;
		}
		public String getMovedate(){
			return movedate;
		}
		public void setMovedate(String movedate){
			this.movedate=movedate;
		}
		public String getShenpi(){
			return shenpi;
		}
		public void setShenpi(String shenpi){
			this.shenpi=shenpi;
		}
		public List<Move> getMovelist() {
			return movelist;
		}
		public void getMovelist(List<Move> movelist) {
			this.movelist = movelist;
		}
}

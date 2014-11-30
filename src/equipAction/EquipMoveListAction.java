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
		public String ID;
		public String name;
		public String from;
		public String to;
		public String moveman;
		public String recieveman;
		public String approval;
		public String movedate;
		
		
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;

		private List<Move> movelist = new ArrayList<Move>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				String sql="select * from move";
				stmt=conn.createStatement();
				ResultSet result=stmt.executeQuery(sql);
				while(result.next()){
					Move tmp=new Move();
					tmp.setID(result.getString(1));
					tmp.setName(result.getString(2));
					tmp.setFrom(result.getString(3));
					tmp.setTo(result.getString(4));
					tmp.setMoveman(result.getString(5));
					tmp.setRecieveman(result.getString(6));
					tmp.setApproval(result.getString(7));
					tmp.setMovedate(result.getString(8));
					movelist.add(tmp);
					ret=SUCCESS;
				}
				movelist.toArray();
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
		public List<Move> getMovelist() {
			return movelist;
		}
		public void getMovelist(List<Move> movelist) {
			this.movelist = movelist;
		}
}

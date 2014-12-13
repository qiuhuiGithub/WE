package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.Move;
import java.sql.*;
import database.DbCtrl;
@SuppressWarnings("serial")
public class EquipMoveAction extends ActionSupport {
		private Move Move=new Move();
		private String ID;
		private String name;
		private String from;
		private String to;
		private String moveman;
		private String recieveman;
		private String approval;
		private String movedate;
		
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt,stmt1;
	
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				String sql="insert into move values('"+ID+"'"+","+"'"+name+"'"+","+"'"+from+"'"+","+"'"+to+"','"+moveman+"','"
						+recieveman+"','"+approval+"','"+movedate+"')";
				stmt=conn.createStatement();
				stmt.executeUpdate(sql);
				String sql1="update equipment set location='"+to+"' "+"where ID='"+ID+"'";
				stmt1=conn.createStatement();
				stmt1.executeUpdate(sql1);
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
		public void setMoveman(String movaman){
			this.moveman=movaman;
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
}

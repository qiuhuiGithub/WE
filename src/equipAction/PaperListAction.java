package equipAction;

import com.opensymphony.xwork2.ActionSupport;
import javabean.paper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import database.DbCtrl;

@SuppressWarnings("serial")
public class PaperListAction extends ActionSupport {
		private paper paper=new paper();
		private String ID;
		private String name;
		private String content;
		private String type;
		
		private DbCtrl dbctrl;
		private Connection conn=null;
		private Statement stmt;
		private int id;
		private List<paper> paperlist = new ArrayList<paper>();
		
		public String execute(){
			dbctrl=new DbCtrl();
			String ret=ERROR;
			conn=dbctrl.getConnection();
			try{
				System.out.println(id);
				if(id==0){
					String sql="select * from paper";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						paper tmp=new paper();		
						tmp.setID(rs.getString(1));
						tmp.setName(rs.getString(2));
						tmp.setContent(rs.getString(3));
						tmp.setType(rs.getString(4));
						paperlist.add(tmp);
						ret=SUCCESS;
				    }
					paperlist.toArray();
				}
				else if(id==1){
					String sql="select * from paper where type='"+"合同'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						paper tmp=new paper();		
						tmp.setID(rs.getString(1));
						tmp.setName(rs.getString(2));
						tmp.setContent(rs.getString(3));
						tmp.setType(rs.getString(4));
						paperlist.add(tmp);
						ret=SUCCESS;
				    }
					paperlist.toArray();
				}			
				else if(id==2){
					String sql="select * from paper where type='"+"使用手册'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						paper tmp=new paper();		
						tmp.setID(rs.getString(1));
						tmp.setName(rs.getString(2));
						tmp.setContent(rs.getString(3));
						tmp.setType(rs.getString(4));
						paperlist.add(tmp);
						ret=SUCCESS;
				    }
					paperlist.toArray();
				}			
				else if(id==3){
					String sql="select * from paper where type='"+"设计手册'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						paper tmp=new paper();		
						tmp.setID(rs.getString(1));
						tmp.setName(rs.getString(2));
						tmp.setContent(rs.getString(3));
						tmp.setType(rs.getString(4));
						paperlist.add(tmp);
						ret=SUCCESS;
				    }
					paperlist.toArray();
				}			
				else if(id==4){
					String sql="select * from paper where type='"+"其它文档'";
					stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
						paper tmp=new paper();		
						tmp.setID(rs.getString(1));
						tmp.setName(rs.getString(2));
						tmp.setContent(rs.getString(3));
						tmp.setType(rs.getString(4));
						paperlist.add(tmp);
						ret=SUCCESS;
				    }
					paperlist.toArray();
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
		
		public paper getPaper(){
			return paper;
		}
		public void setPaper(paper paper){
			this.paper=paper;
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
	public List<paper> getPaperlist() {
			return paperlist;
		}
		public void getPaperlist(List<paper> paperlist) {
			this.paperlist =paperlist;
		}
}

package userAction;
import com.opensymphony.xwork2.ActionSupport;
import javabean.user;
import java.sql.*;
import database.DbCtrl;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{
	private user user=new user();
	private String username;
	private String password;
	private int isadmin;
	private int isedit;
	private int isuser;
	
	private DbCtrl dbctrl;
	private Connection conn=null;
	private Statement stmt;
	//String ret=null;
	//Connection conn=null;
	
	public String execute(){
		dbctrl=new DbCtrl();
		String ret=ERROR;
		conn=dbctrl.getConnection();
		try{
			String sql="select * from user where username='"+username+"'"+"and password='"+password+"'";
			stmt=conn.createStatement();
			ResultSet result=stmt.executeQuery(sql);
			if(result.next()){
				if(result.getInt(6)==1)
					ret=SUCCESS;
				else if(result.getInt(7)==1)
					ret="edit";
				else
					ret="user";
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
	public user getUser(){
		return user;
	}
	public void setUser(user user){
		this.user=user;
	}

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username=username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public int getIsadmin(){
		return isadmin;
	}
	public void setIsadmin(int isadmin){
		this.isadmin=isadmin;
	}
	public int getIsedit(){
		return isedit;
	}
	public void setIsedit(int isedit){
		this.isedit=isedit;
	}
	public int getIsuser(){
		return isuser;
	}
	public void setIsuser(int isuser){
		this.isuser=isuser;
	}
}

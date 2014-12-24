package userAction;

import com.opensymphony.xwork2.ActionSupport;

import javabean.user;
import java.sql.*;  
import java.util.ArrayList;
import java.util.List;

import database.DbCtrl;
@SuppressWarnings("serial")
public  class UserListAction extends ActionSupport {
	private user user=new user();
	private String username;
	private String password;
	private String sex;
	private String country;
	private String email;	
	private String partment;	
	private DbCtrl dbctrl;
	private Connection conn=null;
	private Statement stmt,stmt1,stmt2;
	private int id;
	//String ret=null;
	//Connection conn=null;
	private List<user> adminlist = new ArrayList<user>();
	private List<user> editlist = new ArrayList<user>();
	private List<user> userlist = new ArrayList<user>();
	public String execute(){
		dbctrl=new DbCtrl();
		String ret=null;
		conn=dbctrl.getConnection();	
	try{
		if(id==1){
		String sql="select * from user where isadmin="+"1";
		stmt=conn.createStatement();
		ResultSet result=stmt.executeQuery(sql);
		while(result.next()){
			user tmp=new user();
			tmp.setUsername(result.getString(1));
			tmp.setPassword(result.getString(2));
			tmp.setSex(result.getString(3));
			tmp.setCountry(result.getString(4));
			tmp.setEmail(result.getString(5));
			tmp.setPartment(result.getString(6));
			tmp.setIsadmin(result.getInt(7));
			tmp.setIsedit(result.getInt(8));
			tmp.setIsuser(result.getInt(9));
			adminlist.add(tmp);
		}
		adminlist.toArray();
		ret="success";
		}
		else if(id==2){
			String sql1="select * from user where isedit="+"1";
			stmt1=conn.createStatement();
			ResultSet result1=stmt1.executeQuery(sql1);
			while(result1.next()){
				user tmp1=new user();
				tmp1.setUsername(result1.getString(1));
				tmp1.setPassword(result1.getString(2));
				tmp1.setSex(result1.getString(3));
				tmp1.setCountry(result1.getString(4));
				tmp1.setEmail(result1.getString(5));
				tmp1.setPartment(result1.getString(6));
				tmp1.setIsadmin(result1.getInt(7));
				tmp1.setIsedit(result1.getInt(8));
				tmp1.setIsuser(result1.getInt(9));
				editlist.add(tmp1);
				ret="edit";
			 }
			editlist.toArray();
			}
		else if(id==3){
			String sql2="select * from user where isuser="+"1";
			stmt2=conn.createStatement();
			ResultSet result2=stmt2.executeQuery(sql2);
			while(result2.next()){
				user tmp2=new user();
				tmp2.setUsername(result2.getString(1));
				tmp2.setPassword(result2.getString(2));
				tmp2.setSex(result2.getString(3));
				tmp2.setCountry(result2.getString(4));
				tmp2.setEmail(result2.getString(5));
				tmp2.setPartment(result2.getString(6));
				tmp2.setIsadmin(result2.getInt(7));
				tmp2.setIsedit(result2.getInt(7));
				tmp2.setIsuser(result2.getInt(9));
				userlist.add(tmp2);
				ret="user";
			}
			userlist.toArray();
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
	public List<user> getAdminlist() {
		return adminlist;
	}

	public void setAdminlist(List<user> adminlist) {
		this.adminlist = adminlist;
	}
	public List<user> getEditlist() {
		return editlist;
	}

	public void setEditlist(List<user> editlist) {
		this.editlist = editlist;
	}
	public List<user> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<user> userlist) {
		this.userlist = userlist;
	}
	public user getUser(){
		return user;
	}
	public void setUser(user user){
		this.user=user;
	}
	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
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
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getCountry(){
		return country;
	}
	public void setCountry(String country){
		this.country=country;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getPartment(){
		return partment;
	}
	public void setPartment(String partment){
		this.partment=partment;
	}
}

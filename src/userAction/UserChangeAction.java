package userAction;

import com.opensymphony.xwork2.ActionSupport;

import javabean.user;
import java.sql.*;  
import java.util.ArrayList;
import java.util.List;

import database.DbCtrl;
public  class UserChangeAction extends ActionSupport {
	private user user=new user();
	private String username;
	private String password;
	private String sex;
	private String country;
	private String email;	
	private DbCtrl dbctrl;
	private Connection conn=null;
	private Statement stmt,stmt1,stmt2;
	private int id;
	//String ret=null;
	//Connection conn=null;
	public String execute(){
		dbctrl=new DbCtrl();
		String ret=null;
		conn=dbctrl.getConnection();	
	try{
		if(id==0){
		String sql="update user set isadmin=1,isedit=0,isuser=0 where username='"+username+"'";
		stmt=conn.createStatement();
		stmt.executeUpdate(sql); 
		ret="success";
		}
		else if(id==1){
			String sql1="update user set isadmin=0,isedit=1,isuser=0 where username='"+username+"'";
			stmt1=conn.createStatement();
			stmt1.executeUpdate(sql1); 
			ret="success";
			}
		else if(id==2){
			String sql2="update user set isadmin=0,isedit=0,isuser=1 where username='"+username+"'";
			stmt2=conn.createStatement();
			stmt2.executeUpdate(sql2); 
			ret="success";
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
}

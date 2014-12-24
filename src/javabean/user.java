package javabean;

public class user {
	private String username;
	private String password;
	private String sex;
	private String country;
	private String email;
	private String partment;
	private int isadmin;
	private int isedit;
	private int isuser;
	
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

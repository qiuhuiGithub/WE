package com.action;
import java.util.List;
import com.dao.PageDAO;
import javabean.Lost;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class EquipLostAction extends ActionSupport{
	private List<Lost> lost;
	private int pageNumber=1;//当前页数
private int pageSize=5; //每页显示的记录数
private int totalPage;//总页数
private String msg; //提示信息
public String getMsg() {
 return msg;
}
public void setMsg(String msg) {
 this.msg = msg;
}
public List<Lost> getLost() {
 return lost;
}
public void setLost(List<Lost> lost) {
this.lost = lost;
}
public int getPageNumber() {
 return pageNumber;
}
public void setPageNumber(int pageNumber) {
//处理页码范围
 if(pageNumber==0){
this.pageNumber =1;
this.setMsg("这已经是第一页！");
}
 else if(pageNumber>this.getTotalPage()){
this.pageNumber=this.getTotalPage();
this.setMsg("这已经是最后一页！");
 }else {
 this.pageNumber=pageNumber;}
 }
public int getPageSize() {
 return pageSize;
}
public void setPageSize(int pageSize) {
 this.pageSize = pageSize;
}
public int getTotalPage() {
//计算最后一页和总页数
 if(pd.getLostAmount()%pageSize==0){
this.setTotalPage(pd.getLostAmount()/pageSize);
 }else{
this.setTotalPage(pd.getLostAmount()/pageSize+1);
}
 return totalPage;
}
public void setTotalPage(int totalPage) {
 this.totalPage = totalPage;
}
PageDAO pd=new PageDAO();
public String execute(){
 lost=pd.Lost(pageSize,pageNumber);
 return SUCCESS;
}
}
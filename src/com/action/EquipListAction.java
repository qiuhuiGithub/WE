package com.action;
import java.util.List;
import com.dao.PageDAOEquip;
import javabean.Equipment;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class EquipListAction extends ActionSupport{
	private List<Equipment> Equipment;
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
public List<Equipment> getEquipment() {
 return Equipment;
}
public void setEquipment(List<Equipment> Equipment) {
this.Equipment = Equipment;
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
 if(pd.getEquipmentAmount()%pageSize==0){
this.setTotalPage(pd.getEquipmentAmount()/pageSize);
 }else{
this.setTotalPage(pd.getEquipmentAmount()/pageSize+1);
}
 return totalPage;
}
public void setTotalPage(int totalPage) {
 this.totalPage = totalPage;
}
PageDAOEquip pd=new PageDAOEquip();
public String execute(){
 Equipment=pd.Equipment(pageSize,pageNumber);
 return SUCCESS;
}
}
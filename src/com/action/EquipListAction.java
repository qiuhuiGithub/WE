package com.action;
import java.util.List;
import com.dao.PageDAOEquip;
import javabean.Equipment;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class EquipListAction extends ActionSupport{
	private List<Equipment> Equipment;
	private int pageNumber=1;//��ǰҳ��
private int pageSize=5; //ÿҳ��ʾ�ļ�¼��
private int totalPage;//��ҳ��
private String msg; //��ʾ��Ϣ
private int id;
public int getId() {
	 return id;
	}
public void setId(int id) {
	 this.id = id;
	}
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
//����ҳ�뷶Χ
 if(pageNumber==0){
this.pageNumber =1;
this.setMsg("���Ѿ��ǵ�һҳ��");
}
 else if(pageNumber>this.getTotalPage()){
this.pageNumber=this.getTotalPage();
this.setMsg("���Ѿ������һҳ��");
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
//�������һҳ����ҳ��
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
 if(id==1){
	 return "edit";
 }
 return SUCCESS;
}
}
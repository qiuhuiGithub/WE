package com.action;
import java.util.List;
import com.dao.PageDAOBroke;
import javabean.Broke;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class EquipBrokeListAction extends ActionSupport{
	private List<Broke> Broke;
	private int pageNumber=1;//��ǰҳ��
private int pageSize=5; //ÿҳ��ʾ�ļ�¼��
private int totalPage;//��ҳ��
private String msg; //��ʾ��Ϣ
private int id;
public String getMsg() {
 return msg;
}
public void setMsg(String msg) {
 this.msg = msg;
}
public List<Broke> getBroke() {
 return Broke;
}
public void setBroke(List<Broke> Broke) {
this.Broke = Broke;
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
public int getId(){
	return id;
}
public void setId(int id){
	this.id=id;
}
public int getTotalPage() {
//�������һҳ����ҳ��
 if(pd.getBrokeAmount()%pageSize==0){
this.setTotalPage(pd.getBrokeAmount()/pageSize);
 }else{
this.setTotalPage(pd.getBrokeAmount()/pageSize+1);
}
 return totalPage;
}
public void setTotalPage(int totalPage) {
 this.totalPage = totalPage;
}
PageDAOBroke pd=new PageDAOBroke();
public String execute(){
 Broke=pd.Broke(pageSize,pageNumber);
 if(id==1){
	 return "success1";
 }
 else{
 return SUCCESS;}
}
}
package com.action;
import java.util.List;
import com.dao.PageDAO;
import javabean.Lost;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class EquipLostAction extends ActionSupport{
	private List<Lost> lost;
	private int pageNumber=1;//��ǰҳ��
private int pageSize=5; //ÿҳ��ʾ�ļ�¼��
private int totalPage;//��ҳ��
private String msg; //��ʾ��Ϣ
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
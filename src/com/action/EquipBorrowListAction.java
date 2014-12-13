package com.action;
import java.util.List;
import com.dao.PageDAOBorrow;
import javabean.Borrow;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class EquipBorrowListAction extends ActionSupport{
	private List<Borrow> Borrow;
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
public List<Borrow> getBorrow() {
 return Borrow;
}
public void setBorrow(List<Borrow> Borrow) {
this.Borrow = Borrow;
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
 if(pd.getBorrowAmount()%pageSize==0){
this.setTotalPage(pd.getBorrowAmount()/pageSize);
 }else{
this.setTotalPage(pd.getBorrowAmount()/pageSize+1);
}
 return totalPage;
}
public void setTotalPage(int totalPage) {
 this.totalPage = totalPage;
}
PageDAOBorrow pd=new PageDAOBorrow();
public String execute(){
 Borrow=pd.Borrow(pageSize,pageNumber);
 return SUCCESS;
}
}
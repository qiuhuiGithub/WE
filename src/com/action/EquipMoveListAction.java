package com.action;
import java.util.List;
import com.dao.PageDAOMove;
import javabean.Move;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class EquipMoveListAction extends ActionSupport{
	private List<Move> Move;
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
public List<Move> getMove() {
 return Move;
}
public void setMove(List<Move> Move) {
this.Move = Move;
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
 if(pd.getMoveAmount()%pageSize==0){
this.setTotalPage(pd.getMoveAmount()/pageSize);
 }else{
this.setTotalPage(pd.getMoveAmount()/pageSize+1);
}
 return totalPage;
}
public void setTotalPage(int totalPage) {
 this.totalPage = totalPage;
}
PageDAOMove pd=new PageDAOMove();
public String execute(){
 Move=pd.Move(pageSize,pageNumber);
 return SUCCESS;
}
}
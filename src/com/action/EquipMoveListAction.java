package com.action;
import java.util.List;
import com.dao.PageDAOMove;
import javabean.Move;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class EquipMoveListAction extends ActionSupport{
	private List<Move> Move;
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
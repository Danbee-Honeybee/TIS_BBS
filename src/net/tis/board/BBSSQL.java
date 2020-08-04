package net.tis.board;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import net.tis.common.DB;
import net.tis.common.Global;

public class BBSSQL extends Global {	
  public BBSSQL() {
	 CN = DB.getConnection();
	 if(CN==null) {
	    System.out.println("BBSSQL기본생성자 db연결실패 ");
	 }
   }//end
	
   
  public int BBSInsert(BBSDTO dto) {
	int ok = 0;
	try {
	
	}catch(Exception ex){ }
	return ok ;
  }//end
  
  
  public ArrayList<BBSDTO> bbsSelect( ) {
	  ArrayList<BBSDTO> list= new ArrayList<BBSDTO>();
	 try {
	  String a=" select * from ( ";
	  String b=" select  from bbs";
	  String c=" ) ";
	  msg=a+b+c;
	  ST = CN.createStatement();
	  RS = ST.executeQuery(msg);
	 
	 }catch(Exception e) { }
	 return list;
  }//guestSelect end
	
	
  public int bbsAlltotal() {
	int count=0;
	try {
	 msg="select count(*) as cnt from bbs ";
	 ST=CN.createStatement();
	 RS=ST.executeQuery(msg);
	 if(RS.next()==true) { count=RS.getInt("cnt"); }
	}catch(Exception ex) { }
	return count;
  }//end
  
  
  public BBSDTO  guestDetail(String data) { //한건상세출력
	 BBSDTO dto = new BBSDTO(); 
	try {
	  msg="select * from  where  ~  = " ;
	  ST=CN.createStatement();
	  RS=ST.executeQuery(msg);
	  
	}catch(Exception ex) { }
	return dto;
  }//guestDetail end
  
  
  public int bbsDelete( String my ) {
  	 int ok=0;
	 try {
		msg="delete from bbss where ~ " ;
		
	 }catch (Exception e){System.out.println(e);}
	 return ok; 
	}//guestDelete end
	
}//BBSSQL class END






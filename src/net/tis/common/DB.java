package net.tis.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB { //ssi.jsp문서 역할
   public static  Connection  getConnection(){
	  Connection CN = null ; 
	  try{
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    String url="jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
	    CN=DriverManager.getConnection(url,"system","1234");
	    //주석 System.out.println("오라클연결성공success ");
	   }catch(Exception ex){
		 System.out.println("db연결에러: "+ ex.toString() ); 
	   }
	  return CN;
   }//end
}//DB class END

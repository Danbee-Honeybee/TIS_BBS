package net.tis.common;

import java.sql.*;
import java.util.Date;
import java.util.ArrayList; //전체조회,한건조회

public class Global {
	public  Connection CN ; //DB서버정보및 user/pwd기억, CN참조해서 명령어생성
	public  Statement ST ; //정적인명령어 ST=CN.createStatement(X);
	public  PreparedStatement PST; //동적인명령어 PST=CN.prepareStatement(sql);
	public  CallableStatement CS ; //나중에 storedprocedure
	public  ResultSet RS ;//조회한결과기억 RS=ST.executeQuery(select~),RS.next()
		
	public  int Grn; //행번호		  
	public  int Gsabun, Gpay , Ghit; //사번,급여,조회수
	public  String Gname, Gtitle ; //이름,제목
	public  Date Gwdate ; //날짜
	public  String Gemail; //메일
	  
	public  int Gdata ; //int data 대신 
	public  int Gtotal = 1 ; //조회레코드갯수
	public  int Atotal = 1 ; //전체레코드갯수
	public  String msg ; //쿼리문기억하는 문자열
	public  ArrayList  Glist ; 
}//Global class END





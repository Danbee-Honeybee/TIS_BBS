package net.tis.goods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.tis.common.DB;
import net.tis.common.Global;

public class GoodsSQL extends Global {
	Connection CN;
	//상품 SQL문 생성
	public GoodsSQL() {
		try {
			CN = DB.getConnection();
			System.out.println("GoodsSQL DB연결 성공");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("GoodsSQL" + e.getMessage());
		}
	}
	//총 제품 수 구하기
	public int goodsCount(String sqry) {
		int count = 0; //상품수
		try {
			msg = "select count(*) cnt from goods"+sqry;
			ST = CN.createStatement();
			RS = ST.executeQuery(msg);
			if(RS.next()) {
				count = RS.getInt("cnt");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	//제품 리스트 구하기
	public ResultSet goodsList(int start, int end, String sqry) {
		try {
			String a = "select * from";
			String b = "(select rownum rn, gnum, gname, gfile from goods" + sqry;
			String c = ") where rn between " + start + " and " + end + " order by gnum desc";
			msg = a+b+c;
			ST = CN.createStatement();
			RS = ST.executeQuery(msg);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return RS;
	}
	//제품 상세보기 구하기
	public ResultSet goodsDetail(int gnum) {
		try {
			msg = "select * from goods where gnum = " + gnum;
			ST = CN.createStatement();
			RS = ST.executeQuery(msg);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return RS;
	}
	//제품 삭제 하기
	public int goodsDelete(int gnum) {
		int ok = 0;
		try {
			msg = "delete from goods where gnum = " + gnum;
			ST = CN.createStatement();
			ok = ST.executeUpdate(msg);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return ok;
	}
	//댓글 저장하기
	public int goodsReplyInsert(int gnum, String rcontent) {
		int ok = 0;
		try {
			String a = "insert into goodsreply values(goodsReply_sequence.nextval,";
			String b = " '"+rcontent+"', "+gnum+", sysdate)";
			msg = a+b;
			ST = CN.createStatement();
			ok = ST.executeUpdate(msg);
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return ok;
	}//end
	//댓글 출력하기
	public ResultSet goodsReplyList(int gnum) {
		try {
			msg = "select * from goodsreply r inner join goods g on r.gnum = g.gnum ";
			msg += "where r.gnum = " + gnum;
			ST = CN.createStatement();
			RS = ST.executeQuery(msg);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return RS;
	}//end
	//댓글 삭제하기
	public int goodsReplyDelete(int rnum) {
		int ok = 0;
		try {
			msg = "delete from goodsreply where rnum="+rnum;
			ST = CN.createStatement();
			ok = ST.executeUpdate(msg);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return ok;
	}//end
	//댓글 수정하기
	public int goodsReplyEdit(int rnum, String content) {
		int ok = 0;
		try {
			msg = "update goodsreply set rcontent = '" + content +"', rdate = sysdate where rnum =" + rnum; 
			ST = CN.createStatement();
			ok = ST.executeUpdate(msg);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return ok;
	}
	
}

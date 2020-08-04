package net.tis.goods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.tis.common.DB;
import net.tis.common.Global;

public class GoodsSQL extends Global {
	Connection CN;
	//��ǰ SQL�� ����
	public GoodsSQL() {
		try {
			CN = DB.getConnection();
			System.out.println("GoodsSQL DB���� ����");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("GoodsSQL" + e.getMessage());
		}
	}
	//�� ��ǰ �� ���ϱ�
	public int goodsCount(String sqry) {
		int count = 0; //��ǰ��
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
	//��ǰ ����Ʈ ���ϱ�
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
	//��ǰ �󼼺��� ���ϱ�
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
	//��ǰ ���� �ϱ�
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
	//��� �����ϱ�
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
	//��� ����ϱ�
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
	//��� �����ϱ�
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
	//��� �����ϱ�
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

package net.tis.member;

import net.tis.common.DB;
import net.tis.common.Global;

public final class MemberSQL extends Global {
	public MemberSQL() {
		 CN = DB.getConnection();
		 if(CN==null) {
		    System.out.println("MemberSQL에서 데이터베이스 연결 실패");
		 }
	}
	
}

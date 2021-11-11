package com.web.guestbook.model;

import java.sql.SQLException;

import com.jspweb.dbconn.OracleCloudConnect;

public class GuestBookDAO {
	OracleCloudConnect occ = null;
	
	public GuestBookDAO() throws SQLException {
		this.occ = new OracleCloudConnect();
		this.occ.connection();
	}
	
	
	public boolean insert(GuestBookDTO dto) throws SQLException {
		//insertquery는 오라클클라우드커넥트 클래스에 이미 만들어둔것이고 고정 쿼리라서 항상 이렇게 써 주면 된다.
		String query = "INSERT INTO GUESTBOOK VALUES(" 
					+"GUESTBOOK_SEQ.NEXTVAL,"
					+"'" + dto.getIpaddr() + "',"
					+"'" +dto.getContext() + "',"
					+"SYSDATE"
					+")";
		int res = occ.insertQuery(query);
		if(res == 1) {
		return true;
		}
		return false;
		
	}
	//service쪽 사용
	public void commit() throws SQLException {
		occ.commit();
		
	}
	//service쪽 사용
	public void rollback() throws SQLException {
		occ.rollback();
	}

}

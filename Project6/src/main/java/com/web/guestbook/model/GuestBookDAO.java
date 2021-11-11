package com.web.guestbook.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspweb.dbconn.OracleCloudConnect;


public class GuestBookDAO {
	OracleCloudConnect occ = null;
	
	public GuestBookDAO() throws SQLException {
		this.occ = new OracleCloudConnect();
		this.occ.connection();
	}
	public List<GuestBookDTO> select() throws SQLException {
		List <GuestBookDTO> datas = new ArrayList<GuestBookDTO>();
		String query ="SELECT * FROM GUESTBOOK ORDER BY G_DATE DESC";
		ResultSet res = occ.sendQuery(query);
		
		//resultSet 활용법
		while(res.next()) {
			//인덱스 부분에는 컬럼명 혹은 인덱스로 지정 하면 되는데 간혹 문제가 생길때 순서에 문제가 생길 수 있다.
			//이것들을 전부  guestbookdto에 담아줘야한다.
			//List에 담아줘야하니깐 List도 작성
			GuestBookDTO dto = new GuestBookDTO();
			dto.setId(res.getInt("g_id"));
			dto.setIpaddr(res.getString("g_ipaddr"));
			dto.setContext(res.getString("g_context"));
			dto.setDate(res.getDate("g_date"));
			datas.add(dto);
		}
		res.close();
		occ.close();
		
		return datas;
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
		occ.close();
		
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

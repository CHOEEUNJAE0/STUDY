package com.web.guestbook.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspweb.dbconn.OracleCloudConnect;


public class GuestBookDAO {
	OracleCloudConnect occ = null;
	
	public GuestBookDAO() {
		try {
			this.occ = new OracleCloudConnect();
			this.occ.connection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public List<GuestBookDTO> select()   {
		List <GuestBookDTO> datas = new ArrayList<GuestBookDTO>();
		String query ="SELECT * FROM GUESTBOOK ORDER BY G_DATE DESC";
		ResultSet res;
		try {
			res = occ.sendQuery(query);
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//resultSet 활용법
		return datas;
	}
	 public GuestBookDTO select(int id) {
	    	GuestBookDTO dto = new GuestBookDTO();
	    	String query = "SELECT * FROM GUESTBOOK"
	    			+ " WHERE G_ID = " + id;
	    	
	    	try {
				ResultSet res = occ.sendQuery(query);
				res.next();
				dto.setResultSet(res);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    	
	    	return dto;
	    }
	
	
	
	public boolean insert(GuestBookDTO dto) {
		//insertquery는 오라클클라우드커넥트 클래스에 이미 만들어둔것이고 고정 쿼리라서 항상 이렇게 써 주면 된다.
		String query = "INSERT INTO GUESTBOOK VALUES(" 
					+"GUESTBOOK_SEQ.NEXTVAL,"
					+"'" + dto.getIpaddr() + "',"
					+"'" +dto.getContext() + "',"
					+"SYSDATE"
					+")";
		int res = 0;
		try {
			res = occ.insertQuery(query);
			occ.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res == 1 ? true : false;
	}
	
	public boolean update(GuestBookDTO dto) {
		String query = "UPDATE GUESTBOOK"
				+ "SET"
				+" G_CONTEXT = '" +dto.getContext() + "'"
				+ "WHERE G_ID = " + dto.getId() + "";
		int res = 0;
		try {
			res = occ.insertQuery(query);
			occ.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res == 1 ? true : false;
	}
	 public boolean delete(GuestBookDTO dto) {
	    	String query = "DELETE FROM GUESTBOOK"
	    			+ " WHERE G_ID = " + dto.getId() + "";

	    	int res = 0;
	    	try {
				res = occ.deleteQuery(query);
				occ.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

	    	return res == 1 ? true : false;
	    }
	
	
	//service쪽 사용
	public void commit(){
		try {
			occ.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//service쪽 사용
	public void rollback()  {
		try {
			occ.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void close() {
		try {
			occ.connectionClose();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

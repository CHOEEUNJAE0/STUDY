package com.web.bookmark.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspweb.dbconn.OracleCloudConnect;

public class BookMarkDAO {
	
	private OracleCloudConnect occ;
	
	//try catch 생성
	public BookMarkDAO() {
		try {
			this.occ = new OracleCloudConnect();
			this.occ.connection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//try catch 생성 후
	//select에는 조회 쿼리
	public List<BookMarkDTO> select() {
		
		List<BookMarkDTO> datas = new ArrayList<BookMarkDTO>(); 
		
		
		String query = "SELECT * FROM BOOKMARK ORDER BY B_ID";
		//이걸 OCC에 SENDQUERY 그럼 resultset 반환
		//SEDNQUERY TRY CATCH 해 준다
		ResultSet res;
		try {
			res = occ.sendQuery(query);
			//받은 resultSet을  while 반복문 이용 resultset에 담겨 있는 데이터를 ArrayList<>에 담아 주는 작업을 해준다
			while(res.next()) {
				BookMarkDTO dto = new BookMarkDTO();
				dto.setName(res.getString("B_NAME"));
				dto.setUrl(res.getString("B_URL"));
				datas.add(dto);
			}
			res.close();
			occ.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return datas;
	}
	
	//insert에서는 추가 쿼리
					//추가 할 게 뭐인지 알아야 추가가 되니깐 매개변수로 dto를 받아준다.
	public boolean insert(BookMarkDTO dto) {
		String query = "INSERT INTO BOOKMARK VALUES("
				+ "BOOKMARK_SEQ.NEXTVAL, "
				//B_NAME ->"dto.getName"
				+"'" + dto.getName() + "', "
				+"'" + dto.getUrl() +"') ";
		//만들었으면  res에 담아 준다. 그리고 try catch도 해준다.
		
		int res= 0;
		try {
			res = occ.insertQuery(query);
			occ.close(); //resultSet 만들어 준게 없어서 여기서는 occ만 close
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res == 1 ? true : false;
	}
	
	public void commit() {
		try {
			occ.commit();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
	}
	//try catch 만들어 주기 (던지기 x)
	public void rollback() {
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

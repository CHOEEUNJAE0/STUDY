package com.web.join.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jspweb.dbconnn.OracleCloudConnect;

public class JoinDAO {
	 
	OracleCloudConnect occ;

		public JoinDAO() {
			try {
			this.occ = new OracleCloudConnect();
			this.occ.connection();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public JoinDTO select(String userid) {
		String query ="SELECT * FROM REGISTER"
				+ "WHERE USER_ID = '" + userid + "'";
		JoinDTO data = null;
		//sendquery하면 resultset 반환
		try {  //resultset 받아와서 조회를 했는데 하나도 조회가 안될수도있고 하나가 조회가 될수도 있고 여러개 조회가 될수도 있다.pk이면 1개 
			ResultSet res = this.occ.sendQuery(query);
			
			if(res.next()) {  //결과가 하나라도 있으면 값 가져오는거 
						data  = new JoinDTO ( 
						res.getString("USERID"),
						res.getString("PASSWORD"),
						res.getString("USERNAME"),
						res.getString("BIRTHDAY"),
						res.getString("GENDER"),
						res.getString("EMAIL")
						);
			}
			res.close();
			occ.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void close() {
		try {
		occ.connectionClose(); 
			
		}catch (SQLException e ) {
			e.printStackTrace();
			
		}
	}
	public boolean insert(JoinDTO dto) {
		String query = "INSERT INTO REGISTER VALUES("
		+"REGISTER_SEQ.NEXTVAL,"
		+"'" + dto.getUserid()+ "'," //아이디 알아오렴
		+"'" +dto.getPassword()+"',"
		+"'" +dto.getUsername()+"',"
		+"'" +dto.getBirthday()+"',"
		+"'"  +dto.getGender()+"',"
		+"'"  +dto.getEmail()+"'";
		
		int res = 0;
		try {
			res = occ.insertQuery(query);
			occ.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res == 1 ? true : false ;
	}
	public void commit() {
		try {
			occ.commit();
		}catch (SQLException e ) {
			e.printStackTrace();
		}
		
	}
	public void rollback() {
		try {
			occ.rollback();
		}catch (SQLException e ) {
			e.printStackTrace();
		}

	}

}

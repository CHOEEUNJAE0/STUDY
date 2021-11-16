package com.web.join.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jspweb.dbconn.OracleCloudConnect;

public class JoinDAO {
	//오라클커넥션에 연결 해줘야한다.
	
	OracleCloudConnect occ;
	
	public JoinDAO() {
		try {
			this.occ = new OracleCloudConnect();
			this.occ.connection();
		} catch (SQLException e) {
			e.printStackTrace(); //connection과 관련 된 에러가 발생하면 기본 에러 메세지 출력 해 주는 것
			System.out.println("JoinDAO 생성자 동작에 에러 발생");
		}
	}

	public JoinDTO select(String username) {
		String query = "SELECT * FROM MEMBERS"
				+ " WHERE USERNAME = '" + username + "'";
		JoinDTO data = null; //처음엔 null이였다가
		
		try {		//여기서 resultset은 내가 조회했을때 하나도 조회가 안될수도or하나가조회될수도or여러개 조회될수도
					//pk가 아닌 이상 0개,1개,여러개 일 수 있다. 그렇기 때문에 결과를 단정 지으면 안된다.
			ResultSet res = this.occ.sendQuery(query);
			
			//조회가 될때
			if(res.next()) {
				data = new JoinDTO( //나중에 데이터 값 들어오는 것
						res.getInt("ID"),
						res.getString("USERNAME"),
						res.getString("PASSWORD"),
						res.getString("EMAIL"));
				}
			res.close();
			occ.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("JoinDAO select 메서드 동작에 에러 발생");
		}
		return data;
	}

	public void close() {	
		
		try {
			occ.connectionClose(); 
		}catch (SQLException e ) {
			e.printStackTrace();
			System.out.println("JoinDAO close 메서드 동작에 에러 발생");
		}
	}

	public boolean insert(JoinDTO dto) {
		String query = "INSERT INTO MEMBERS VALUES("
				+"MEMBERS SEQ.NEXTVAL,"
				+"'" + dto.getUsername()+"',"
				+"'" + dto.getPassword()+ "',"
				+"'" + dto.getEmail()+"')";
		
		int res = 0;
		
		try {
			res = occ.insertQuery(query);
			occ.close();
		}catch (SQLException e ) {
			e.printStackTrace();
			System.out.println("JoinDAO insert 메서드 동작에 에러 발생");
		}
		return res == 1 ? true : false;
}
		
	public void commit() {
		try {
			occ.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("JoinDAO commit 메서드 동작에 에러 발생");
		}
		
	}

	public void rollback() {
		try {
			occ.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("JoinDAO rollback 메서드 동작에 에러 발생");
		}
		
	}

}

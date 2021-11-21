package com.web.login.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jspweb.dbconn.OracleCRUD;
import com.jspweb.dbconn.OracleCloudConnect;
import com.web.join.model.JoinDTO;

public class LoginDAO extends OracleCRUD{
	

	public LoginDTO select(String username) {
		String query = "SELECT * FROM MEMBERS"
				+ " WHERE USERNAME = '" + username + "'";
		LoginDTO data = null; //처음엔 null이였다가
		
		try {		//여기서 resultset은 내가 조회했을때 하나도 조회가 안될수도or하나가조회될수도or여러개 조회될수도
					//pk가 아닌 이상 0개,1개,여러개 일 수 있다. 그렇기 때문에 결과를 단정 지으면 안된다.
			ResultSet res = this.occ.sendQuery(query);
			
			//조회가 될때
			if(res.next()) {
				data = new LoginDTO( //나중에 데이터 값 들어오는 것
						res.getString("USERNAME"),
						res.getString("PASSWORD"));

				}
			res.close();
			occ.close();

	} catch (SQLException e) {
		e.printStackTrace();
		System.out.println("JoinDAO select 메서드 동작에 에러 발생");
	}
	return data;
	}
	
	
}



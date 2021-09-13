package com.db.conn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.OracleConnection;
import oracle.jdbc.pool.OracleDataSource;



public class OracleCloudConnect {
	private final String DB_URL = "jdbc:oracle:thin:@mydb_medium?TNS_ADMIN=C:\\Wallet_myDB";
	private final String USERNAME = "USER1";
	private final String PASSWORD = "KHpass1234567890";
	//여기까지는 값만 설정 하였고  밑에 this.info ~ 여기에 설정을 집어 넣어 준 것.
	private Properties info = new Properties();
	private OracleDataSource ods = null;
	private OracleConnection conn = null;
	private Statement stat = null;
	
	
	public OracleCloudConnect() throws SQLException {
		/* JDBC 사용하여 Oracle Database 연결 하기위한 과정
		 * 	1. 데이터베이스 연결 구성 정보 생성
		 * 	2. 연결 구성 정보로 데이터베이스 연결
		 * 	3. Statement 생성
		 * 	4. Query 전송
		 * 	5. 결과 받기
		 * 	6. 모든 자원 반납 -> close()
		 */
		
		//OraclaDataBase에 접속하기 위한 설정
		//여기에 설정을 집어 넣은 것 
		this.info.put(OracleConnection.CONNECTION_PROPERTY_USER_NAME, USERNAME);
		this.info.put(OracleConnection.CONNECTION_PROPERTY_PASSWORD, PASSWORD);
		this.ods = new OracleDataSource();
		this.ods.setURL(DB_URL);
		this.ods.setConnectionProperties(this.info);
		
	}
	public void connection() throws SQLException {
		//연결은 여기서 하는 것 
		//OraclaDataBase에 접속
		this.conn = (OracleConnection) ods.getConnection();
	}
	public ResultSet sendQuery(String query) throws SQLException {
		//OraclaDataBase에 접속 후 Query 전송
		this.stat = this.conn.createStatement();
		return this.stat.executeQuery(query); 
	}
	public void close() throws SQLException {
		// 모든 작업을 완효 후에는 자원을 반납 하기 위해 close();
		this.stat.close();
	}
	public void connectionClose () throws SQLException {
		// 모든 작업을 완료한 후에는 연결을 끊기 위해 close;
		this.conn.close();
	}
	public static void main(String[] args) {
		try {
			OracleCloudConnect occ = new OracleCloudConnect();
			//접속
			occ.connection();
			//접속 후, 테이블이 제대로 불러 와 지면 reseultset 값이 반롼이 될 것이기 때문네 앞에 resultset을 붙여준다.
			ResultSet res = occ.sendQuery("SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES");
			//저 resultset은 while(res.next)로 반복문을 짜준다.
			//.next() 하게 되면 next 할 때 마다 row가 순차적으로 활성화 됨. 
			//.next()해서 이동 한 컬럼의 데이터 타입을 체크해서 적어줘야함.
			while(res.next()) {     //1은 첫번째 컬럼, 2는 두번째 컬럼 get+데이터타입으로 적어준다.
				System.out.println(res.getInt(1) + "|" + res.getString(2));
			}
			//while의 대한 close();
			res.close();
			occ.close();
			occ.connectionClose();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

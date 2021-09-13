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
	private Properties info = new Properties();
	private OracleDataSource ods = null;
	private OracleConnection conn = null;
	private Statement stat = null;
	private ResultSet rs = null;
	
	public OracleCloudConnect() throws SQLException {
		//OraclaDataBase에 접속하기 위한 설정
		this.info.put(OracleConnection.CONNECTION_PROPERTY_USER_NAME, USERNAME);
		this.info.put(OracleConnection.CONNECTION_PROPERTY_PASSWORD, PASSWORD);
		this.ods = new OracleDataSource();
		this.ods.setURL(DB_URL);
		this.ods.setConnectionProperties(this.info);
		
	}
	public void connection() throws SQLException {
		//OraclaDataBase에 접속
		this.conn = (OracleConnection) ods.getConnection();
	}
	public ResultSet sendQuery(String query) throws SQLException {
		//OraclaDataBase에 접속 후 Query 전송
		this.stat = this.conn.createStatement();
		ResultSet rs = this.stat.executeQuery(query); // 실행 결과로 ResultSet 받아온다
		return rs; 
	}
	public void close() throws SQLException {
		// 모든 작업을 완효 후에는 자원을 반납 하기 위해 close();
		this.rs.close();
		this.stat.close();
	}
	public void connectionClose () throws SQLException {
		// 모든 작업을 완료한 후에는 연결을 끊기 위해 close;
		this.conn.close();
	}
	public static void main(String[] args) {
		try {
			System.out.println("연결 정보 생성 중...");
			OracleCloudConnect occ = new OracleCloudConnect();
			System.out.println("연결 시도 중...");
			occ.connection();
			System.out.println("연결 완료!");
			occ.connectionClose();
			System.out.println("연결 해제!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

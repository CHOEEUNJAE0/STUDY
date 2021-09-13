package com.db.conn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.OracleConnection;
import oracle.jdbc.pool.OracleDataSource;



public class OracleCloudConnect {
	private final String DB_URL = "";
	private final String USERNAME = "";
	private final String PASSWORD = "";
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
		this.rs.close();
		this.stat.close();
	}
	public void connectionClose () throws SQLException {
		this.conn.close();
	}

}

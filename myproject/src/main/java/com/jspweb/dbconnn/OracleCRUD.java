package com.jspweb.dbconnn;

import java.sql.SQLException;

public abstract class OracleCRUD {
	
	protected OracleCloudConnect occ;
	
	public OracleCRUD() {
		//항상 만들어줄 커넥션이니깐 
		try {
			this.occ = new OracleCloudConnect();
			this.occ.connection();
		} catch (SQLException e) {
			e.printStackTrace(); //connection과 관련 된 에러가 발생하면 기본 에러 메세지 출력 해 주는 것
			System.out.println("JoinDAO 생성자 동작에 에러 발생");
			
		}
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
	public void close() {
		
		try {
			occ.connectionClose(); 
		}catch (SQLException e ) {
			e.printStackTrace();
			System.out.println("JoinDAO close 메서드 동작에 에러 발생");
		}
	}

}
	
		
	



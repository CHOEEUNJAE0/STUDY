package com.web.account.model;

import com.jspweb.dbconnn.MybatisConnect;
import com.jspweb.dbconnn.OracleCloudConnect;

import java.sql.*;

import org.apache.ibatis.session.SqlSession;

public class JoinDAO {
   // private OracleCloudConnect occ = null; 바티스 이용하니깐 occ빼도 된다
    private MybatisConnect mc = null;
    private SqlSession sess = null;
   // private final String DB = "ACCOUNTS";
    private final String Mapper = "AccountMapper";
    
    public JoinDAO() {
        this.mc = new MybatisConnect();
        this.sess = mc.getSession();
    }
    
    // 테이블에 데이터 추가
    public int createAccount(JoinDTO dto) {
    	//account.xml에 구문 적어주고 여기서는 구문 지워줌
    	int res = this.sess.insert(Mapper + ".insertAccount", dto);
        return res;
    }
    
    // 테이블에서 데이터 검색(계정명으로)
    public JoinDTO findAccount(String username) {
    		JoinDTO res = this.sess.selectOne(
    				Mapper + ".selectAccountUsername", username);

    	return res;
    }
    
    // 테이블에서 데이터 검색(식별값으로)
    public JoinDTO findAccount(int id) {
    	JoinDTO data = this.sess.selectOne(
    			Mapper + ".selectAccount", id);//여기에 맵핑 정보가 들어가야한다.
    	return data;
    	//    	JoinDTO res = null;
//    	
//    	String query = "SELECT * FROM " + DB
//    			+ " WHERE ID = ?";
//    	
//    	PreparedStatement st = occ.getPstat(query);
//    	try {
//    		st.setInt(1, id);
//    		ResultSet rs = occ.select(st);
//			if(rs.next()) {
//				res = new JoinDTO();
//				res.setId(rs.getInt("ID"));
//				res.setUsername(rs.getString("USERNAME"));
//				res.setPassword(rs.getString("PASSWORD"));
//			}
//			rs.close();
//			st.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//    	
//    	
//    	return res;
    }
    

    public int countAccount(JoinDTO dto) {
    	int res = this.sess.selectOne(	//하나만 세어주는거라서 selectOne
    			Mapper+ ".selectAccountCount", dto.getUsername());
    	return res;
    }
    
    // 데이터 수정
    public int updateAccount(JoinDTO dto) {
    	int res = this.sess.update(Mapper + ".updateAccount",dto );
    	
    	return res;
    }
    
    // 로그인 일자를 현재 일자로 수정
    public int updateLoginDate(JoinDTO dto) {
		int res = this.sess.update(Mapper + ".updateLoginDate", dto);
		
		return res;
	}
    
    // 데이터 삭제
    public int removeAccount(JoinDTO dto) {
    	int res = this.sess.delete(Mapper + ".deleteAccount", dto);
    	return res;
    }
    
    public void commit() {
    	mc.commit();
    }
    
    public void rollback() {
    	mc.rollback();
    }
    
    public void close() {
    	mc.close();
    }

}
package com.web.project7.account.model;

public class AccountDAO {
//	private MybatisConnect mc;
//	private SqlSession sess;
//	
//	//기본 생성자 만들어줌
//	public AccountDAO() {
//		this.mc = new MybatisConnect();
//		this.sess = mc.getSession();
//		
//	}
//
//		public boolean createAccount(AccountDTO dto) {
//			int res = this.sess.insert("마이바티스맵퍼", dto);
//			return res == 1 ? true : false;
//			
//		}
//	서블렛때는 이렇게 쭉 만들어 줬었는데 이제 만들어주지 않아도 된다. 이전에는 필요한 객체를 그때그때 만들어서 사용해주었는데 이제는 스프링 컨테이너에서 알아서 필요할때마다 객체를 주입시켜 준다.
	//이 주입을 DI(역전제어)라고 한다. 스프링 컨테이너에 이 OBJECT(객체)들을 미리 등록을 시켜줘야 주입을 시켜 줄 수 있다. OBJECT = BEAN이라고 한다.

}

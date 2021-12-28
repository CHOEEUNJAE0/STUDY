package com.web.project7.account.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.project7.account.entity.AccountVO;
import com.web.project7.account.model.AccountDTO;
import com.web.project7.account.model.AccountService;

//spring으로 컨트롤러 만들 떄 항상 controller 어노테이션 작성 해 줘야 한다.
//어노테이션 사용하기 위해 springframework 임포트 해준다.
@Controller
//requestMapping도 임포트 
@RequestMapping(value="account")
public class AccountController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	//어노테이션 후 메서드 만들어 주자
	//가입을 위한 메서드 가입문
	//return운 사용자에게 보여 줄 view 페이지
	//이 메서드가 동작 하기 위해 또 어노테이션 작성 리퀘스트메소드도 임포트
	@RequestMapping(value="/join", method=RequestMethod.GET)
	/*
	 * 사용자가 전달한 파라미터 값을 추출하기 위한 방법
	 * 	1. HttpServletRequest 객체의 .getParameter("파라미터명")을 사용
	 * 		public String join(HttpServletRequest rquest) {
	 * 			String username = request.getParameter("username");
	 * 	2. @RequestParam("파라미터명") 어노테이션 사용
	 * 			public String join(@RequestParam("username") String username) {
	 * 				system.out.println("username : " + username);			 * 	3. 커멘드(command) 객체 사용
	 * 		사용자가 전달하는 마라미터와 동일하게 맵핑 될 수 있는 VO(Value Object)fmf
	 * 		사용하는 방법
	 * 			public String join(AccountVO account) {
	 * 				system.out.println("username : " + account.getUsername);
	 */
	public String join() { 
		/*
		 * GET 요청 주소 http://localhost/account/join 주소로 동작 된다.
		 * 요청이 들어 온 후 페이지만 보여주고 끝이다 하면 return까지만 만들어주면 된다.
		 * 이제 views에 account를 만들어주자
		 */
		logger.info("회원가입 페이지를 요청하였습니다.");
		return "account/join";
		
	}
		//가입 정보 parameter들을 받아와야한다.
		
		//join.jsp에는 <form action="./join" method="post"> post로 동작 된다고 되어 있기 떄문에 
		//post도 만들어줘야 한다.
		@RequestMapping(value="/join", method=RequestMethod.POST)
//		public String join(HttpServletRequest request) {
//			String username = request.getParameter("username");
//			String[] password = request.getParameterValues("password"); //비밀번호랑 비밀번호 확인 두개 한번에 받는거라 배열로 표시
//			String email = request.getParameter("email");
		//리퀘스트 객체 말고 어노테이션 활용법도 있다. 역시 어노테이션 임포트 리퀘스트 객체를 사용하는것보다 작업이 쉬워진다.
		//이제 꼭 string만 사용하지 않아도 된다. 알아서 형변환 해줘서 int로 넣어도 값이 잘 들어온다
		//jsp 파일에 이름 지정한거랑 같으면 requestParam은 지워도 된다. 근데 이름이 다르거나 디폴트밸로 작성하게 되면 생략 할 수 없음
//		public String join(String username, String[] password,
//						   @RequestParam(value="email", defaultValue="sample@sample.com") String email) {
							//defaultValue= 값 입력 안해도 기본값 설정이 되어서 전송된다.
			//매핑정보가 너무 많아져서 열거하기 어렵다 하면 한번에 처리 할 수 있는 방법도 있다. 별도의 객체 필요
		//logger.info("회원가입 정보를 받았습니다. {}/ {}/ {}/ {}", username, password[0],password[1],email);
		public String join(AccountVO account) {
			//vo=value object
			
			logger.info("회원가입 정보를 받았습니다. {}/ {}/ {}/ {}",
			account.getUsername(),
			account.getPassword()[0], account.getPassword()[1],
			account.getEmail());
			//service 생성
			AccountService service = new AccountService();
			
			//service에 가입 요청(데이터는 DTO에 담아서 전달)
			//2.dt객체 만들어 줌 
			AccountDTO dto = new AccountDTO();
			dto.setUsername(account.getUsername());
			dto.setPassword(account.getPassword()[0]);
			dto.setEmail(account.getEmail());
			
			//1.가입을 하고자 하는 정보를 담아줘야하니깐 정보가 담긴 dto 객체 적어 줌
			boolean result = service.join(dto); //이거는 서비스단에 만들어 준다. 밑줄 클릭해서 만들어주기 
			
			//처리 결과에 따라서 다음의 로직 수행 불리언리절트는 위에 service.join으로 넘겨 줌 
			
			//boolean result = true; //실패했을 경우 , 성공했을경우로 하려면 true로 해주면 된다.(이렇게 하면 성고 ㅇ했을때 login으로 넘어감) 근데 false로 두고 가입 성공하면 비밀번호창 초기화 되서 리턴됨
			
			if(result)  {
			//성공 : 메인 페이지 또는 로그인 페이지로 리다이렉트
				return "redirect:/account/login"; //main페이지 :/
			
				//실페 : 다시 회원가입 페이지 양식 전달 (기존에 입력한 값으로 초기화하여 전달)
			} else {
				//model.addAttribute("account", account); //=request.setAttribute와 같은 것. 위에 Model model 써줘야 한다.
				return "account/join";

		}
		
	}
}



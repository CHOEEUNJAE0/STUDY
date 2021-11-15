
//index에서 button 수정 삭제에 작성 해 준 함수 만들어 주기
function guestModify(element) {
	//동작 확인 용 출력 메세지
	//alert("guestModity 동작 확인");
	
	//element에서는 td의 값 들어 가 있다. console.log(element);로 확인 해 보면 된다.
	
	var tr = element.parentElement;
	// 1. 테이블의 번호에 해당하는 값을 input 태그의 값으로 설정
	var id = tr.children[0];
	var id_input = document.createElement("input");
	id_input.type = "hidden";
    id_input.value = id.innerText;
    id_input.name = "id";
    id_input.setAttribute("form", "modify_form");
	id.append(id_input); //td에 넣어줘야하는데 input이 이미 td에 담겨 있으니깐 id.append("input")
	
	 
	// 2. 테이블의 내용에 해당하는 값을 textarea 태그의 값으로 설정
	var context = tr.children[2];
	var context_area = document.createElement("textarea");
	context_area.value = context.innerText;
	context.innerText = "";
	context_area.name = "context";
	context_area.setAttribute("form", "modify_form");
	context.append(context_area);
	
	// 3. 확인 버튼 눌렀을 때 서버에 전송이 가능하도록 form 태그도 생성
	var form = document.createElement("form");
	form.id = "modify_form";
	form.action = "./guest";
	form.method = "post";
	// 여기서 말하는 element는 td임 (td=button의 부모)
	element.append(form);
	
	// 4. 수정 버튼은 확인 버튼으로 변경
	var btn_modify = element.children[0];
	btn_modify.innerText = "확인";
	// 확인 누른 후 동작해야하는 쿼리
	btn_modify.onclick = function() {
		//이게 잘 작동이 된다면 guestbookcontroller의 post에 전달이 될 것
		document.getElementById("modify_form").submit();
	};
	// 5. 삭제 버튼은 취소 버튼으로 변경
	var btn_delete = element.children[1];
	btn_delete.innerText = "취소";
	//삭제 할 때 동작해야하는 쿼리문
	btn_delete.onclick = function() {};
	
	
	// 6. 취소 버튼을 눌렀으 ㄹ때 입력 폼들이 원래 상태로 돌아 가도록 재구성
}

function guestDelete(element) {
	//동작 확인 용 출력 메세지
	//alert("guestDelete 동작 확인");
}
function formValid(f) {
    //alert("전송");
    //유효성 검사 실패 시 false 반환
    //유효성 검사 성공 시 true 반환
    //return 값을 사용 해 준다.
    //return false;
    //숫자인지 판별하는 정규0-9사이의 숫자가이상이냐는 뜻 "[0-9]+"(+의 의미) 
         var re = new RegExp("^[0-9]{4}");
         var test2 = docugetElementById("id_test2");
         var isValid = false;
         if(test2.value.match(re) !=n& re.exec(test2).length == 1) {
             isValid = true;
         }
         if(!isValid) {
         //기본 이벤트 작업이 정수행되지 않아야 함을 알림
         //기존 submit 요청이 작한 걸로 인지하게 됨.
         //if를 사용 해서 써 준다.
         test2.value="";
         test2.setAttr("placeholder", "4자리입력");
        return false;
                       }
                       return true;
                }


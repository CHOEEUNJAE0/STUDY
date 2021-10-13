function f1() {
    var score = document.getElementById("var1").value;
    if(score >= 90 ) {
        document.getElementById("res1").innerHTML="A학점입니다.";
     }else if (score >=80) {
         document.getElementById("res1").innerHTML="B학점입니다.";
     }else if (score >= 70) {
         document.getElementById("res1").innerHTML="C학점입니다.";
     }else if (score >=60) {
         document.getElementById("res1").innerHTML="D학점입니다.";
     }else {
         document.getElementById("res1").innerHTML="과락입니다.";
  }
}

function f2() {
    var season = document.getElementById("var2").value;
    if (season > 0 && season <=3 ) {
        document.getElementById("res2").innerHTML="1분기 입니다.";
    } else if (season >3 && season<=6) {
        document.getElementById("res2").innerHTML="2분기 입니다.";
    }else if (season >6 && season <=9) {
        document.getElementById("res2").innerHTML="3분기 입니다.";
    } else if( season >9 && season<=12) {
        document.getElementById("res2").innerHTML="4분기 입니다.";
    } else {
        document.getElementById("res2").innerHTML="다시 입력하십시오.";
    }
}

function f3() {
    var op = document.getElementById("var3").value;
    switch (op) {
        case '+' : 
        document.getElementById("res3").innerHTML="더하기 기호를 입력했습니다.";
        break;
        case '-' :
        document.getElementById("res3").innerHTML="빼기 기호를 입력했습니다.";
        break;
        case '*' : 
        document.getElementById("res3").innerHTML="곱하기 기호를 입력했습니다.";
        break;
        case '/' : 
        document.getElementById("res3").innerHTML="나누기 기호를 입력했습니다.";
        break;
        default : 
        document.getElementById("res3").innerHTML="다시 입력하세요.";
    }
}

function f4() {
    var day = document.getElementById("var4").value;
    switch(day % 7) {
        case 0 :
        document.getElementById("res4").innerHTML="목요일 입니다.";
        break;
        case 1 :
        document.getElementById("res4").innerHTML="금요일 입니다.";
        break;
        case 2 : 
        document.getElementById("res4").innerHTML="토요일 입니다.";
        break;
        case 3 : 
        document.getElementById("res4").innerHTML="일요일 입니다.";
        break;
        case 4 : 
        document.getElementById("res4").innerHTML="월요일 입니다.";
        break;
        case 5 : 
        document.getElementById("res4").innerHTML="화요일 입니다.";
        break;
        case 6 : 
        document.getElementById("res4").innerHTML="수요일 입니다.";
        break;
    }
}


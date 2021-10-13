//function 뒤에 함수명 적어주고 return 타입 필요하지 않음
function getId() {
    console.log(document.getElementById("username"));
    //같은 id를 사용하고 있으면 첫번째로 사용한 id 내용이 출력 된다.
    console.log(document.getElementById("password"));

}

function getName() {
    console.log(document.getElementsByName("username")[0]);
    //같은 name을 사용하고 있으면 첫번째로 사용한 id 내용이 출력 된다.
    console.log(document.getElementsByName("password")[1]);
    console.log(document.getElementsByName("password")[2]);
}

function getTagName() {
    console.log(document.getElementsByTagName("input")[6]);
    console.log(document.getElementsByTagName("input")[7]);
    console.log(document.getElementsByTagName("input")[8]);
}

function getClass() {
    console.log(document.getElementsByClassName("input-form")[0]);
    console.log(document.getElementsByClassName("input-form")[1]);
    console.log(document.getElementsByClassName("input-form")[2]);
}

function getSelector() {
    //input인 태그가 선택 되는 것.
    console.log(document.querySelector("input"));
    console.log(document.querySelector("input").value);

    // #을 써주면 css 선택자 중에 id 선택 한 것.
    console.log(document.querySelector("#username"));
    console.log(document.querySelector("#username").value);

    console.log(document.querySelector("#password"));
    console.log(document.querySelector("#password").value);
    //. : 클래스 선택
    console.log(document.querySelector(".input-form"));
    console.log(document.querySelector(".input-form").value);
}

function getSelectorAll() {
    //input인 태그가 선택 되는 것.
    console.log(document.querySelectorAll("input"));
    console.log(document.querySelectorAll("input").value);

    // #을 써주면 css 선택자 중에 id 선택 한 것.
    console.log(document.querySelectorAll("#username"));
    console.log(document.querySelectorAll("#username").value);
    
    console.log(document.querySelectorAll("#password"));
    console.log(document.querySelectorAll("#password").value);
    //. : 클래스 선택
    console.log(document.querySelectorAll(".input-form"));
    console.log(document.querySelectorAll(".input-form").value);
    
}
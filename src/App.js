import React, {useState, useEffect } from 'react';
import { Header } from 'tar';
import './App.css';
import customAxios from './customAxios';

function App(){
  //IP 주소 변수 선언
  const [ip,setIp] = useState('');

  //IP 주소 값 설정
  function callback(data) {
    setIp(data);
  }

  //첫번째 랜더링을 마친 후 실행
  useEffect(
    () => {
      //클라이언트의 IP 주소를 알아내는 백엔드의 함수 호출
      customAxios('/ip',callback);
    }, []
  );

  return(
    <div className="App">
      <header className="App-header">
        이 기기의 IP 주소는 {ip} 입니다.
      </header>
    </div>
  );
  
}
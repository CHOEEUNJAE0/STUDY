import logo from './logo.svg';
import axios from "axios";
import { useState, useEffect } from "react";
import './App.css';



function App() {


  return (
  <div className="App">

  
  <h1>사원 정보</h1>
  <input className="search" type="text"></input> <button type="submit" className="top-btn">검색</button>
  <hr className="hr-2"></hr>
  <table>
    <Thead></Thead>
    <Tbody></Tbody>
  </table>
  <div>
    <a href="#" className="bottom-btn">등록</a>
    <a href="#" className="bottom-btn">삭제</a>
  </div>
</div>
  );
}


function Thead(){
  return (
    <thead>
    <tr>
      <th>No</th>
      <th>ID</th>
      <th>이름</th>
      <th>회사</th>
      <th>직급</th>
      <th>연락처</th>
      <th>EMAIL</th>
    </tr>
  </thead>
  )
}
function Tbody(){
  const [selectDate,setSelectData] = useState([{
    id:'',
    name:'',
    company:'',
    position:'',
    pno:'',
    email:''
  }])

  return (
    // useEffect(async() => {
    //   try{
    //   // 데이터를 받아오는 동안 시간이 소요됨으로 await 로 대기
    //     const res = await axios.get('/board')
    //     // 받아온 데이터로 다음 작업을 진행하기 위해 await 로 대기
    //     // 받아온 데이터를 map 해주어 rowData 별로 _inputData 선언
    //     const _selectDate = await res.data.map((rowData) => ({
    //       id:rowData.id,
    //       name:rowData.name,
    //       company:rowData.company,
    //       position:rowData.position,
    //       pno:rowData.pno,
    //       email:rowData.email
    //           })
    //     )
    //     // 선언된 _inputData 를 최초 선언한 inputData 에 concat 으로 추가
    //     setInputData(inputData.concat(_inputData))
    //   } catch(e){
    //     console.error(e.message)
    //   }
    // },[])
  
    <tbody>
      <tr>
        <td>1</td>
        <th>ondal</th>
        <td>최온달</td>
        <td>냥냥상사</td>
        <td>대리</td>
        <td>010-0000-0000</td>
        <td>ondal@yaong.cat</td>
      </tr>
    </tbody>
  )
}

export default App;

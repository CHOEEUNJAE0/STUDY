--전체 조회
SELECT * FROM EMPLOYEES;
SELECT * FROM employees;

--컬럼명을 명시하여 필요한 컬럼만 조회한다.
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME FROM EMPLOYEES;

-- 가독성이 좋게 형태를 만든다.
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , last_name
FROM  EMPLOYEES; 

--SELECT 절에서 산술 연산 사용 || (OR) 의 의미
--AS 키워드로 컬럼에 별칭 부여
SELECT first_name || ' ' || last_name AS 이름
   , salary * 12 AS 연봉
FROM employees;

--DISTINCT 키워드로 중복 데이터를 제거 하고 조회
SELECT DISTINCT manager_id AS 관리자ID, department_id AS 부서ID
FROM employees;


--WHRER 절을 사용하여 조건 검색
SELECT department_id
 , FIRST_NAME
 , LAST_NAME
 FROM EMPLOYEES
 WHERE department_id = 30;
 -- SQL에서 = 은 할당이 아니라 같다의 의미.

 SELECT DEPARTMENT_ID
  , FIRST_NAME
  , last_name
  ,SALARY
  FROM EMPLOYEES
  WHERE SALARY >= 10000;



  
 SELECT DEPARTMENT_ID
  , FIRST_NAME
  , last_name
  ,SALARY
  FROM EMPLOYEES
  WHERE SALARY >= 10000
  AND department_id = 30;
  --이건 두가지 조건 모두 충족해야 출력
  -- FROM 먼저 확인
  --조건문 WHERE 절 확인
  -- 그 다음 SELECT 확인 


--NULL 연산자는 =, != 을 사용하면 안되고 
--IS, IS NOT을 사용해야 한다.
  SELECT *
  FROM EMPLOYEES
  WHERE commission_pct IS NULL;

  SELECT *
  FROM EMPLOYEES
  WHERE commission_pct IS NOT NULL;

    SELECT *
  FROM EMPLOYEES
  WHERE NULL = NULL 
  AND department_id = 30;

--LIKE 사용 
--앞 뒤 글자수 지정
  SELECT *
   FROM employees
WHERE phone_number LIKE  '___.127.____';

--% 사용 
--앞 뒤 글자수 지정X
SELECT *
 FROM employees
WHERE phone_number LIKE '%127%';

--연산 우선 순위는 () 소괄호로 조정해서 사용 할 수 있다
SELECT employee_id
       ,salary
       ,department_id
 FROM employees
  WHERE department_id = 50
   OR department_id = 60
   AND salary >= 5000;

SELECT employee_id
       ,salary
       ,department_id
 FROM employees
  WHERE( department_id = 50 OR department_id = 60 )
   AND salary >= 5000;


SELECT *
 FROM employees
 WHERE department_id = 30;


SELECT *
 FROM employees
WHERE NULL = NULL
 AND department_id = 30;

-- 임시테이블(DUAL)을 사용하여 연산테스트
SELECT 1 + 1 FROM DUAL;

--BETWEEN AND
SELECT EMPLOYEE_ID, SALARY
FROM employees
WHERE SALARY BETWEEN 12000 AND 24000; 

--user 1 계정 (스키마) 가 가지고 있는 모든 테이블에 대한 조회
-- table을 전부 적어 준다.

SELECT country_id AS 국가코드 
      , country_name AS 국가명
      , region_id AS 지역코드
   FROM countries;
SELECT department_id AS 부서코드
     ,department_name AS 부서명
     ,manager_id AS 관리자코드
     ,location_id AS 위치코드
FROM departments;
        
SELECT employee_id AS 사원코드
     ,first_name AS 이름
     ,last_name AS 성 
     ,email AS 이메일
     ,phone_number AS 전화번호
     ,hire_date AS 고용일
     ,job_id AS 직무코드
     ,salary AS 급여
     ,commission_pct AS 인센티브
     ,manager_id AS 관리자코드
     ,department_id AS 부서코드
 FROM employees;

SELECT job_id AS 직무코드
      ,job_title AS 직무명
      ,min_salary AS 최저임금
      ,max_salary AS 최고임금
FROM jobs;
SELECT employee_id AS 사원번호
    ,start_date AS 입사일
    ,end_date AS  퇴사일
    ,job_id AS  직무코드
    ,department_id AS 부서코드
FROM job_history;
SELECT location_id AS 위치코드
       ,street_address AS 도로주소
       ,postal_code AS 우편번호
       ,city AS 도시명
       ,state_province AS 주
       ,country_id AS 국가코드
FROM locations;
SELECT region_id AS 지역코드
     , region_name AS 지역이름
FROM regions;


--departments 테이블에서 departments_name 이 Marketing인 데이터 조회

SELECT   department_id AS 부서코드
     ,department_name AS 부서명
     ,manager_id AS 관리자코드
     ,location_id AS 위치코드
FROM departments
WHERE department_name = 'Marketing';

--departments 테이블에서 departments_name이 IT가 포함 된 데이터 조회
SELECT  department_id AS 부서코드
     ,department_name AS 부서명
     ,manager_id AS 관리자코드
     ,location_id AS 위치코드
 FROM departments 
WHERE DEPARTMENT_NAME LIKE '%IT%';

--locations 테이블에서 county_id가 US인 데이터 조회를 할 때 street_address, postal_code, city 칼럼이 조회 되도록 한다.

SELECT location_id AS 위치코드
       ,street_address AS 도로주소
       ,postal_code AS 우편번호
       ,city AS 도시명
       ,state_province AS 주
       ,country_id AS 국가코드
       FROM locations
WHERE country_id = 'US';


--locations 테이블에서 postal_code 가 5자리인 데이터 조회
SELECT location_id AS 위치코드
       ,street_address AS 도로주소
       ,postal_code AS 우편번호
       ,city AS 도시명
       ,state_province AS 주
       ,country_id AS 국가코드
FROM locations
WHERE postal_code LIKE '_____%';


--employees 테이블에서 manager_id가 100 이고 department_id가 50인 데이터 조회
SELECT employee_id AS 사원코드
     ,first_name AS 이름
     ,last_name AS 성 
     ,email AS 이메일
     ,phone_number AS 전화번호
     ,hire_date AS 고용일
     ,job_id AS 직무코드
     ,salary AS 급여
     ,commission_pct AS 인센티브
     ,manager_id AS 관리자코드
     ,department_id AS 부서코드
FROM employees
WHERE manager_id = 100 and department_id = 50;


--employees 테이블에서 commission_pct가 NULL이 아니면서 salary가 10000 이상인 데이터를 조회
SELECT employee_id AS 사원코드
     ,first_name AS 이름
     ,last_name AS 성 
     ,email AS 이메일
     ,phone_number AS 전화번호
     ,hire_date AS 고용일
     ,job_id AS 직무코드
     ,salary AS 급여
     ,commission_pct AS 인센티브
     ,manager_id AS 관리자코드
     ,department_id AS 부서코드
FROM employees
WHERE commission_pct IS NOT NULL 
AND salary >= 10000;


--위에서 조회한 모든 영문 컬럼을 한글로 바꾸어 조회하시오.
--맨 위에 스키마 조회 한 것에 AS 를 이용해서 전부 한글로 바꾸어 준다.
-- 그 뒤에 해당하는 로직에 해당하는 테이블 정보를 삽입해서 실행 하면 된다.
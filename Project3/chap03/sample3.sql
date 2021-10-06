--오라클 제공 함수
--함수 테스트 할 때는 실제 테이블이 없어도 된다.
SELECT * FROM DUAL; -- 이 임시 테이블을 사용 하면 된다.
--ROUND 반올림 
SELECT ROUND(1.1234,2),
       ROUND(1.4567,3),
       --TRUNC 뒷자리 버림
       TRUNC(1.1234,2),TRUNC(1.4567,3),
       --POWER 거듭제곱
       POWER(2,2),POWER(3.,2),
       --MOD 나머지 계산
       MOD(5,2),MOD(7,5)
FROM DUAL;

--LOWER 소문자 변환 / UPPER 대문자 변환
SELECT  LOWER('ABCD'), UPPER('asdf'),
        --문자열 결합
        CONCAT('ASD','FDGDF'),
        --LTRIM 왼쪽 공백 삭제 / RTRIM 오른쪽 공백 삭제
        LTRIM(' fsdf'), RTRIM('fsdfs '),
        --왼쪽/오른쪽 지정한 문자 삭제
        LTRIM('---abdc---', '-'), RTRIM('---fsdfs---', '-'),
        --TRIM 공백 삭제 / 지정 문자 삭제
        TRIM('   ASD   '),TRIM('-' FROM '---ASD---')
FROM DUAL;

--SUBSTR 문자열 자르기= 4번째부터 3자리 출력
SELECT SUBSTR('substr', 4, 3), SUBSTR('문자열자르기', 4, 3),
--REPLACE 문자열 바꾸기
       REPLACE('STR_REPLACE', 'REPLACE', '바꾸기'),
--LENGTH 문자열 길이 구하기      
       LENGTH('문자열길이'),
--LENGTHB 문자열의 BYTE 크기
       LENGTHB('문자열길이')
FROM DUAL;

SELECT NVL(NULL, 1), NVL('널아님', 1)
     , NVL2(NULL, 1, 2), NVL2('널아님', 1, 2)
  FROM DUAL;
--DECODE 오른쪽 값고 비교. 오른쪽 값과 매치가 되면 3번째 값, 안되면 4번째 값 사용. IF문과 비슷
SELECT DECODE('VAL1', 'VAL2','VAL3','VAL4'),
       DECODE('VAL2', 'VAL2','VAL3','VAL4'),
       DECODE('VAL1', 'VAL2','VAL3','VAL4','VAL5','VAL6'),
       DECODE('VAL2', 'VAL2','VAL3','VAL4','VAL5','VAL6'),
       DECODE('VAL4', 'VAL2','VAL3','VAL4','VAL5','VAL6')
FROM DUAL;

--현재 시스템 날짜 반환
--SYSDATE/STAMP는 단독으로 쓰면 불편하니깐 TO_CHAR로 문자로 변환
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD'),
       TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS'),
       SYSTIMESTAMP, TO_CHAR(SYSTIMESTAMP, 'YYYY-MM-DD'),
       TO_CHAR(SYSTIMESTAMP, 'YYYY-MM-DD HH:MI:SS')
FROM DUAL;

--형변환
SELECT TO_DATE('2021-09-01','YYYY-MM-DD'),
       TO_TIMESTAMP('2021-09-01', 'YYYY-MM-DD')
FROM DUAL;



--EXTRACT 현재 날짜에서 년도,월,일, 시, 분만 분리 
SELECT EXTRACT(YEAR FROM SYSDATE),
       EXTRACT(MONTH FROM SYSDATE),
       EXTRACT(DAY FROM SYSTIMESTAMP),
       EXTRACT(HOUR FROM SYSTIMESTAMP),
       EXTRACT(MINUTE FROM SYSTIMESTAMP),
       EXTRACT(SECOND FROM SYSTIMESTAMP)
FROM DUAL; 

     --21-01부터 이번달까지의 차이 개월수
SELECT MODATE)
FROM DUAL;NTHS_BETWEEN(SYSDATE, TO_DATE('2021-01','YYYY-MM')),
       MONTHS_BETWEEN(TO_DATE('2021-01','YYYY-MM'),SYS

SELECT TO_NUMBER('10'), TO_CHAR(10),
       TO_NUMBER('10.5'),  TO_CHAR('10.5')
FROM DUAL;

--EMPLOYEES 테이블의 내용을 조회 할 때 다음의 조건을 만족하도록 조회하시오.
-- 1.FISRT_NAME 과 LAST_NAME 을 하나로 합쳐서 NAME 이라는 이름으로 조회한다.
-- 2. EMAIL에 @EMPLOYEE.COM 을 붙여서 조회한다. 그리고 소문자로 출력되어야 한다.
-- 3. HIRE.DATE 컬럼은 년-월-일 형식으로 조회하도록 한다.
-- 4. COMMISSION_PCT 에서 NULL 값을 0.0 으로 대체 하도록 한다.
-- 5. PHONE_NUMBER 에서 전화번호에 사용한 구분자를 .이 아닌 - 으로 변경 하여 조회한다.
-- 6. COMMISSON_PCT에 값이 있는 직원에 대해 SALARY * (1 + COMMISSION_PCT) 한 결과를 추가 급여 항목으로 출력하시오.


SELECT EMPLOYEE_ID
   ,CONCAT(FIRST_NAME,'' || LAST_NAME) AS NAME
   ,CONCAT(LOWER(EMAIL), '@employee.com') AS EMAIL
   ,REPLACE(PHONE_NUMBER, '.', '-') AS PHONE_NUMBER
   ,TO_CHAR(HIRE_DATE, 'YY/MON, DAY, DY') AS HIRE_DATE
   ,TRUNC((SYSDATE-HIRE_DATE) /365,0) AS 근속년
   ,JOB_ID
   ,SALARY
   ,SALARY * (1 + NVL(COMMISSION_PCT,0)) AS 추가급여
   ,NVL(COMMISSION_PCT, 0.0) AS COMMISSION_PCT
   ,MANAGER_ID
   DEPARTMENT_ID
FROM EMPLOYEES
where 1=1 and  TRUNC(TRUNC(MONTHS_BETWEEN(SYSDATE, HIRE_DATE)) / 12) > 20;
--조건문으로 작성해도 된다.     
--WHERE HIRE_DATE >= TO_DATE('1989-12-31','YYYY-MM-DD') ;
                         --이 사이에 입사 한 사람만 추출
--HIRE_DATE BETWEEN TO_DATE('1987-01-01','YYYY-MM-DD') AND TO_DATE('1989-12-31', 'YYYY-MM-DD');

/*
1. COMMISSION_PCT가 NULL이 아닌값
2. 커미션을 받지 못하는 직원
3. 관리자가 없는 직원 조회
4. 급여가 10,000이상 받는 직원
5. 사원 번호, 사원명, 직급, 입사일 조회(입사일은 XXXX년 XX월 XX일)
6. 사원 번호, 사원명, 급여, 연봉 조회 (연봉은 급여 * 12)
7. 사원 번호, 사원명, 급여, 연봉 조회 (커미션 있으면 연봉에 커미션 추가)
8. 1분기에 입사한 직원
9. 90년도 이후 입사자
10. 30년 이상 근속 직원 조회
*/

SELECT * FROM EMPLOYEES;

--1
SELECT *
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL;
--2
SELECT EMPLOYEE_ID AS 사원코드,
       CONCAT(FIRST_NAME , '' || LAST_NAME) AS 사원명,
       COMMISSION_PCT AS 인센티브
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL;
--3
SELECT EMPLOYEE_ID AS 사원코드,
       CONCAT(FIRST_NAME , '' || LAST_NAME) AS 사원명,
       MANAGER_ID AS 관리자코드
FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;

--4
SELECT FIRST_NAME || '' || LAST_NAME AS 사원명,
       SALARY AS 급여
FROM EMPLOYEES
WHERE SALARY >= 10000;

-- 500만원 이하로 받는 직원 조회 (환율 적용해서 조회)
SELECT EMPLOYEE_ID AS 사원코드,
       CONCAT(FIRST_NAME , ' ' || LAST_NAME) AS 사원명,
       (SALARY * 1156 ) AS 급여  -- 환율 적용 확인 위해 연산식 넣어 줌
FROM EMPLOYEES
WHERE SALARY * 1156 <=5000000;

--5 년월일 형식으로 출력하는 다양한 방식들 
SELECT EMPLOYEE_ID AS 사원번호,
       CONCAT(FIRST_NAME, '' || LAST_NAME) AS 사원명,
       JOB_ID AS 직급,
       TO_CHAR(HIRE_DATE, 'YYYY"년" YY"월" DD"일"') AS 입사일,
       TO_CHAR(HIRE_DATE, 'YYYY') || '년' ||
       TO_CHAR(HIRE_DATE, 'MM') || '월' ||
       TO_CHAR(HIRE_DATE, 'DD') || '일' AS 입사일1,
       TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD"일"') AS 입사일2,
       EXTRACT(YEAR FROM HIRE_DATE) ||'년'||
       EXTRACT(MONTH FROM HIRE_DATE) ||'월' ||
       EXTRACT(DAY FROM HIRE_DATE) ||'일' AS 입사일3
FROM EMPLOYEES;

SELECT TO_CHAR(TO_DATE('20-10-13', 'yyyy-mm-dd'),'yyyymmdd')
FROM DUAL;

--6
SELECT EMPLOYEE_ID AS 사원번호,
       CONCAT(FIRST_NAME, '' || LAST_NAME) AS 사원명,
       TO_CHAR(SALARY , '999,999,999') AS 급여,
       TO_CHAR((SALARY * 12), '999,999,999') AS 연봉
       -- SALARY, '000,000,000' <- 단위 포멧 지정해주는것 '000,000' 이렇게 해도 되는데 일부러 넉넉하게 '000,000,000' 해 준것
FROM EMPLOYEES;

--7
SELECT EMPLOYEE_ID AS 사원번호,
       CONCAT(FIRST_NAME, '' || LAST_NAME ) AS 사원명,
       TO_CHAR(SALARY, '999,999,999') AS 급여,
       COMMISSION_PCT AS 인센티브,
       TO_CHAR((SALARY * 12) , '999,999,999') AS 연봉,
       TO_CHAR((SALARY * (1 + NVL(COMMISSION_PCT,0))*12), '999,999,999') AS 인센티브 포함 연봉
FROM EMPLOYEES;

--8 1분기 입사자 
SELECT EMPLOYEE_ID AS 사원코드,
       CONCAT(FIRST_NAME, '' || LAST_NAME) AS 사원명,
       TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD"일"' ) AS 입사일
FROM EMPLOYEES
WHERE EXTRACT(MONTH FROM HIRE_DATE) <= 3;

--8 1분기 입사자 
SELECT EMPLOYEE_ID AS 사원코드,
       CONCAT(FIRST_NAME, '' || LAST_NAME) AS 사원명,
       TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD"일"' ) AS 입사일
FROM EMPLOYEES
WHERE TO_CHAR(HIRE_DATE, 'MM') <=3;


--9
SELECT EMPLOYEE_ID AS 사원번호,
       CONCAT(FIRST_NAME, '' || LAST_NAME ) AS 사원명,
       TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD "일" ') AS 입사일
FROM EMPLOYEES
--WHERE HIRE_DATE >= TO_DATE(19900101,'YYYY-MM-DD');
WHERE EXTRACT(YEAR FROM HIRE_DATE) >= 1990;

--10
SELECT EMPLOYEE_ID AS 사원번호,
       CONCAT(FIRST_NAME, '' || LAST_NAME) AS 사원명,
       TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD "일"') AS 입사일
FROM EMPLOYEES
WHERE MONTHS_BETWEEN(SYSDATE, HIRE_DATE) / 12 >= 30 ;

SELECT TO_DATE('900101', 'YYMMDD') FROM DUAL;

SELECT EMPLOYEE_ID AS 사원코드,
       CONCAT(FIRST_NAME ,'' || LAST_NAME) AS 사원명,
       TO_CHAR(HIRE_DATE, 'YYYY "년" MM"월" DD"일"') AS 입사일,
       HIRE_DATE,
       TO_CHAR('900101', 'YYMMDD'), --90년대 2000년대의 90년도
       TO_CHAR('900101','rrmmdd'), --00~49년 2000년대, 50~99년 19000년대
       TO_CHAR(TO_DATE('900101','YYMMDD'), 'YYYYMMDD'),
       TO_CHAR(TO_DATE('900101', 'RRMMDD'),'YYYYMMDD')
FROM EMPLOYEES
WHERE HIRE_DATE >= TO_DATE('9000101', 'YYMMDD');       


--emp 테이블을 사용하여 사원 중에서 급여(sal)와 보너스(comm)를 합친 금액이 가장 많은 경우와 가장 적은 경우, 평균 금액을 구하세요. 단, 보너스가 없을 경우는 보너스를 0으로 계산하고 출력 금액은 모두 소수점 첫째 자리까지만 나오게 하세요.
SELECT EMPLOYEE_ID AS 사원코드,
       SALARY AS 급여,
       COMMISSION_PCT AS 인센티브,
       NVL(COMMISSION_PCT,0),
       MAX(SALARY + COMMISSION_PCT) AS 실적왕,
       MIN(SALARY + COMMISSION_PCT) AS 노력파,
       AVG(SALARY + COMMISSION_PCT) AS 평균
FROM EMPLOYEES
GROUP BY EMPLOYEE_ID, SALARY, COMMISSION_PCT
ORDER BY 사원코드,급여,실적왕,노력파,평균 ASC;

--부서 코드와 급여 30000이상인 직원의 그룹별 평균 조회
SELECT DEPARTMENT_ID AS 부서코드,
       FLOOR(AVG(SALARY * 1156 )) AS 급여
FROM EMPLOYEES
WHERE SALARY * 1156 >= 3000000
GROUP BY DEPARTMENT_ID;



SELECT TO_CHAR(TO_DATE('20/10/13','YY/MM/DD'), 'YYYY-MM-DD')
FROM DUAL;
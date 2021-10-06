-- ORDER BY 절 : 조회 결과에 대해 정렬을 하기 위해 사용
-- 오름차순(ASC), 내림차순(DESC) 정렬을 할 수 있으며, 기본은 오름차순이다.
-- 여러 컬럼에 대해 정렬을 할 수 있다.
-- SELECT 절, FROM절, WHERE 절 들 보다 가장 마지막에 동작 
-- FROM -> WHERE -> SELECT ->ORDER BY 순으로 동작이 된다.
-- FROM 테이블에서 WHERE 어디(조건) 을 실행해야는지 보고 SELECT 안에 작성 된 컬럼만 실행이 되고 그 다음 ORDER BY로 실행

SELECT * FROM TB_STUDENT;

--학과 이름으로 오름내림차순
SELECT *
FROM TB_STUDENT
ORDER BY DEPARTMENT_NO;
-- 기본형이니깐 오름차순

SELECT *
FROM TB_STUDENT
ORDER BY DEPARTMENT_NO DESC;
--DESC를 붙여서 내림차순으로 만들어 준다.

--학과코드&이름으로 
SELECT * 
FROM TB_STUDENT
ORDER BY DEPARTMENT_NO, STUDENT_NAME;

--학과코드는 내림차순, 학생이름은 오름차순으로 정렬
SELECT * 
FROM TB_STUDENT
ORDER BY DEPARTMENT_NO DESC, STUDENT_NAME;

SELECT * 
FROM TB_STUDENT
ORDER BY 2;

SELECT * 
FROM TB_STUDENT
ORDER BY 2,3 DESC; 

--지정 해 준 별칭으로도 ORDER BY 가능
SELECT DEPARTMENT_NO AS 학과번호,
       STUDENT_NAME AS 학생명, 
       STUDENT_ADDRESS AS 학생주소
FROM TB_STUDENT
ORDER BY 학과번호;


--NULL 데이터가 있으면 NULL 먼저 출력하게 OEDER BY
SELECT *
FROM TB_STUDENT 
ORDER BY DEPARTMENT_NO, COACH_PROFESSOR_NO NULLS FIRST;

--NULL 데이터가 있으면 NULL 마지막에 출력하게 OEDER BY
SELECT *
FROM TB_STUDENT 
ORDER BY DEPARTMENT_NO, COACH_PROFESSOR_NO NULLS LAST;

--주민번호로 정렬 
SELECT *
FROM TB_STUDENT               --첫번째자리부터 6번째자리까지 자른다는 뜻.
ORDER BY TO_DATE(SUBSTR(STUDENT_SSN, 1,6), 'RRMMDD');

SELECT * FROM 

SELECT * FROM USER_COL_COMMENTS WHERE TABLE_NAME = 'TB_STUDENT';

-- GROUP BY 절 : 동일한 컬럼 값을 가지느 ㄴ행 데이터에 대해 그룹화를 시켜서 집계하수를 사용한
-- 정보를 조회하기 위해 사용
-- SELECT 절에 명시한 컬럼에 대해 그룹화를 시킨다.
-- 집계 함수 : COUNT(), MAX(), MIN(), SUM(), AVG(), ...

--학과별 인원으로 COUNT 해서 그룹으로 묶고 OEDER BY로 오름내림차순
SELECT DEPARTMENT_NO,
       COUNT(DEPARTMENT_NO) AS 학과별인원  -- 묶인 그룹에 대한 COUNT
FROM TB_STUDENT
GROUP BY DEPARTMENT_NO
ORDER BY 학과별인원;

SELECT DEPARTMENT_NO,
       COUNT(*) AS 학과별인원,-- 컬럼명을 *로 대체 할 수 있다. 위에 코드랑 비교해서 보자
       ABSENCE_YN AS 휴학유무
FROM TB_STUDENT
GROUP BY DEPARTMENT_NO, ABSENCE_YN
ORDER BY 학과별인원;  -- 학과별인원을 기준으로 정렬

SELECT * FROM TB_GRADE;
SELECT * FROM USER_COL_COMMENTS WHERE TABLE_NAME = 'TB_GRADE'; 

-- 학기별, 학생별 학점 총점
-- GROUP BY는 별칭으로 적으면 안된다.
SELECT STUDENT_NO AS 학생번호,
       SUM(POINT) AS 총점
FROM TB_GRADE
GROUP BY STUDENT_NO
ORDER BY 학생번호;

--학기별 평균 점수
SELECT TERM_NO AS 학기번호,
       AVG(POINT) AS 평균
FROM TB_GRADE
GROUP BY TERM_NO
ORDER BY 학기번호;

--학기별 최고 점수
SELECT TERM_NO AS 학기번호,
       MAX(POINT) AS 최고점수
FROM TB_GRADE
GROUP BY TERM_NO
ORDER BY 학기번호;

--년도별 최고 점수
SELECT SUBSTR(TERM_NO, 1, 4) AS  년도별,
       MAX(POINT) AS 최고점수,
       MIN(POINT) AS 최저점수
FROM TB_GRADE
GROUP BY SUBSTR(TERM_NO, 1,4)
ORDER BY 년도별;

-- EMPLOYEES 테이블에서 JOB_ID 별 인원 수를 파악하는 쿼리문을 만드시오.
SELECT JOB_ID AS 직무코드,
       COUNT(*)
FROM EMPLOYEES
GROUP BY JOB_ID
ORDER BY 직무코드;

-- EMPLOYEES 테이블에서 DEPARTMNET_ID 별 인원 수를 파악하는 쿼리문을 만드시오.
SELECT DEPARTMENT_ID AS 부서코드,
       COUNT(*) 
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY 부서코드;

-- EMPLOYEES 테이블에서 DEPARTMENT_ID 별 SALARY가 가장 높은 쿼리문을 만드시오.
SELECT DEPARTMENT_ID AS 부서코드,
       MAX(FIRST_NAME) KEEP(DENSE_RANK FIRST ORDER BY SALARY DESC) AS FIRST_NAME,
       --    A         KEEP                          B
       --    B 컬름을 기준으로 정렬 후 A컬럼의 값을 추출하여 SELECT 절에 사용
       --    ORDER  BY 기준으로 정렬     FIRST 라고 지정 해 주면 정렬 했을때 기준의 가장 첫번째 값을 추출 
       --                                LAST라고 주면 정렬 했을 때 가장 마지막 값을 추출 
       --    DENSE RANK : 조회 컬럼에 대한 랭키을 부여하는 기능
       MAX(SALARY) AS 급여
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID
ORDER BY 부서코드;

SELECT * FROM EMPLOYEES;
SELECT * FROM USER_COL_COMMENTS WHERE TABLE_NAME = 'EMPLOYEES';

-- 부서별 평균 급여가 가장 높은 부서와 낮은 부서
WITH TEMP AS (  -- 임시 테이블을 만들어서 다음 쿼리에 사용하기 위해 쓰인다.
SELECT DEPARTMENT_ID AS 부서번호,
       TRUNC(AVG(SALARY)) AS 평균급여
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY DEPARTMENT_ID
)

SELECT MIN(평균급여) AS 최저급여,
       MIN(부서번호) KEEP(DENSE_RANK FIRST ORDER BY 평균급여) AS 부서번호
FROM TEMP;


WITH TEMP AS (  -- 임시 테이블을 만들어서 다음 쿼리에 사용하기 위해 쓰인다.
SELECT DEPARTMENT_ID AS 부서번호,
       TRUNC(AVG(SALARY)) AS 평균급여
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY DEPARTMENT_ID
)
SELECT MAX(평균급여) AS 최고급여,
       MAX(부서번호) KEEP(DENSE_RANK FIRST ORDER BY 평균급여 DESC) AS 부서번호
FROM TEMP;




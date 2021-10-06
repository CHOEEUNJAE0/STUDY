-- 반드시 chap02/sample1.sql의 테이블을 생성 후 진행
INSERT INTO subject_t VALUES(1, '홍길동','박수현');
--일부 컬럼에 대한 데이터 추가 시, 컬럼 명 명시 후 값 작성
INSERT INTO subject_t (s_id, s_name) VALUES(2,'김조한');
INSERT INTO subject_t(s_id, s_name) VALUES (3,'박지한');
INSERT INTO subject_t(s_id, s_name) VALUES (4,'최성준');
INSERT INTO subject_t(s_id, s_name) VALUES (5,'이아란');
--이미 작성 한 값 수정 하기
--근데 이렇게 하면 모든 데이터가 다 수정이 되어 버림
--WHERE 절을 이용하여 식별을 해 줘야한다.
--UPDATE 하기 전에는 수정 하고자 하는 데이터가 확실한지 먼저 검사 해보고 수행
SELECT * FROM subject_t WHERE s_id = 1;
UPDATE subject_t SET s_name = '국어' WHERE s_id = 1;
UPDATE subject_t SET s_name = '영어', s_teacher = '김조한' WHERE s_id = 2;
UPDATE subject_t SET s_name = '수학', s_teacher = '박지한' WHERE s_id = 3;
UPDATE subject_t SET s_name = '과학', s_teacher = '최성준' WHERE s_id = 4;
UPDATE subject_t SET s_name = '사회', s_teacher = '이아란' WHERE s_id = 5;
--삭제 DELETE 도 마찬가지로 WHERE로 꼭 식별하기
DELETE FROM subject_t WHERE s_id =3;

--데이터 추가/삭제 확인
SELECT * FROM subject_t;

INSERT INTO student_t VALUES(1, '홍길동', 1, 'M', '박수현');
INSERT INTO student_t VALUES(2, '김장현', 1, 'M', '박수현');
INSERT INTO student_t VALUES(3, '박지연', 1, 'F', '박수현');

INSERT INTO student_t VALUES(4, '고주성', 2, 'M', '최성준');
INSERT INTO student_t VALUES(5, '최창훈', 2, 'M', '최성준');
INSERT INTO student_t VALUES(6, '하라연', 2, 'F', '최성준');

INSERT INTO student_t VALUES(7,'김연우', 3, 'M', '이아란');
INSERT INTO student_t VALUES(8, '박지안', 3, 'F', '이아란');
INSERT INTO student_t VALUES(9, '이가은', 3, 'F', '이아란');

SELECT  * FROM student_t;
SELECT DISTINCT * FROM student_t;


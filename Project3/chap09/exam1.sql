/*
    1. 가계부 작성을 위한 테이블 생성
        테이블 명 : ACCOUNTS
        컬럼명   데이터타입      제약조건       비고
            ID   NUMBER          Primary Key    Sequence를 사용하여 1씩 자동증가 되도록 한다.
        AMOUNT   NUMBER          NOT NULL       DEFAULT 를 사용하여 기본값으로 0 이 사용되게 한다.
      ACC_TYPE   CHAR(1)         CHECK          I 는 입금, O 는 출금 내역으로 구분한다.
      ACC_DATE   DATE            NOT NULL       입출금 날짜를 기록하기 위한 컬럼이다.
       HISTORY   CHAR(3)         Foreign Key    입출금 내역을 위한 컬럼으로 HISTORYS 테이블을 참조한다.
        테이블 명 : HISTORYS
        컬럼명   데이터타입      제약조건        비고
            ID   CHAR(3)         Primary Key     문자와 숫자의 조합으로 만들어진 입출금 코드를 사용한다.
        H_TYPE   VARCHAR2(150)   NOT NULL        입출금 내역을 한글 기준 50자 내로 작성
    2. 1번에서 만든 테이블의 기본 데이터를 추가한다.
        - HISTORYS 테이블에는 다음의 데이터를 추가한다.
            ID:A01,     H_TYPE:급여   | ID:A02,     H_TYPE:불로소득
            ID:A03,     H_TYPE:통신비 | ID:A04,     H_TYPE:교통비
            ID:A05,     H_TYPE:주유비 | ID:A06,     H_TYPE:식비
            ID:A07,     H_TYPE:여가비 | ID:A08,     H_TYPE:의류구입
        - ACCOUNTS 테이블에는 다음의 데이터를 추가한다.
            2021년 01월 05일에 급여 3,000,000 원이 들어왔다.
            2021년 01월 16일에 여가비로 150,000 원을 사용하였다.
            2021년 01월 25일에 통신비로 125,000 원 지출되었다.
            2021년 01월 25일에 교통비로 85,200 원이 지출되었다.
            2021년 01월 한달간 매 주일(5일) 식비로 6,500원이 지출되었다.
    3. 1월 1달간 지출내역을 조회하시오.(항목별 지출내역과 총합계가 같이 조회되도록 한다.)
    4. 1월 1달간의 입/출금 내역을 다음과 같이 나오도록 조회하시오.
        내역        입금액      출금액
        급여        3,000,000
        통신비                  125,000
        교통바                  85,200
        여가비                  150,000
        ...
        총합        3,000,000   xxx,xxx
        */
CREATE TABLE ACCOUNTS (
       ID NUMBER
      ,AMOUNT NUMBER
      ,ACC_TYPE CHAR(1) DEFAULT('0')
      ,ACC_DATE DATE
      ,HISTORY CHAR(3)
);
ALTER TABLE ACCOUNTS ADD CONSTRAINT ACCOUNTS_ID_PK PRIMARY KEY(ID);
ALTER TABLE ACCOUNTS MODIFY AMOUNT CONSTRAINT ACCOUNTS_AMOUNT_NN NOT NULL;
ALTER TABLE ACCOUNTS MODIFY ACC_DATE CONSTRAINT ACCOUNTS_ACC_DATE_NN NOT NULL;
ALTER TABLE ACCOUNTS ADD CONSTRAINT ACC_TYPE_CK CHECK(ACC_TYPE IN ('I', '0'));
--INSERT INTO ACC_TYPE VALUES(1,'입금', 0,'출금');
--ALTER TABLE ACCOUNTS ADD CONSTRAINT FK_HISTORY FOREIGN KEY(HISTORY) REFERENCES HISTORYS(H_TYPE);
--INSERT INTO ACCOUNTS_VALUES(ACCOUNTS_SEQ.NEXTVAL,)
INSERT INTO ACCOUNTS (ACC_DATE,ACC_TYPE) VALUES(SYSDATE,'급여');


DROP TABLE ACCOUNTS;
DROP TABLE HISTORYS;

CREATE TABLE HISTORYS (
            ID CHAR(3)
          ,H_TYPE VARCHAR(150)
);
ALTER TABLE HISTORYS ADD CONSTRAINT HISTORYS_ID_PK PRIMARY KEY(ID);
ALTER TABLE HISTORYS MODIFY H_TYPE CONSTRAINT HISTORYS_H_TYPE_NN NOT NULL;

INSERT INTO HISTORYS VALUES('A01', '급여');
INSERT INTO HISTORYS VALUES('A02', '불로소득');
INSERT INTO HISTORYS VALUES('A03', '통신비');
INSERT INTO HISTORYS VALUES('A04', '교통비');
INSERT INTO HISTORYS VALUES('A05', '주유비');
INSERT INTO HISTORYS VALUES('A06', '식비');
INSERT INTO HISTORYS VALUES('A07', '여가비');
INSERT INTO HISTORYS VALUES('A08', '의류구입');

SELECT * FROM HISTORYS;
-- 사용자 계정 생성 (system 계정이기때문에 계정을 생성)
CREATE USER haiteam
IDENTIFIED BY haiteam;
-- 사용자 권한 부여
GRANT CONNECT, RESOURCE, DBA TO haiteam;

-- 테이블 전체목록 조회 (oracle에서만 작동)
SELECT * FROM TABS;

-- 관리자는 다 볼수 있음
SELECT * FROM haiteam;
-- 내가 원하는 테이블 조회
SELECT * FROM DBA_USERS;

-- DEFAULT TABLESPACE {테이블스페이스명}
--TEMPORARY TABLESPACE {TEMP 테이블스페이스명}

-- REGIONID
-- PRODUCT
-- YEARWEEK
-- QTY

CREATE TABLE KOPO_PRODUCT_VOLUME
(   -- 컬럼명, 컬럼타입,
    REGIONID VARCHAR2(100), -- 지역정보
    PRODUCT VARCHAR2(100),  -- 상품정보
    YEARWEEK VARCHAR2(100), -- 연주차 정보
    QTY NUMBER              -- 판매량
)

SELECT * FROM KOPO_PRODUCT_VOLUME
WHERE QTY >= 1000000
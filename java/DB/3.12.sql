-- ����� ���� ���� (system �����̱⶧���� ������ ����)
CREATE USER haiteam
IDENTIFIED BY haiteam;
-- ����� ���� �ο�
GRANT CONNECT, RESOURCE, DBA TO haiteam;

-- ���̺� ��ü��� ��ȸ (oracle������ �۵�)
SELECT * FROM TABS;

-- �����ڴ� �� ���� ����
SELECT * FROM haiteam;
-- ���� ���ϴ� ���̺� ��ȸ
SELECT * FROM DBA_USERS;

-- DEFAULT TABLESPACE {���̺����̽���}
--TEMPORARY TABLESPACE {TEMP ���̺����̽���}

-- REGIONID
-- PRODUCT
-- YEARWEEK
-- QTY

CREATE TABLE KOPO_PRODUCT_VOLUME
(   -- �÷���, �÷�Ÿ��,
    REGIONID VARCHAR2(100), -- ��������
    PRODUCT VARCHAR2(100),  -- ��ǰ����
    YEARWEEK VARCHAR2(100), -- ������ ����
    QTY NUMBER              -- �Ǹŷ�
)

SELECT * FROM KOPO_PRODUCT_VOLUME
WHERE QTY >= 1000000
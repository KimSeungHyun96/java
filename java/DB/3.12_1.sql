CREATE TABLE KOPO_PRODUCT_VOLUME (
    REGIONID VARCHAR2(100), -- ��������
    PRODUCT VARCHAR2(100),  -- ��ǰ����
    YEARWEEK VARCHAR2(100), -- ������ ����
    QTY NUMBER              -- �Ǹŷ�
);

ALTER TABLE KOPO_PRODUCT_VOLUME
RENAME COLUMN PRODUCT TO PRODUCTGROUP;

SELECT * FROM KOPO_PRODUCT_VOLUME
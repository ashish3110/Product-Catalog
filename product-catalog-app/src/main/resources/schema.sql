CREATE TABLE PRODUCT (
 ID BIGINT(45) NOT NULL AUTO_INCREMENT,
 NAME varchar(255) NOT NULL,
 DESCRIPTION varchar(255) DEFAULT NULL,
 TYPE varchar(63) NOT NULL,
 BRAND varchar(63) NOT NULL,
 COLOR varchar(63) NOT NULL,
 SIZE_NUMBER integer DEFAULT NULL,
 SIZE  varchar(10) DEFAULT NULL,
 SELLER varchar(255) NOT NULL,
 QTY int(45) NOT NULL,
 PRICE DOUBLE NOT NULL,
 CREATED_DATE TIMESTAMP,
 UPDATED_DATE TIMESTAMP,
 PRIMARY KEY (ID),
 UNIQUE KEY (TYPE, BRAND, COLOR, SELLER, SIZE, SIZE_NUMBER)
);

CREATE INDEX product_brand ON PRODUCT(BRAND);
CREATE INDEX product_color ON PRODUCT(COLOR);
CREATE INDEX product_seller ON PRODUCT(SELLER);
CREATE INDEX product_size ON PRODUCT(SIZE);
CREATE INDEX product_size_number ON PRODUCT(SIZE_NUMBER);

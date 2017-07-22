DROP TABLE PRODUCTS IF EXISTS;

CREATE TABLE PRODUCTS (
  ID VARCHAR(25) PRIMARY KEY,
  NAME VARCHAR(50),
  DESCRIPTION  VARCHAR(250),
  UNIT_PRICE DECIMAL,
  MANUFACTURER VARCHAR(50),
  CATEGORY VARCHAR(50),
  CONDITION VARCHAR(50),
  UNITS_IN_STOCK BIGINT,
  UNITS_IN_ORDER BIGINT,
  DISCONTINUED BOOLEAN
);



DROP TABLE CART IF EXISTS;



CREATE TABLE CART (
   ID VARCHAR(50) PRIMARY KEY
);

      
DROP TABLE CART_ITEM IF EXISTS;

CREATE TABLE CART_ITEM (
   ID VARCHAR(75),
   PRODUCT_ID VARCHAR(25) FOREIGN KEY REFERENCES PRODUCTS(ID), 
   CART_ID varchar(50) FOREIGN KEY REFERENCES CART(ID),
   QUANTITY BIGINT,
   CONSTRAINT CART_ITEM_PK PRIMARY KEY (ID,CART_ID) 
);

DROP TABLE ADDRESS IF EXISTS;
CREATE TABLE ADDRESS (
   ID INTEGER IDENTITY PRIMARY KEY,
   DOOR_NO VARCHAR(25),
   STREET_NAME VARCHAR(25),
   AREA_NAME VARCHAR(25),
   STATE VARCHAR(25),
   COUNTRY VARCHAR(25),
   ZIP VARCHAR(25),
);

DROP TABLE CUSTOMER IF EXISTS;

CREATE TABLE CUSTOMER (
   ID INTEGER IDENTITY PRIMARY KEY,
   NAME VARCHAR(25),
   PHONE_NUMBER VARCHAR(25),
   BILLING_ADDRESS_ID INTEGER FOREIGN KEY REFERENCES ADDRESS(ID),
);

DROP TABLE SHIPPING_DETAIL IF EXISTS;

CREATE TABLE SHIPPING_DETAIL (
   ID INTEGER IDENTITY PRIMARY KEY,
   NAME VARCHAR(25),
   SHIPPING_DATE VARCHAR(25),
   SHIPPING_ADDRESS_ID INTEGER FOREIGN KEY REFERENCES ADDRESS(ID),
);

DROP TABLE ORDERS IF EXISTS;

CREATE TABLE ORDERS (
   ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1000, INCREMENT BY 1) PRIMARY KEY,
   CART_ID VARCHAR(50) FOREIGN KEY REFERENCES CART(ID),
   CUSTOMER_ID INTEGER FOREIGN KEY REFERENCES CUSTOMER(ID),
   SHIPPING_DETAIL_ID INTEGER FOREIGN KEY REFERENCES SHIPPING_DETAIL(ID),
);








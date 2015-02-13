
-- 회원, 직원 관리 통합

CREATE TABLE Member(
	uid varchar2(50) PRIMARY KEY,
	name varchar2(30) NOT NULL,
	pwd varchar2(50) NOT NULL,
	admin char(1) DEFAULT 0, -- 1 관리자 0 사용자 , default 0 
	phone varchar2(13),
	zipcode varchar2(80),
	address varchar2(80),
	address_detail varchar2(80),
	reg_date date DEFAULT SYSDATE
);

-- 우편번호

CREATE TABLE Zipcode(
	seq       number(5,0) PRIMARY KEY,
	zipcode  varchar2(7) NOT NULL,
	sido       varchar2(6) NOT NULL,
	gugun    varchar2(30) NOT NULL,
	dong      varchar2(50) NOT NULL,
	ri           varchar2(80),
	bunji      varchar2(20)
);
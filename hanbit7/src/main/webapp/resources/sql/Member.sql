
-- 회원, 직원 관리 통합

CREATE TABLE Member(
	mem_no number(12) ,
	name varchar2(30) NOT NULL,
	pwd varchar2(50) NOT NULL,
	admin char(1) DEFAULT 0, -- 1 관리자 0 사용자 , default 0 
	phone varchar2(13),
	email varchar2(30) unique,
	zipcd varchar2(80),
	addr varchar2(80),
	addr_detail varchar2(80),
	reg_date date DEFAULT SYSDATE);

	create sequence mem_seq start with 1000 increment by 1;
	
	
-- 우편번호

CREATE TABLE Zipcode(
	
	zipcode  varchar2(7) NOT NULL,
	sido       varchar2(6) NOT NULL,
	gugun    varchar2(30) NOT NULL,
	dong      varchar2(50) NOT NULL,
	ri           varchar2(80),
	bunji      varchar2(20)
);
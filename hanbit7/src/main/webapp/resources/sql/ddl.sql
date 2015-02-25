drop table contact;
drop table member;
drop table boardgroup;
drop table category;
drop table board;
drop table reply;
drop table review;
drop table picboard;
drop table qna;
drop table guest;
drop table item;
drop table stock;
drop table attach;

drop sequence mem_seq;
drop sequence item_seq;
drop sequence arti_seq;
drop sequence file_seq;

-- Member ---< Vendor , Emp, Cust
CREATE TABLE Memberinfo( -- 회원정보 
	mem_id varchar2(50) primary key,
	name varchar2(30) not null,
	passwd varchar2(50) not null,
	reg_dt date ,
	gender varchar2(4) constraint mem_gen_ck check(gender='남자' or gender='여자'),
	phone varchar2(15),
	email varchar2(30) unique,
	post varchar2(10),	
	country varchar2(20) default '한국',
	state varchar2(15), -- 특별광역시, 도
	city varchar2(15), -- 시, 구, 군
	doro varchar2(30), -- 도로명
	jibun varchar2(30), -- 지번
	bld varchar2(30) -- 빌딩,APT 
);
create table dept(
	dep_cd number(12) primary key,
	dep_nm varchar2(20)
);
create table Vendor(
	mem_id varchar2(20),
	itm_cd number(12),
	constraint ven_pk primary key (mem_id, itm_cd)
);
create table Employee(
	mem_id varchar2(20) primary key,
	dep_cd number(12),
	rank varchar2(10)  -- 직급
	
);
create table Customer(
	mem_id varchar2(20) primary key, -- mem_seq
);

create table Supply(
	
);
create table Attach( -- 첨부파일
     file_no number(12) primary key, -- file_seq
     arti_no number(12),
     file_name varchar(30),
     tmp_file varchar(5)
);
CREATE TABLE Boardgroup( -- 게시판 그룹
	brdgrp_no number(12) primary key,  -- arti_seq
	brdgrp_name varchar2(50) 
);
CREATE TABLE Category( -- 아이템 카테고리
     cate_no number(12) primary key, -- item_seq
     cate_name varchar2(20)
);
CREATE TABLE Board( -- 댓글 게시판
	brd_no number(12) primary key, -- arti_seq
	ttl varchar2(100),
	passwd varchar2(20),
	content varchar2(200),
	hit number(12) default '0',
	reg_lvl number(3),
	reg_step number(3),
	reg_dt date ,
	brdgrp_no number(12) constraint brd_grp_fk 
		references Boardgroup(brdgrp_no) 
		on delete cascade,
    mem_no number(12) constraint brd_mem_fk
		references Member(mem_no)
		on delete cascade,
	file_no number(12) constraint brd_file_fk
		references Attach(file_no)
		on delete set null
);
CREATE TABLE Review ( 
	revw_no number(12) primary key, -- arti_seq
	ttl varchar2(50),
	content varchar2(500),
	hit number(10) default 0,
	reg_dt date ,
	mem_no number(12) constraint revw_mem_fk 
		references Member(mem_no)
		on delete cascade
);
CREATE TABLE Guest( -- 무기명 글 첨삭 가능
     gs_no number(4) primary key, -- arti_seq
     nickname varchar2(30) not null,
     ttl varchar2(30) not null,
     reg_dt date ,
     hit number(3) default '0'
); 
    


CREATE TABLE Picboard( -- 사진 게시판
	pic_no number(12) primary key, -- arti_seq
	ttl varchar2(100) default '제목이 없습니다.',
	content varchar2(1000),
	hit number(12) default '0',
	reg_dt date ,
	mem_no number(12) constraint pic_mem_fk 
		references Member(mem_no)
		on delete cascade,
	file_no number(12) constraint pic_file_fk
		references Attach(file_no)
		on delete set null
);
CREATE TABLE Qna(
	qna_no number(12) primary key, -- arti_seq
	ttl varchar2(50),
	content varchar2(500),
	hit number(12),
	reg_dt Date,
	mem_no number(12) constraint qna_mem_fk
		references Member(mem_no)
		on delete cascade
);
CREATE TABLE Reply(
	 reply_no number(12) primary key, -- arti_seq
     content varchar2(500),
     reg_dt date ,
     passwd varchar2(20),
     mem_no number(12) constraint reply_mem_fk 
		references Member(mem_no) 
		on delete cascade,
	guest_no number(12) constraint reply_guest_fk
		references Guest(gs_no)
		on delete cascade,
	brd_no number(12) constraint reply_brd_fk
		references Board(brd_no)
		on delete cascade,
	qna_no number(12) constraint reply_qna_fk
		references Qna(qna_no)
		on delete cascade,
	pic_no number(12) constraint reply_pic_fk
		references Picboard(pic_no)
		on delete cascade
);

CREATE TABLE Item( 
	itm_no number(12) primary key, -- item_seq
	itm_nm varchar2(50) not null,
	price number(12) default '0',
	prod_dt varchar2(20) DEFAULT '없음', -- 생산년도
	dsc varchar2(300) DEFAULT '없음',
	cate_no number(12) constraint item_cate_fk
		references Category(cate_no)
		on delete set null,
	rep_img varchar2(200),
	big_img varchar2(200),
	reg_dt date default sysdate
);
create table Product(
	itm_no number(12) primary key,
	
);
-- 재고관리 테이블

CREATE TABLE Stock( 
	 stock_no number(12) primary key,  -- item_seq 
     reg_dt date ,
     put number(12), -- 입고량
     out number(12), -- 출고량
     base number(12), -- 기본수량    
     itm_no number(12) constraint stk_itm_fk
	     references Item(itm_no)
	     on delete cascade
);








create table Order(
	ord_no number(12) primary key,
	ord_dt varchar2(20),
);
create table OrderItem(
	oitm_no number(12) primary key,
	ord_no number(12) constraint oitm_ord_fk 
		references Order(ord_no)
		on delete cascade
	prd_no number(12) constraint oitm_prd_fk
		references Product(prd_no)
		on delete cascade
);

create sequence mem_seq start with 1000 increment by 1;
create sequence arti_seq start with 1000 increment by 1;
create sequence file_seq start with 1000 increment by 1;
create sequence item_seq start with 1000 increment by 1;

	
	
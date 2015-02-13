
-- 게시판

CREATE TABLE Board(
	brd_no number(12) PRIMARY KEY,
	title varchar2(80),
	ctnt varchar2(200),
	read_cnt number(3),
	reg_no number(3),
	reg_lvl number(3),
	reg_step number(3),
	req_ip varchar2(20),
	reg_dt date,
	img_no number(12)
	    CONSTRAINT board_img_fk
	    REFERENCES Image(img_no)
	    ON DELETE SET NULL,
	brdgrp_no number(12)
	     CONSTRAINT board_grp_fk
	     REFERENCES Boardgrp(boardgrp_no)
	     ON DELETE SET NULL,
	email varchar2(50)
	     CONSTRAINT board_email_fk 
	     REFERENCES Member(email)
	     ON DELETE SET NULL
);
CREATE SEQUENCE brd_seq START WITH 1000 INCREMENT BY 1;
CREATE TABLE MEMBER(
	ID NUMBER
);
CREATE SEQUENCE MEMZ_SEQ START WITH 1000 INCREMENT BY 1;

CREATE TABLE Qna(
	qna_no number(12),
	subj varchar2(50),
	ctnt varchar2(500),
	file_nm varchar2(50),
	read_hit number(12),
	reg_dt Date,
	mem_no number(12)
	constraint qna_mem_fk
	references Member(mem_no)
	on delete cascade);



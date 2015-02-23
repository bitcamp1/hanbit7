CREATE TABLE Pic(
	pic_no number(12) primary key,
	subj varchar2(100),
	ctnt varchar2(1000),
	file_org varchar2(100),
	read_hit number(12),
	reg_dt Date,
	mem_no number(12)
		constraint pic_mem_fk 
		references member(mem_no)
		on delete cascade);
	
	
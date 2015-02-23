CREATE TABLE Free (
	free_no number(8) primary key,
	subj varchar2(50),
	ctnt varchar2(500),
	file_no number(12),
	file_org varchar2(50),
	read_hit number(10),
	reg_dt Date,
	mem_no number(12) 
		constraint mem_no_fk 
		references Member(mem_no)
		on delete cascade);

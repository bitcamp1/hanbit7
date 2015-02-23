CREATE TABLE Reply(
	 reply_no number(12) not null,
     reply_ctnt varchar2(500),
     reg_date date,
     r_pass varchar2(20),
     guest_no number(12),   
	constraint guest_fk 
	foreign key (guest_no)
	references Guest(guest_no) 
	on delete cascade
);


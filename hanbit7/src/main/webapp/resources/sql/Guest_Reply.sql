drop table  guest_reply ;
create table guest_reply(
     r_seq int not null,
     r_writer varchar2(20),
     r_contents varchar2(50),
     r_sdate date,
     r_pass varchar2(20),
     ref int,   // ref필드가  guest테이블의  num필드값 참조
constraint guest_fk 
foreign key (ref)
references guest(num) 
on delete cascade
);


drop  sequence  reply_seq;
create  sequence  reply_seq;

alter table guest_reply drop constraint guest_fk;
alter table guest_reply 
add constraint guest_fk 
foreign key (ref) 
references guest(num) 
on delete cascade;
         
ALTER TABLE Guest_Reply
ADD CONSTRAINT sabun_fk 
FOREIGN KEY(sabun) 
REFERENCES guest(sabun) 
ON DELETE CASCADE;
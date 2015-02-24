
-- 아이템 
-- 이 테이블을 생성하기 전에
-- Category 와 Image 테이블을 먼저 
-- 생성하고 commit 한 후
-- 생성해야함

CREATE TABLE Item(
	item_no number(12) PRIMARY KEY,
	item_name varchar2(50) NOT NULL,
	price number(12) DEFAULT 0,
	pd_date varchar2(20) DEFAULT '없음', -- 생산년도, 30년산 등등 계산에 사용
	dsc varchar2(300) DEFAULT '없음',
	cate_name number(12) NOT NULL,-- 카테고리 
	rep_img varchar2(200)),
	big_img varchar2(200),
	reg_date date default sysdate;
	
select 
item_no 

from (select rownum as seq, i.* from item i)
where seq between #{0} and #{1}
order by item_no desc





	
select 
item_no 

from (select rownum as seq, i.* from item i)
where seq between #{0} and #{1}
order by item_no desc




package com.hanbit.web.dao;

import java.util.List;
import java.util.Map;
import com.hanbit.web.vo.ItemVo;

public interface ItemDao {
	public List<ItemVo> selectList(Map<String,Object> map);
	public ItemVo selectOne(int id);
	public int count();
	public void insert(ItemVo item);
	public void update(ItemVo item);
	public void delete(int id);
	
}

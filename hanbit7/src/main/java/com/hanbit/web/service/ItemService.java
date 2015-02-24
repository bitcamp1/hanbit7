package com.hanbit.web.service;

import java.util.List;
import java.util.Map;

import com.hanbit.web.vo.ItemVo;

public interface ItemService {
	public List<ItemVo> getList(Map<String,Object>map);
	public ItemVo getOne(int id);
	public int count();
	public void add(ItemVo item);
	public void edit(ItemVo item);
	public void remove(int id);
}

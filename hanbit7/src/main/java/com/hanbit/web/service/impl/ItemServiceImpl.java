package com.hanbit.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.web.dao.ItemDao;
import com.hanbit.web.service.ItemService;
import com.hanbit.web.vo.ItemVo;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	ItemDao dao;
	@Override
	public List<ItemVo> getList(Map<String, Object> map) {
		return dao.selectList(map);
	}

	@Override
	public ItemVo getOne(int id) {
		return dao.selectOne(id);
	}

	@Override
	public int count() {
		return dao.count();
	}

	@Override
	public void add(ItemVo item) {
		dao.insert(item);
		
	}

	@Override
	public void edit(ItemVo item) {
		dao.update(item);
		
	}

	@Override
	public void remove(int id) {
		dao.delete(id);
	}

}

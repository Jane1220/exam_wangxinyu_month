package com.wangxinyu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangxinyu.dao.CategoryMapper;
import com.wangxinyu.entity.Category;
import com.wangxinyu.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryMapper categoryMapper;

	@Override
	public List<Category> listByChannelId(int chnId) {
		// TODO Auto-generated method stub
		return categoryMapper.listByChannelId(chnId);
	}

}

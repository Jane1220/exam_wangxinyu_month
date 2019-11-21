package com.wangxinyu.dao;

import java.util.List;

import com.wangxinyu.entity.Category;

public interface CategoryMapper {

	/**
	 * 获取分类
	 * @param chnId
	 * @return
	 */
	List<Category> listByChannelId(int chnId);
	

}

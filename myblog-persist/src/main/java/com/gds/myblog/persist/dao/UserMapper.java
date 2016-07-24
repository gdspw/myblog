package com.gds.myblog.persist.dao;

import org.springframework.stereotype.Component;

import com.gds.myblog.model.User;

@Component
public interface UserMapper {
	
	int deleteByPrimaryKey(Integer autoId);
	
	int insert(User record);
	
	int insertSelective(User record);
	
	User selectByPrimaryKey(Integer autoId);
	
	int updateByPrimaryKeySelective(User record);
	
	int updateByPrimaryKey(User record);
}
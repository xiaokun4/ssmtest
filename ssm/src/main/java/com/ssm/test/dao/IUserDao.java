package com.ssm.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.test.entity.User;
@Repository
public interface IUserDao {
	    int deleteByPrimaryKey(Integer id);

	    int insert(User record);

	    int insertSelective(User record);

	    User selectByPrimaryKey(Integer id);

	    int updateByPrimaryKey(User record);
	    
	    List<User> selectAllUser();
}

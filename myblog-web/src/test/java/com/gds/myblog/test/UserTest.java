package com.gds.myblog.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gds.myblog.model.User;
import com.gds.myblog.persist.dao.UserMapper;

/**
 * 
 * <p>Title:UserTest</p>
 * <p>Description:TODO 描述这个类要做什么</p>
 * @author 小凡他大爷
 * @date 2016年7月24日 下午3:06:56
 *
 */
public class UserTest extends BaseTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void usetTest() {
		
		User user = new User();
		user.setAge(20);
		user.setName("王麻子");
		userMapper.insert(user);
		
	}
}

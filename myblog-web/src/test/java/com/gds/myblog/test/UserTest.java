package com.gds.myblog.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gds.myblog.model.User;
import com.gds.myblog.persist.dao.UserMapper;

/**
 * 
 * <p>Title:UserTest</p>
 * <p>Description:TODO ���������Ҫ��ʲô</p>
 * @author С������ү
 * @date 2016��7��24�� ����3:06:56
 *
 */
public class UserTest extends BaseTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void usetTest() {
		
		User user = new User();
		user.setAge(20);
		user.setName("������");
		userMapper.insert(user);
		
	}
}

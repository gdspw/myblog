package com.gds.myblog.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * <p>Title:BaseTest</p>
 * <p>Description:基础测试类</p>
 * @author 小凡他大爷
 * @date 2016年7月23日 下午10:13:33
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class BaseTest {
	
	@Test
	public void test() {
		
	}
}

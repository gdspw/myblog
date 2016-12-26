package org.myblog.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * <p>Title:BaseTest</p>
 * <p>Description:����������</p>
 * @author С������ү
 * @date 2016��7��23�� ����10:13:33
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
// @TransactionConfiguration(transactionManager = "transactionManager",
// defaultRollback = true)
@Transactional
public class BaseTest {
	
	@Test
	public void test() {
		
	}
}

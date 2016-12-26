package com.gds.myblog.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.gds.myblog.model.Customer;

public class CustomerTest extends BaseTest {
	@Autowired
	private MongoTemplate mongo;
	
	@Test
	public void test() {
		Customer c = new Customer();
		c.setId(5);
		c.setFirstName("wu");
		c.setLastName("wei");
		mongo.insert(c);
		
	}
	
	public void select() {
		Query q = new Query();
		// q.mongo.find(q, Customer.class, null);
	}
}

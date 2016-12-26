package org.myblog.core;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import com.mongodb.DBCollection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DocumentDemo {
	
	@Resource
	private MongoTemplate mongo;
	
	public boolean createCollection(String name) {
		log.info("进入createCollection方法中！！！！");
		DBCollection collection = mongo.createCollection("test");
		
		return true;
	}
	
	public DBCollection getCollection(String name) {
		log.info("进入getCollection方法中！！！！");
		DBCollection collection = mongo.getCollection(name);
		return collection;
	}
	
	public boolean saveDocument(Document document, DBCollection dbCollection) {
		log.info("进入saveDocument方法中！！！！");
		List<Document> documentList = new ArrayList<>();
		documentList.add(document);
		
		return true;
	}
}

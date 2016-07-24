package com.gds.myblog.model;

/**
 * 
 * <p>Title:User</p>
 * <p>Description:TODO 描述这个类要做什么</p>
 * @author 小凡他大爷
 * @date 2016年7月23日 下午9:55:23
 *
 */
public class User {
	private Integer autoId;
	
	private String name;
	
	private Integer age;
	
	public Integer getAutoId() {
		return autoId;
	}
	
	public void setAutoId(Integer autoId) {
		this.autoId = autoId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
}

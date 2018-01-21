package com.java.springboot.dynamicDataSource.domain;

import java.io.Serializable;

public class Demo implements Serializable{

	private static final long serialVersionUID = 2254488220966149525L;
	
	private Long id;
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

package com.java.springboot.dynamicDataSource.dao;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.java.springboot.dynamicDataSource.domain.Demo;

public interface IDemoDao {
	
//	@Select("select * from demo")
	public List<Demo> find();
	
//	@Select("select * from demo")
	public List<Demo> find1();
	
//	@Select("select * from demo")
	public List<Demo> find2();
}

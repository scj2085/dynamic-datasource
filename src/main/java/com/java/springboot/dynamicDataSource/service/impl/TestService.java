package com.java.springboot.dynamicDataSource.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.dynamicDataSource.dao.IDemoDao;
import com.java.springboot.dynamicDataSource.datasource.TargetDataSource;
import com.java.springboot.dynamicDataSource.domain.Demo;

@Service
public class TestService {

	@Autowired
	private IDemoDao iDemoReadDBDao;

	/**
	 * 不指定数据源使用默认数据源
	 * 
	 * @return
	 */
//	public int add() {
//		Demo demo = new Demo();
//		return iDemoWirtedADao.add(demo);
//	}

	/**
	 * 指定数据源
	 * 
	 * @return
	 */
	@TargetDataSource("ds1")
	public List<Demo> find1() {
		return iDemoReadDBDao.find1();
	}
	
	@TargetDataSource("ds2")
	public List<Demo> find2() {
		return iDemoReadDBDao.find2();
	}
	
	/**
	 * 不指定数据源使用默认数据源
	 * @return
	 */
	public List<Demo> find() {
		return iDemoReadDBDao.find();
	}
}

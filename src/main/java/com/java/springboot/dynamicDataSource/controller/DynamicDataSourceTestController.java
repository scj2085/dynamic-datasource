package com.java.springboot.dynamicDataSource.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.dynamicDataSource.domain.Demo;
import com.java.springboot.dynamicDataSource.service.impl.TestService;


@RestController
public class DynamicDataSourceTestController {

	@Resource
	private TestService testService;

	@RequestMapping("/test1")
	public String test() {
		List<Demo> ds = testService.find();
		for (Demo d : ds) {
			System.err.println(d.getId() + "=====" + d.getName());
		}
		List<Demo> ds1 = testService.find1();
		for (Demo d : ds1) {
			System.err.println(d.getId() + "=====" + d.getName());
		}
		List<Demo> ds2 = testService.find2();
		for (Demo d : ds2) {
			System.err.println(d.getId() + "=====" + d.getName());
		}
		return "ok";
	}
}

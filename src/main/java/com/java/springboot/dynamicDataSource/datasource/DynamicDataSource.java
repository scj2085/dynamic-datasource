package com.java.springboot.dynamicDataSource.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源
 * @author Administrator
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	//代码中的determineCurrentLookupKey方法取得一个字符串，该字符串将与配置文件中的相应字符串进行匹配以定位数据源
	//DynamicDataSourceContextHolder代码中使用setDataSourceType设置当前的数据源，在路由类中使用getDataSourceType进行获取，
    //交给AbstractRoutingDataSource进行注入使用
	@Override
	protected Object determineCurrentLookupKey() {
		return DynamicDataSourceContextHolder.getDataSourceType();
	}

}

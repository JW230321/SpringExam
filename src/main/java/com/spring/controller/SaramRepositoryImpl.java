package com.spring.controller;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SaramRepositoryImpl implements SaramRepository {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insert(Map<String, Object> map) {
		sqlSessionTemplate.insert("saram.insert");
	}

}

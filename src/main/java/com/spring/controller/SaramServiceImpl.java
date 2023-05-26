package com.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class SaramServiceImpl implements SaramService {

	@Autowired
	SaramRepository saramRepository;
	
	@Override
	public void insert(Map<String, Object> map) {
		saramRepository.insert(map);

	}

}

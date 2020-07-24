package com.lxj.service;

import java.util.List;
import java.util.Map;

import com.lxj.bean.Person;

public interface PersonService {
	
	public List<Person> queryAll(Map<String, Object> map);
}

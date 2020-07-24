package com.lxj.mapper;

import java.util.List;
import java.util.Map;

import com.lxj.bean.Person;

public interface PersonMapper {
	
	public List<Person> querAll(Map<String, Object> map);
}

package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.CarbrandExample;
import com.accp.domain.StaffExample;
import com.accp.mapper.StaffMapper;
import com.accp.domain.CarbrandExample.Criteria;

@Service
public class test {
	
	@Autowired
	StaffMapper staffMapper;
	
	public void me() {
		CarbrandExample example =new CarbrandExample();
		Criteria criteria=example.createCriteria();
		
	}
}

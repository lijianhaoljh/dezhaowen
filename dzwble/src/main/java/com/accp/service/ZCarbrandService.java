package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Carbrand;
import com.accp.domain.CarbrandExample;
import com.accp.domain.CarbrandExample.Criteria;
import com.accp.mapper.CarbrandMapper;

@Service
@Transactional
public class ZCarbrandService {
			@Autowired
			CarbrandMapper carbrand;
			
			public List<Carbrand> query(String condition){
				CarbrandExample example=new CarbrandExample();
				Criteria criteria =example.createCriteria();
				if(condition!=null && ! "".equals(condition.trim())) 
				{
					if(condition.matches("^[0-9]*$")) {
						example.or().andCbnoEqualTo(Integer.valueOf(condition));
					}else{
						example.or().andCbfirstLike("%"+condition+"%");
						example.or().andCbnameLike("%"+condition+"%");
					}
				}
				return carbrand.selectByExample(example);
			}
}

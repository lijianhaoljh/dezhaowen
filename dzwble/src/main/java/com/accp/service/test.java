package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Carbrand;
import com.accp.domain.CarbrandExample;
import com.accp.mapper.CarbrandMapper;
import com.accp.domain.CarbrandExample.Criteria;

@Service
@Transactional
public class test {
	@Autowired
	CarbrandMapper carbrandMapper;
	/*
	 * 模糊查询
	 */
	public List<Carbrand> findLikeCarbrand(String condition){
		CarbrandExample example =new CarbrandExample();
		Criteria criteria=example.createCriteria();
		if (condition != null && !"".equals(condition.trim()))
		{
			//不为空
			if(condition.matches("^[0-9]*$")) {
				//数字根据编号查
				example.createCriteria().andCbnoEqualTo(Integer.valueOf(condition));
			}else {
				//非数字根据编号查或是名称或首字母
				example.or().andCbfirstLike("%"+condition+"%");
				example.or().andCbnameLike("%"+condition+"%");
			}
		}
		return carbrandMapper.selectByExample(example);
	}
}

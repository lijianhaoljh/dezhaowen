package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Maintenance;
import com.accp.mapper.MaintenanceMapper;

@Service
@Transactional
public class ZMaintenanceService {
			@Autowired
			MaintenanceMapper maintenance;
			
			public List<Maintenance> fdjQuery(){
				return maintenance.fdjQuery();
				
			}
}

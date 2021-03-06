package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Maintenance;
import com.accp.service.ZMaintenanceService;

@RestController
@RequestMapping("/MaintenanceRest")
public class ZMaintenanceController {
			@Autowired
			ZMaintenanceService zmaintenanceService;
			
			@GetMapping
			public List<Maintenance> fdjQuery(){
				return zmaintenanceService.fdjQuery();
			}
			
}

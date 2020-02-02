package com.accp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.People;

@RestController
public class testController {
	
	@PostMapping("/loginin")
	public Map<String, Object> loginin(String username, String password, HttpSession session) {
		People users = new People();
		users.setPname(username);
		users.setPno(password);
		
		session.setAttribute("user", users);
		Map<String, Object> map = new HashMap<>();
		map.put("user", users);
		map.put("token", session.getId());
		System.out.println("进来了吧");
		return map;
	}
	
}

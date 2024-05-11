package com.piseth.school.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.piseth.school.account.config.AccountServiceConfig;
import com.piseth.school.account.properties.Properties;

@RequestMapping("api/config")
@RestController
public class CourseController {
	
	@Autowired
	private AccountServiceConfig serviceConfig;
	
	@GetMapping("/properties")
	public String getProperties() throws JsonProcessingException{
		ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		Properties properties = new Properties(
				serviceConfig.getMsg(), 
				serviceConfig.getBuildVersion(), 
				serviceConfig.getMailDetails(),
				serviceConfig.getActiveBranches());
		String json = objectWriter.writeValueAsString(properties);
		return json;
				
	}

}

package com.example.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private com.example.microservices.limitsservice.configuration configuration;
	
	@GetMapping("/limits")
	
	public LimitConfiguration retrieveLimitsFromConfigurations(){
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	
	}

}

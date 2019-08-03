package com.example.configuration.check.checkProperty.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.example.configuration.check.checkProperty.bo.PrintBO;

@EnableAutoConfiguration
@EnableConfigurationProperties(value = { AppProperties.class, ServerProperties.class })
public class PropTestConfig {
	
	@Autowired
	AppProperties appProperties;

	@Autowired
	ServerProperties serverProperties;
	
	@Bean
	public PrintBO printBO(){
		PrintBO printBO = new PrintBO();
		printBO.setAppProperties(appProperties);
		printBO.setServerProperties(serverProperties);
		return printBO;
	}
	

}

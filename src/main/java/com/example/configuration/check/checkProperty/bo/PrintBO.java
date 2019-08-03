package com.example.configuration.check.checkProperty.bo;

import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.configuration.check.checkProperty.config.AppProperties;
import com.example.configuration.check.checkProperty.config.ServerProperties;

@Component
public class PrintBO {

	@Autowired
	AppProperties appProperties;

	@Autowired
	ServerProperties serverProperties;

	public void print() {
		System.out.println(ToStringBuilder.reflectionToString(appProperties, new MultilineRecursiveToStringStyle()));
		System.out.println(ToStringBuilder.reflectionToString(serverProperties, new MultilineRecursiveToStringStyle()));

	}

}

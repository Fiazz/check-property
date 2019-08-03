package com.example.configuration.check.property.bo;

import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.configuration.check.property.config.AppProperties;
import com.example.configuration.check.property.config.ServerProperties;

import lombok.Data;

@Component
@Data
public class PrintBO {

	private static final Logger LOGGER = Logger.getLogger(PrintBO.class);

	@Autowired
	AppProperties appProperties;

	@Autowired
	ServerProperties serverProperties;

	public void print() {
		LOGGER.info(ToStringBuilder.reflectionToString(appProperties, new MultilineRecursiveToStringStyle()));
		LOGGER.info(ToStringBuilder.reflectionToString(serverProperties, new MultilineRecursiveToStringStyle()));
	}
}
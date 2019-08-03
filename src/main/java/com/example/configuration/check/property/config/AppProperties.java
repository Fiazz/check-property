package com.example.configuration.check.property.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "app.proxy")
@Data
public class AppProperties {

	private boolean secured;
	private String url;

}

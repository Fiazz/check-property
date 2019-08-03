package com.example.configuration.check.checkProperty.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "app.proxy")
@Data
public class AppProperties {

	private boolean secured;
	private String url;

}

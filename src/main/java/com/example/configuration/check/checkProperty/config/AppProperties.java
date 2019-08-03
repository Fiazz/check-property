package com.example.configuration.check.checkProperty.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.proxy")
public class AppProperties {

	private boolean secured;
	private String url;

	public boolean getSecured() {
		return secured;
	}

	public void setSecured(boolean secured) {
		this.secured = secured;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}

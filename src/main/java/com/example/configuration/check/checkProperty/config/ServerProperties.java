package com.example.configuration.check.checkProperty.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "servers")
@Data
public class ServerProperties {
	private List<Server> serverList = new ArrayList<>();

	@Data
	public static class Server {
		private String ipAddress;
		private String host;
		private String port;
	}
}

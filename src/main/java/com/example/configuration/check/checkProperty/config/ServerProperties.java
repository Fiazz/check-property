package com.example.configuration.check.checkProperty.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "servers")
public class ServerProperties {
	private List<Server> serverList = new ArrayList<>();

	public List<Server> getServerList() {
		return serverList;
	}

	public void setServerList(List<Server> serverList) {
		this.serverList = serverList;
	}

	public static class Server {
		private String ipAddress;
		private String host;
		private String port;

		public String getIpAddress() {
			return ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getPort() {
			return port;
		}

		public void setPort(String port) {
			this.port = port;
		}

	}
}

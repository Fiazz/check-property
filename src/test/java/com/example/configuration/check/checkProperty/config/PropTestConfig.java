package com.example.configuration.check.checkProperty.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableAutoConfiguration
@EnableConfigurationProperties(value = { AppProperties.class, ServerProperties.class })
public class PropTestConfig {

}

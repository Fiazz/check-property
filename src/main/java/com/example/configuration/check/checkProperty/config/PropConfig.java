package com.example.configuration.check.checkProperty.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({AppProperties.class,ServerProperties.class})
public class PropConfig {

}

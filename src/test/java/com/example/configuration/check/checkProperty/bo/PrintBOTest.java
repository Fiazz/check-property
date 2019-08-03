package com.example.configuration.check.checkProperty.bo;

import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.example.configuration.check.checkProperty.config.AppProperties;
import com.example.configuration.check.checkProperty.config.PropTestConfig;
import com.example.configuration.check.checkProperty.config.ServerProperties;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { PropTestConfig.class }, initializers = ConfigFileApplicationContextInitializer.class)
public class PrintBOTest {

	@Autowired
	AppProperties appProperties;
	
	@Autowired
	ServerProperties serverProperties;

	@Test
	public void print() {
		Assert.notNull(appProperties, "AppProperties did not load");
		Assert.notNull(serverProperties, "ServerProperties did not load");
		System.out.println(ToStringBuilder.reflectionToString(appProperties, new MultilineRecursiveToStringStyle()));
		System.out.println(ToStringBuilder.reflectionToString(serverProperties, new MultilineRecursiveToStringStyle()));

	}
}

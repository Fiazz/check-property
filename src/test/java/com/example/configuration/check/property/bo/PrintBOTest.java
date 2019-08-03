package com.example.configuration.check.property.bo;

import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.util.Assert;

import com.example.configuration.check.property.config.AppProperties;
import com.example.configuration.check.property.config.PropTestConfig;
import com.example.configuration.check.property.config.ServerProperties;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { PropTestConfig.class }, initializers = ConfigFileApplicationContextInitializer.class)
public class PrintBOTest {

	private static final Logger LOGGER = Logger.getLogger(PrintBOTest.class);

	@Autowired
	AppProperties appProperties;

	@Autowired
	ServerProperties serverProperties;

	@Autowired
	PrintBO printBO;

	@InjectMocks
	PrintBO printBOInject;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void print() {
		Assert.notNull(appProperties, "AppProperties did not load");
		Assert.notNull(serverProperties, "ServerProperties did not load");
		Assert.isTrue(serverProperties.getServerList().size() == 2, "ServerProperties did not load");
		LOGGER.info(ToStringBuilder.reflectionToString(appProperties, new MultilineRecursiveToStringStyle()));
		LOGGER.info(ToStringBuilder.reflectionToString(serverProperties, new MultilineRecursiveToStringStyle()));
	}

	@Test
	public void testPrintBO() {
		Assert.notNull(printBO.getAppProperties(), "AppProperties did not load");
		Assert.notNull(printBO.getServerProperties(), "ServerProperties did not load");
		Assert.isTrue(printBO.getServerProperties().getServerList().size() == 2, "ServerProperties did not load");
		printBO.print();
	}

	@Test
	public void testPrintBOInject() {
		ReflectionTestUtils.setField(printBOInject, "appProperties", appProperties);
		ReflectionTestUtils.setField(printBOInject, "serverProperties", serverProperties);
		Assert.notNull(printBOInject.getAppProperties(), "AppProperties did not load");
		Assert.notNull(printBOInject.getServerProperties(), "ServerProperties did not load");
		Assert.isTrue(printBOInject.getServerProperties().getServerList().size() == 2, "ServerProperties did not load");
		printBOInject.print();
	}
}
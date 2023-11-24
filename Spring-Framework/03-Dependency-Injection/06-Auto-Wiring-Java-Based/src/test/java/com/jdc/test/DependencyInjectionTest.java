package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.AppConfigs;
import com.jdc.beans.MyClient;


@SpringJUnitConfig(classes = AppConfigs.class)
public class DependencyInjectionTest {

	@Autowired
	private MyClient client;
	
	@Test
	void test_for_explicit_wiring() {
		client.callService();;
	}
	
}

package com.lzm.test;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JmsTest {
	/**
	 * 点对点测试consumer
	 * @throws IOException
	 */
	@Test
	public void pointToPoint() throws IOException {
		ClassPathXmlApplicationContext application=new ClassPathXmlApplicationContext("applicationContext-jms-consumer-point.xml");
		application.start();
		System.in.read();
	}
	/**
	 * 发布订阅测试consumer
	 * @throws IOException
	 */
	@Test
	public void releaseSubscription() throws IOException {
		ClassPathXmlApplicationContext application=new ClassPathXmlApplicationContext("applicationContext-jms-consumer-topic.xml");
		application.start();
		System.in.read();
	}
}

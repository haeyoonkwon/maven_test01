package com.bitacademy.maven01.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitacademy.maven01.HelloMaven;

public class HelloMavenTest {

	@Test
	public void testHello() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
		HelloMaven hello=(HelloMaven)ctx.getBean("hello");
		String result=hello.hello();
		System.out.println(result);
	}

}

package com.java.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.SpringBeanSample;

public class SpringDemo {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	SpringBeanSample beanSample  = (SpringBeanSample) context.getBean("springBean");
	beanSample.testMe();
	}

}

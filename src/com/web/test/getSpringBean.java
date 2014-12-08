package com.web.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class getSpringBean {
	public static Object getBean(String str)
	{
		ApplicationContext atc=new ClassPathXmlApplicationContext(new String[]{"/WEB-INF/applicationContext.xml"});
		return atc.getBean(str);
	}
}

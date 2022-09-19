package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyJavaConfig;
import study.beans.MessageBean;

public class Demo4 {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyJavaConfig.class);
		MessageBean bean1 = context.getBean("msg2", MessageBean.class);
		
		System.out.println(bean1.getMessage()+" "+bean1.getSenderName());
		System.out.println("address = "+bean1.getReciverAddress().getCity());
	}
}

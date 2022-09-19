package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.beans.MessageBean;

public class Demo6 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MessageBean bean = context.getBean("msg4", MessageBean.class);
		System.out.println(bean.getSenderName()+" msg :  "+bean.getMessage()+" city : "+bean.getReciverAddress().getCity());
	}

}

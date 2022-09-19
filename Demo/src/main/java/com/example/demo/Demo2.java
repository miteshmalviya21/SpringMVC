package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.beans.MessageBean;

public class Demo2 {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//MessageBean bean = (MessageBean) context.getBean("msg");
		MessageBean bean = context.getBean("msg",MessageBean.class); //another way to ask for the bean     --- we dont have to typecast
		
		// calling getBean second time
		
		MessageBean bean2 = context.getBean("msg",MessageBean.class);
		
		bean.setSenderName("Naman");
		
		System.out.println("After changing bean 1");
		
		System.out.println("bean : " +bean.getMessage()+"  "+bean.getSenderName());
		System.out.println("bean2 : " +bean2.getMessage()+"  "+bean2.getSenderName());

	}
}

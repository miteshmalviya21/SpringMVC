package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.beans.BookBean;

public class Demo5 {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("study.beans","some.other");
		context.refresh();
		
		BookBean bean = context.getBean(BookBean.class);
		System.out.println(bean.getName()+" : "+bean.getCost());
		System.out.println(bean.getPublisher().getName());
	}
}

package com.cdac.db;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.beans.DAOBean;
import study.beans.DAOBeanUsingJdbcTemplete;

public class DbApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("study.beans","com.cdac.db.config");
		context.refresh();
		
		//DAOBean bean = context.getBean(DAOBean.class);
		//bean.insert(888, "window laptop", 60000);
		
		DAOBeanUsingJdbcTemplete bean2 = context.getBean(DAOBeanUsingJdbcTemplete.class);
		//bean2.insert(777, "Bluetooth Earphone", 3000);
		
		bean2.getProduct().stream().forEach((p)->{System.out.println(p);});
	}

}

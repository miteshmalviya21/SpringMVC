package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import study.beans.AddressBean;
import study.beans.MessageBean;

@Configuration
public class MyJavaConfig {
	
	@Bean(value="msg")
	@Scope(value = "prototype")
	public MessageBean getMessageBean() {
		
		MessageBean bean = new MessageBean();
		bean.setMessage("This is from java config");
		bean.setSenderName("doremon");
		bean.setReiciverAddress(getaddress());
		return bean;
	}
	
	@Bean(value="msg2")
	public MessageBean getMessageBean2() {
		
		MessageBean bean = new MessageBean("this is from config 2","Nobita",getaddress());
		return bean;
	}
	
	@Bean(value="address")
	public AddressBean getaddress() {
		
		AddressBean bean = new AddressBean();
		bean.setCity("Khargone");
		bean.setLocation("Nutan nagar");
		bean.setCountry("India");
		bean.setState("MP");
		bean.setPin("451001");
		
		return bean;
	}
}

package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
				ICustomerDal manager =context.getBean("database",ICustomerDal.class);
				
				manager.add();
			
		
		//Bunun olmasi gereken alternatifi yukaridaki koddur.
		//CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		//manager.add();
		
	}
	//IoC - Inversion of Control
	//Dependency Injection
	//SOLID
	
}

package com.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springDemo")
public class IocConfig {
	@Bean
	public ICustomerDal database() {
		return new msSqlCustomerDal();
	}
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
}

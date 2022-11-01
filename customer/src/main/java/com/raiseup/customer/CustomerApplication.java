package com.raiseup.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@EnableEurekaClient
@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CustomerApplication.class, args);
		System.out.println(context.getBean(DataSource.class));
	}

//	@Bean
//	public DataSource dataSource(){
//		DriverManagerDataSource dataSource= new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUsername("root");
//		dataSource.setPassword("rahmin4101");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/customer");
//		return dataSource;
//	}

}

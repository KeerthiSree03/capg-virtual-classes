package com.capg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}
	
//	@Bean
//	public InternalResourceViewResolver view() {
//		InternalResourceViewResolver vsr=new InternalResourceViewResolver();
//		vsr.setSuffix(".jsp");
//		vsr.setPrefix("views/");
//		return vsr;
//	}

}

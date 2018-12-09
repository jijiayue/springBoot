package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class DemoApplication {


//  部署到tomcat 需要   并且在pom中还要做修改   jdk和tomcat 有版本支持关系
//	public class DemoApplication extends SpringBootServletInitializer {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(DemoApplication.class);
//	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

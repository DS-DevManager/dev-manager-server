package com.kt.devManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableMongoRepositories
@EnableMongoAuditing
public class DevManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevManagerApplication.class, args);
	}


////	@Configuration
//	@Bean
//	public WebMvcConfigurer webMvcConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**")
//						.allowedOrigins("*")
////                .allowedOrigins("http://localhost:3000")
//						.allowedMethods("GET", "POST")
//						.maxAge(3000);
//			}
//		};
//	}
}

package com.ge.digital.proxymicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan 
@EnableAutoConfiguration
public class ProxyMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyMicroserviceApplication.class, args);
	}
}

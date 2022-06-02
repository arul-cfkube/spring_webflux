package com.ong.webfluxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;


@SpringBootApplication
public class WebfluxDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(WebfluxDemoApplication.class, args);
	}

	@Configuration
	// @Profile("actuator-endpoints") /* if you want: register bean only if profile is set */
	public class HttpTraceActuatorConfiguration {
	
	@Bean
	public HttpTraceRepository htttpTraceRepository() {
		return new InMemoryHttpTraceRepository();
	};	
	
	}

}


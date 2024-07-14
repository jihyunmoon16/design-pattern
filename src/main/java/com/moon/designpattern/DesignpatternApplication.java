package com.moon.designpattern;

import com.moon.designpattern.cor.ExecutionContext;
import com.moon.designpattern.cor.HandlerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DesignpatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(HandlerService handlerService) {
		return args -> {
			ExecutionContext context = new ExecutionContext("Hello");
			handlerService.process(context);
		};
	}
}

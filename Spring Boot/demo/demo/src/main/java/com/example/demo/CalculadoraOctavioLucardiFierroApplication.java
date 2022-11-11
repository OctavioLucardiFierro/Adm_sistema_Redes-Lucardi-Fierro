package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraOctavioLucardiFierroApplication {

	private static Logger logger = LoggerFactory.getLogger(CalculadoraOctavioLucardiFierroApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraOctavioLucardiFierroApplication.class, args);

		logger.warn("Hola mundo");


	}

}

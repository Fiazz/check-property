package com.example.configuration.check.checkProperty;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.configuration.check.checkProperty.bo.PrintBO;

@SpringBootApplication
public class CheckPropertyApplication {

	@Autowired
	PrintBO bo;

	public static void main(String[] args) {
		SpringApplication.run(CheckPropertyApplication.class, args);
	}

	@PostConstruct
	public void printMe() {
		bo.print();
	}
}

package com.example.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.file.controller.CSVController;




@SpringBootApplication
//@ComponentScan(basePackageClasses = CSVController.class)
public class SpringbootAlemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAlemApplication.class, args);
	}

}

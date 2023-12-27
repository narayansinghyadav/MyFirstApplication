package com.MyFirstApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.MyController;

@ComponentScan(basePackageClasses=MyController.class)
@SpringBootApplication
public class MyFirstApplication {

	public static void main(String[] args) {
		System.out.print("starting Springbbot Application..!!!!");
		SpringApplication.run(MyFirstApplication.class, args);
	}

}

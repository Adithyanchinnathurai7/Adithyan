package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import comp.Mycomponent;

@SpringBootApplication
@ComponentScan(basePackages={"comp","dao","service"})
public class MypjcexcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnfn=SpringApplication.run(MypjcexcApplication.class, args);
		
		Mycomponent mycmp=cnfn.getBean("mycompo",Mycomponent.class);
		mycmp.compt();
	}

}

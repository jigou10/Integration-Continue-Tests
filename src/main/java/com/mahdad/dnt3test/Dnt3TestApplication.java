package com.mahdad.dnt3test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Dnt3TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dnt3TestApplication.class, args);
		HelloController hello=new HelloController();
		System.out.println(hello.index());
	}
}

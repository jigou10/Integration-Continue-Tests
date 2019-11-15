package com.mahdad.dnt3test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Dnt3TestApplicationTests {

	public static void main(String[] args) {
		//SpringApplication.run(Dnt3TestApplication.class, args);
		HelloControllerTest h=new HelloControllerTest();
		h.testIndex();
		h.testHello();
		System.out.println("aaaaaaaa");
	}

}

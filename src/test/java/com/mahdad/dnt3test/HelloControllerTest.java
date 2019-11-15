package com.mahdad.dnt3test;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

	@Test
	void testIndex() {
		HelloController helloController=new HelloController();
		String resultIndex=helloController.index();
		assertThat(resultIndex).isEqualTo("Gretings from spring boot!!");
	}
	
	@Test
	void testHello() {
		HelloController hello=new HelloController();
		String resultHello=hello.hello();
		assertThat(resultHello).isEqualTo("Hello word!");
	}
}

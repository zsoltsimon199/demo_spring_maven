package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void exampleTest() {
		int actual = 1;
		int expected = 1;
		Assertions.assertThat(actual).isEqualTo(expected);
	}

}

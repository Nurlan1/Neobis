package com.example.demo;

import com.example.demo.controller.AuthorControllerIntegrationTest;
import com.example.demo.controller.CategoryController;
import com.example.demo.controller.CategoryControllerIntegrationTest;
import com.example.demo.entity.Category;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		AuthorControllerIntegrationTest.class,
		CategoryControllerIntegrationTest.class
})

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {

	}

}

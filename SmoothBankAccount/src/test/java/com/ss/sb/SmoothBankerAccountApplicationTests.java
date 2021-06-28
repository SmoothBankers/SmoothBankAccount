package com.ss.sb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ss.sb.controller.AccountController;
import com.ss.sb.controller.AccountTypeController;

@SpringBootTest
class SmoothBankerAccountApplicationTests {
	
	@Autowired
	AccountController aController;
	
	AccountTypeController atController;

	@Test
	void contextLoads() {
		assertThat(aController).isNotNull();
	}

}

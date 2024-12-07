package com.practice.basic;

import com.practice.basic.controllers.testController;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class BasicApplicationTests {
@InjectMocks
public testController firsttest ;
	@Test
	void contextLoads() {
		String name = "ravi teja";
		when(firsttest.testConnection()).thenReturn(name);
		String result = firsttest.testConnection();
		assertEquals("ravi teja", result);

		// Verify
		verify(firsttest, times(1)).testConnection();
	}



}

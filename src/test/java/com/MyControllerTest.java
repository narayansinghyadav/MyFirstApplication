package com;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MyControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	MyController controller;
	
	@Test
	public void getModelAndViewTest() throws Exception {
		
		when(controller.firstPage()).thenReturn(new ModelAndView("success"));
		
		
	}

}

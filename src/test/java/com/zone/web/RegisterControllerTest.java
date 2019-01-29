package com.zone.web;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.zone.data.WeightersRepository;
import com.zone.entities.GeneralWeighter;
import com.zone.entities.MaleWeighter;
import com.zone.exceptions.WeightersException;

public class RegisterControllerTest {

	@Test
	public void registerControllerGetTest() throws Exception {
		WeightersRepository weightersRepository = mock(WeightersRepository.class);
		RegisterController registerController = new RegisterController(weightersRepository);
		MockMvc mockMvc = standaloneSetup(registerController).build();
		
		mockMvc.perform(get("/register")).andExpect(view().name("registerForm"));
	}

	@Test
	public void registerControllerPostTest() throws Exception {
		WeightersRepository weightersRepository = mock(WeightersRepository.class);
		RegisterController registerController = new RegisterController(weightersRepository);
		MockMvc mockMvc = standaloneSetup(registerController).build();
		GeneralWeighter weighter = new GeneralWeighter();
		weighter.setFirstName("Jack");
		weighter.setLastName("Bauer");
		weighter.setUsername("jbauer");
		weighter.setPassword("24hours");
		weighter.setSex("male");
		
		doNothing().when(weightersRepository).saveWeighter(weighter);
		
		mockMvc.perform(post("/register")
		.param("firstName", weighter.getFirstName())
		.param("lastName", weighter.getLastName())
		.param("username", weighter.getUsername())
		.param("password", weighter.getPassword())
		.param("sex", weighter.getSex()))
		.andExpect(redirectedUrl("/profile"));
		
		verify(weightersRepository, times(1)).saveWeighter(weighter);
	}
}

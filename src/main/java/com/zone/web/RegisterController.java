package com.zone.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zone.data.Weighter;
import com.zone.data.WeightersRepository;

@Controller
@RequestMapping(value="/register")
public class RegisterController {
	
	@Autowired
	private WeightersRepository weightersRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public String profile() {
		return "register";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String postProfile(Weighter weighter) {
		weightersRepository.saveWeighter(weighter);
		return "redirect:/profile";
	}
}

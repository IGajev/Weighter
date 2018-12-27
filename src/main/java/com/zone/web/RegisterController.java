package com.zone.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zone.data.WeightersRepository;
import com.zone.entities.GeneralWeighter;
import com.zone.entities.Weighter;

@Controller
@RequestMapping(value="/register")
public class RegisterController {
	
	private WeightersRepository weightersRepository;
	
	@Autowired
	public RegisterController(WeightersRepository weightersRepository) {
		this.weightersRepository = weightersRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String profile(Model model) {
		model.addAttribute("weighter", new Weighter());
		return "registerForm";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String postProfile(@Valid GeneralWeighter weighter, Errors errors) {
		if (errors.hasErrors()) {
			return "registerForm";
		}
		weightersRepository.saveWeighter(weighter);
		return "redirect:/profile";
	}
}

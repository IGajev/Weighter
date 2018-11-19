package com.zone.web;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zone.data.MeasuresRepository;
import com.zone.data.WeightersRepository;
import com.zone.entities.Measure;
import com.zone.entities.Weighter;

@Controller
@RequestMapping(value="/profile")
public class ProfileController {
	 
	private WeightersRepository weightersRepository;
	private MeasuresRepository measuresRepository;
	
	@Autowired
	public ProfileController(WeightersRepository weightersRepository, MeasuresRepository measuresRepository) {
		this.weightersRepository = weightersRepository;
		this.measuresRepository = measuresRepository;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String profilePage(Model model) {
		Weighter weighter = this.getLoggedWeighter();
		Measure lastMeasure = measuresRepository.retrieveLastMeasureForWeighter(weighter);
		model.addAttribute("weighter", weighter);
		model.addAttribute("measure", new Measure());
		model.addAttribute("lastMeasure", lastMeasure);
		return "profileView";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String profilePagePostMeasurement(@Valid Measure measure, Errors errors) {
		if (errors.hasErrors()) {
			return "error";
		} else {
			measure.setDate(new Date());
			measuresRepository.saveMeasure(measure, this.getLoggedWeighter());
		}
		return "draw";
	}
	
	private Weighter getLoggedWeighter() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if( principal instanceof UserDetails ) {
			username = ((UserDetails) principal).getUsername();
		} else {
			username = principal.toString();
		}
		Weighter weighter = weightersRepository.retrieveWeighter(username);
		return weighter;
	}
}

package com.zone.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if( principal instanceof UserDetails ) {
			username = ((UserDetails) principal).getUsername();
		} else {
			username = principal.toString();
		}
		
		Weighter weighter = weightersRepository.retrieveWeighter(username);
		Measure lastMeasure = measuresRepository.retrieveLastMeasureForWeighter(weighter);
		model.addAttribute("weighter", weighter);
		model.addAttribute("measure", new Measure());
		if ( lastMeasure == null ) {
			return "emptyProfileMeasures";
		}
		return "profileView";
	}

}

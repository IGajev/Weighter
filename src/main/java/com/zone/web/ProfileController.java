package com.zone.web;

import java.util.Date;
import java.util.List;

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
import com.zone.service.MeasuresService;

@Controller
@RequestMapping(value="/profile")
public class ProfileController {
	 
	private WeightersRepository weightersRepository;
	private MeasuresRepository measuresRepository;
	private MeasuresService measuresService;
	
	@Autowired
	public ProfileController(
			WeightersRepository weightersRepository, 
			MeasuresRepository measuresRepository,
			MeasuresService measuresService) {
		this.weightersRepository = weightersRepository;
		this.measuresRepository = measuresRepository;
		this.measuresService = measuresService;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String profilePage(Model model) {
		Weighter weighter = getLoggedWeighter();
		Measure lastMeasure = measuresRepository.retrieveLastMeasureForWeighter(weighter);
		List<Measure> measures = measuresRepository.retrieveAllMeasuresForWeighter(getLoggedWeighter());
		model.addAttribute("weighter", weighter);
		model.addAttribute("measure", new Measure());
		model.addAttribute("lastMeasure", lastMeasure);
		model.addAttribute("dataPointsWeight", measuresService.getWeightDataPoints(measures, getLoggedWeighter()));
		model.addAttribute("dataPointsFats", measuresService.getFatsDataPoints(measures, getLoggedWeighter()));
		model.addAttribute("requiredWeight",measuresService.getRequiredWeight());
		model.addAttribute("dailyProteinRequirementBlocks", measuresService.getDailyProteinRequirementBlocks());
		model.addAttribute("dailyProteinRequirementGrams", measuresService.getDailyProteinRequirementGrams());
		model.addAttribute("requiredFatsPercent", weighter.getPerfectFatsPercent());
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
		return "redirect:/profile";
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


package com.zone.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.zone.data.WeightersRepository;

public class ValidPasswordValidator implements ConstraintValidator<ValidPassword, String>  {

	@Autowired
	WeightersRepository weightersRepository;
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		return weightersRepository.passwordValid(arg0, getLoggedWeighterUsername());
	}

	private String getLoggedWeighterUsername() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if( principal instanceof UserDetails ) {
			username = ((UserDetails) principal).getUsername();
		} else {
			username = principal.toString();
		}
		return username;
	}
}

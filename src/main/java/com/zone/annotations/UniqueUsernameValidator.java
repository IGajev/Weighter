package com.zone.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.zone.data.WeightersRepository;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

	@Autowired
	WeightersRepository weightersRepository;
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		return weightersRepository.weighterIsUnique(arg0);
	}

}

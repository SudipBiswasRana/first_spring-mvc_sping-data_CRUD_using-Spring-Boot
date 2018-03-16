package com.rana.mvc.base.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.rana.mvc.base.entities.Donor;

public class DonationValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Donor.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
	    Donor donor = (Donor) target ;
	    if(donor.getPhNo().length() < 10)
	    {
	    	errors.rejectValue("phNo" , "donor.phNo","Must Be  10 Digits Long");
	    }
	}

}

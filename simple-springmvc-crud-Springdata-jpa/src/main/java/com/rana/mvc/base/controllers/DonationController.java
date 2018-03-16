package com.rana.mvc.base.controllers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.rana.mvc.base.entities.Donor;
import com.rana.mvc.base.repositories.DonorRepository;

@Controller
@RequestMapping("/donor")
@SessionAttributes("donor")
public class DonationController {

	@Autowired
	private DonorRepository repo;

	@RequestMapping(value = "/entry", method = RequestMethod.GET)
	public String enlistDonor(Model model) {
		// In the controller, needed to add the Donor object as an attribute of the
		// model
		model.addAttribute(new Donor());
		return "enroll_form";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editData(@ModelAttribute Donor donor) {
		return "enroll_form";
	}

	@RequestMapping("/cancel")
	public String cancelEnroll(SessionStatus status) {
		status.setComplete();
		return "cancel_entry";
	}
	 
	  @ModelAttribute("donor")
	  public Donor getDonorObject()
	  {
		   return new Donor();
	  }


	@ModelAttribute("radioOptions")
	public List<String> getRadios() {
		return new LinkedList<String>(Arrays.asList(new String[] { "A", "O", "B" }));
	}

	@RequestMapping("/review")
	public String review(@ModelAttribute Donor donor) {
		return "review_donor";
	}
	
	@RequestMapping("/continue")
	public String cntd(Model model) {
		model.addAttribute(new Donor());
		return "continue";
	}

//	@ExceptionHandler(Exception.class)
//	public String handleError(HttpServletRequest request) {
//		return "controller_error";
//	}

	// @InitBinder
	// public void initBinder(WebDataBinder binder) {
	// binder.addValidators(new DonationValidator());
	// }

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveEntry(@ModelAttribute Donor donor, Errors errors, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("phNo") String phNo,
			@RequestParam("bloodTypes") String bloodTypes, SessionStatus status) {
		// @Valid
		// if(! errors.hasErrors())
		// {
		// return "phone" ;
		// }else {
		// Donor d = new Donor();
		//
		// d.setFirstName(firstName);
		// d.setLastName(lastName);
		// d.setPhNo(phNo);
		// d.setBloodTypes(bloodTypes);
		//
		// this.repo.save(d);
		// status.setComplete();
		//
		// return "redirect:/donor/entry_success" ;
		// }

		Donor d = new Donor();

		d.setFirstName(firstName);
		d.setLastName(lastName);
		d.setPhNo(phNo);
		d.setBloodTypes(bloodTypes);

		this.repo.saveAndFlush(d);
		status.setComplete();

		return "redirect:/donor/entry_success";
	}
	
	@RequestMapping(value="entry_success")
	public String dataPersistedMessage()
	{
		 return "entry_success";
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String findOnePage(Model model) {
		
		model.addAttribute("records",this.repo.findAll());
		return "findDonorJSP";
	}

	 @RequestMapping(value="delete/{id}",method=RequestMethod.DELETE)
	 public Donor delete (@PathVariable ("id") Long id)
	 {
		 Donor exisitingDonor = this.repo.findOne(id);
		 repo.delete(exisitingDonor);
		 return exisitingDonor;
	 }

}

package com.infinite.Webapp.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.infinite.Webapp.Entity.Employee;
import com.infinite.Webapp.Service.Serviceimplements;

@RestController
public class WebController {
	@Autowired
	Serviceimplements si;

	@GetMapping(value="/getAllData")  //getting the data from the table
	public ModelAndView getAllData(Model model) {
		model.addAttribute("dataclass", new Employee());
		model.addAttribute("ListOfData", si.getAllData());
		return new ModelAndView("display");
	}


	@GetMapping(value="/")  //redirecting to the  main url
	public ModelAndView goToHomePage() {
		return new ModelAndView("redirect:/getAllData");
	}

	@PostMapping("/getlogin") //getting login into the site
	public ModelAndView adddata(@Valid @ModelAttribute("emp") @RequestBody Employee emp, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result);
			return new ModelAndView("display");
		}
		si.addData(emp);
		 return new ModelAndView("login");
	}
	
}

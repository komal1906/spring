package com.cg.springmvc.controller;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvc.bean.Customer;

@Controller
public class HomeController {
	/*@RequestMapping("/homePage")
	public String displayHomePage()
	{
		
		return "Home";
	}
*/
	
	/*//for display date using simple
	@RequestMapping("/homePage")
	public String displayHomePage(Model model)
	{
		LocalDate date =LocalDate.now();
		model.addAttribute("today",date);
		return "Home";
	}
	*/
	
	//for display date using modelandview
	//@RequestMapping("/homePage")
	@RequestMapping(method=RequestMethod.GET,value="/homePage")
	public ModelAndView displayHomePage()
	{
		LocalDate date =LocalDate.now();
		ModelAndView mv=new ModelAndView();
		mv.addObject("today",date);
		mv.setViewName("Home");//logical view name
		//above 3 line can we also written as line given below
		//ModelAndView mv=new ModelAndView("Home","today",date);
		return mv;
	}
	
	
	
	/* this is done when we dont use customer class
	 * @RequestMapping("/showReg")
	public String showRegPage()
	{
		return "CustomerReg";
		
	}

	@RequestMapping("/showReguserAction")
	public String showRegCustomerDetials(@RequestParam("fname")String firstname,@RequestParam("lname")String lastname,@RequestParam("age")int age,@RequestParam("mobno")String mobno,@RequestParam("email")String email,@RequestParam("city")String city, Model model)
	{
		model.addAttribute("firstname",firstname);
		model.addAttribute("lastname",lastname);
		model.addAttribute("email",email);
		return "Success";
		
	}*/
	
	//by using customer class
	@RequestMapping("/showReg")
	public String showRegPage(Model model)
	{
		Customer customer=new Customer();
		model.addAttribute("customer",customer);
		return "CustomerReg";
		
	}
	@RequestMapping("/showReguserAction")
	public String showRegCustomerDetials(@Valid @ModelAttribute("customer")Customer customer, BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "CustomerReg";
		}
		model.addAttribute("customer",customer);
		return "Success";
	
}
}

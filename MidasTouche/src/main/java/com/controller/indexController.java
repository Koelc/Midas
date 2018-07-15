package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.models.User;

@Controller
public class indexController
{
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}

	@RequestMapping(value="/register", method = RequestMethod.GET)
	public ModelAndView showRegister()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("User", new User());// class
		mav.setViewName("register");// jsp
		return mav;
		
	}
	
	@RequestMapping(value="/saveRegister", method = RequestMethod.POST)
	public ModelAndView saveRegister(@Valid @ModelAttribute("User") User user, BindingResult result)
	{
		ModelAndView mav= new ModelAndView();
		
			mav.setViewName("/batchlaunch");
			return mav;
		}
}

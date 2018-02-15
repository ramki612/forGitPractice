package com.ram.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ram.mvc.model.Exercise;

@Controller
public class AddMinutesController {
	@RequestMapping(value="/addMinutes")
	public String sayHello(@ModelAttribute ("exercise") Exercise exercise) {
//		model.addAttribute("greeting","Hello world");
		System.out.println("exercise: "+exercise.getMinutes());
		return"addMinutes";
	}

}

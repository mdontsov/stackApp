package com.example.stack.controller;

import com.example.stack.model.StackApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StackController {

	@RequestMapping("/")
	public String stackForm(Model model) {
		model.addAttribute("welcome", new StackApp());
		return "welcome";
	}

	@RequestMapping(value = "/", params = "push", method = RequestMethod.POST)
	public String push(@ModelAttribute StackApp stackApp) {
		stackApp.doPush();
		return "welcome";
	}

	@RequestMapping(value = "/", params = "pop", method = RequestMethod.POST)
	public String pop(@ModelAttribute StackApp stackApp) {
		stackApp.doPop();
		return "welcome";
	}

	@RequestMapping(value = "/", params = "view", method = RequestMethod.POST)
	public String view(@ModelAttribute StackApp stackApp) {
		stackApp.doView();
		return "welcome";
	}

	@RequestMapping(value = "/", params = "reset", method = RequestMethod.POST)
	public String reset(@ModelAttribute StackApp stackApp) {
		stackApp.doReset();
		return "welcome";
	}
}

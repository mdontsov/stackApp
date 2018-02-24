package com.example.stack.controller;

import com.example.stack.model.StackApp;
import org.springframework.http.HttpRequest;
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

	@RequestMapping(params = "push", method = RequestMethod.PUT)
	public String push(@ModelAttribute StackApp stackApp, HttpRequest request) {
		stackApp.doPush();
		return "welcome";
	}

	@RequestMapping(params = "pop", method = RequestMethod.GET)
	public String pop(@ModelAttribute StackApp stackApp, HttpRequest request) {
		stackApp.doPop();
		return "welcome";
	}

	@RequestMapping(params = "view", method = RequestMethod.GET)
	public String view(@ModelAttribute StackApp stackApp, HttpRequest request) {
		stackApp.doView();
		return "welcome";
	}

	@RequestMapping(params = "reset", method = RequestMethod.DELETE)
	public String reset(@ModelAttribute StackApp stackApp, HttpRequest request) {
		stackApp.doReset();
		return "welcome";
	}
}

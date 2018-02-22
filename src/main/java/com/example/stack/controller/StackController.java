package com.example.stack.controller;

import com.example.stack.model.StackApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StackController {

	@RequestMapping("/showForm")
	public String stackForm() {
		return "welcome";
	}

	@RequestMapping(value = "/Operate", params = "push", method = RequestMethod.PUT)
	public String push(@ModelAttribute StackApp stackApp) {
		stackApp.doPush();
		return "welcome";
	}

	@RequestMapping(value = "/Operate", params = "pop", method = RequestMethod.POST)
	public String pop(@ModelAttribute StackApp stackApp) {
		stackApp.doPop();
		return "welcome";
	}

	@RequestMapping(value = "/Operate", params = "view", method = RequestMethod.GET)
	public String view(@ModelAttribute StackApp stackApp) {
		stackApp.doView();
		return "welcome";
	}

	@RequestMapping(value = "/Operate", params = "reset", method = RequestMethod.DELETE)
	public String reset(@ModelAttribute StackApp stackApp) {
		stackApp.doReset();
		return "welcome";
	}
}
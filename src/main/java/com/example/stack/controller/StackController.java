package com.example.stack.controller;

import com.example.stack.model.StackApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("stackApp")
public class StackController {

	@ModelAttribute("stackApp")
	public StackApp setStackForm() {
		return new StackApp();
	}

	@RequestMapping("/")
	public String stackForm() {
		return "welcome";
	}

	@RequestMapping(value = "/", params = "push", method = RequestMethod.PUT)
	public String push(@ModelAttribute("stackApp") StackApp stackApp) {
		stackApp.doPush();
		return "welcome";
	}

	@RequestMapping(value = "/", params = "pop", method = RequestMethod.POST)
	public String pop(@ModelAttribute("stackApp") StackApp stackApp) {
		stackApp.doPop();
		return "welcome";
	}

	@RequestMapping(value = "/", params = "view", method = RequestMethod.GET)
	public String view(@ModelAttribute("stackApp") StackApp stackApp) {
		stackApp.doView();
		return "welcome";
	}

	@RequestMapping(value = "/", params = "reset", method = RequestMethod.DELETE)
	public String reset(@ModelAttribute("stackApp") StackApp stackApp) {
		stackApp.doReset();
		return "welcome";
	}
}

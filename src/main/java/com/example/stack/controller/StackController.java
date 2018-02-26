package com.example.stack.controller;

import com.example.stack.OperationService;
import com.example.stack.model.StackObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("stackObject")
public class StackController {

	@Autowired
	private OperationService operationService;

	@ModelAttribute("stackObject")
	public StackObject setStackForm() {
		return new StackObject();
	}

	@RequestMapping("/")
	public String stackObject() {
		return "welcome";
	}

	@RequestMapping(value = "/")
	public String push(@ModelAttribute("stackObject") StackObject stackObject) {
		StackObject stackObject1 = operationService.operate("push");

		return "welcome";
	}

	@RequestMapping(value = "/", params = "peek", method = RequestMethod.POST)
	public String peek(@ModelAttribute("stackObject") StackObject stackObject) {

		return "welcome";
	}

	@RequestMapping(value = "/", params = "view", method = RequestMethod.GET)
	public String view(@ModelAttribute("stackObject") StackObject stackObject) {

		return "welcome";
	}

	@RequestMapping(value = "/", params = "reset", method = RequestMethod.DELETE)
	public String reset(@ModelAttribute("stackObject") StackObject stackObject) {

		return "welcome";
	}
}

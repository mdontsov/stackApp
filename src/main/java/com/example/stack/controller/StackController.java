package com.example.stack.controller;

import com.example.stack.OperationService;
import com.example.stack.model.StackObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/", params = "push", method = RequestMethod.POST)
    public String push(@ModelAttribute("stackObject") StackObject stackObject) {

        /**
         * Stack is populated but neither attached to a form nor transferred to the next request
         * Implementation is wrong
         **/
        StackObject stackObject1 = operationService.operate("push");

        return "welcome";
    }

    @RequestMapping(value = "/", params = "peek", method = RequestMethod.POST)
    public String peek(@ModelAttribute("stackObject") StackObject stackObject) {

        /**
         * EmptyStackException is caused below
         * Implementation is wrong
         **/
        StackObject stackObject1 = operationService.operate("peek");

        return "welcome";
    }

    @RequestMapping(value = "/", params = "view", method = RequestMethod.POST)
    public String view(@ModelAttribute("stackObject") StackObject stackObject) {

        /**
         * EmptyStackException is caused below
         * Implementation is wrong
         **/
        StackObject stackObject1 = operationService.operate("view");

        return "welcome";
    }

    @RequestMapping(value = "/", params = "reset", method = RequestMethod.POST)
    public String reset(@ModelAttribute("stackObject") StackObject stackObject) {

        /**
         * EmptyStackException is caused below
         * Implementation is wrong
         **/
        StackObject stackObject1 = operationService.operate("reset");

        return "welcome";
    }
}

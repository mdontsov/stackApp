package com.example.stack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.servlet.http.HttpSession;
import java.util.Random;
import java.util.Stack;

@Controller
public class StackController {

	static Stack<Integer> integerStack = new Stack<>();
	static Random random = new Random();

	@GetMapping("/")
	public String stackFormIndex(HttpSession httpSession) {
		return "stack";
	}

	@PutMapping("/stack")
	public void doPush(@ModelAttribute StackController stackController) {
		for (int i = 0; i < 10; i++) {
			int j = random.nextInt(100);
			integerStack.push(j);
		}
		System.out.println(integerStack);
	}

	@GetMapping("/stack")
	public void doView() {
		if (integerStack.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println(integerStack);
		}
	}

	@PostMapping("/stack")
	public void doPop() {
		int value = integerStack.pop();
		System.out.println(value);
	}

	@DeleteMapping("/stack")
	public void doReset() {
		integerStack.clear();
		if (integerStack.isEmpty()) {
			System.out.println("Stack is cleared");
		}
		System.out.println(integerStack);
	}
}

package com.example.stack;

import java.util.Random;
import java.util.Stack;

class StackApp {

	private Stack<Integer> integerStack = new Stack<>();
	private Random random = new Random();

	void doPush() {
		for (int i = 0; i < 10; i++) {
			int j = random.nextInt(100);
			integerStack.push(j);
			System.out.println(integerStack);
		}
	}

	void doView() {
		if (integerStack.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println(integerStack);
		}
	}

	void doPop() {
		int value = integerStack.pop();
		System.out.println(value);
	}

	void doReset() {
		integerStack.clear();
		if (integerStack.isEmpty()) {
			System.out.println("Stack is cleared");
		}
		System.out.println(integerStack);
	}
}

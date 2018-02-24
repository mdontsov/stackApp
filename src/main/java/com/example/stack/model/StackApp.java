package com.example.stack.model;

import java.util.Random;
import java.util.Stack;

public class StackApp {

    private Stack<Integer> integerStack = new Stack<>();
    private Random random = new Random();

    public void doPush() {
        for (int i = 0; i < 10; i++) {
            int j = random.nextInt(100);
            integerStack.push(j);
        }
        System.out.println(integerStack);
    }

    public void doPop() {
        int value = integerStack.pop();
        System.out.println(value);
    }

    public void doView() {
        if (integerStack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(integerStack);
        }
    }

    public void doReset() {
        integerStack.clear();
        if (integerStack.isEmpty()) {
            System.out.println("Stack is cleared");
        }
        System.out.println(integerStack);
    }
}

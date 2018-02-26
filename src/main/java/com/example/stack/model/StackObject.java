package com.example.stack.model;

import java.util.Stack;

public class StackObject {

    private Stack<Integer> integerStack = new Stack<>();
    private String content;

    public Stack<Integer> getStack() {
        return integerStack;
    }

    public void setStack(Stack<Integer> integerStack) {
        this.integerStack = integerStack;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

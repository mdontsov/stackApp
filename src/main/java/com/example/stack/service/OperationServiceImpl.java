package com.example.stack.service;

import com.example.stack.OperationService;
import com.example.stack.model.StackObject;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OperationServiceImpl implements OperationService {

	@Override
	public StackObject operate(String commandName) {
		StackObject stackObject = new StackObject();
		Random random = new Random();
		switch (commandName) {
		case "push":
			for (int i = 0; i < 10; i++) {
				int j = random.nextInt(100);
				stackObject.getStack().push(j);
			}
			break;
		case "peek":
			stackObject.getStack().peek();
			break;
		case "view":
			stackObject.getStack().toArray();
			break;
		case "reset":
			stackObject.getStack().clear();
			break;
		}

		return stackObject;
	}
}

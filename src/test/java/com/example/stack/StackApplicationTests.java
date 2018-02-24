package com.example.stack;

import com.example.stack.model.StackApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StackApplicationTests {

	private StackApp stackApp = new StackApp();

	@Test
	public void contextLoads() {
		stackApp.doPush();
		stackApp.doPop();
		stackApp.doView();
		stackApp.doReset();
	}

}

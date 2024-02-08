package com.avinash.mockito.testCases;

import java.util.Arrays;
import java.util.List;
import com.avinash.mockito.interfaces.ToDoServiceInterface;

public class ToDoServiceStub implements ToDoServiceInterface {

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Spring Batch", "Spring MVC", "Java 8");
	}

}

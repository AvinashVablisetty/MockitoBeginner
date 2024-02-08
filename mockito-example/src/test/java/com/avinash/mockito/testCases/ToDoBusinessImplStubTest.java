package com.avinash.mockito.testCases;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.avinash.mockito.impl.ToDoBusinessImpl;

public class ToDoBusinessImplStubTest {
	
	@Test
	public void testRetrieveTodosRelatedtoSpringUsingStubs() {
		ToDoServiceStub toDoServiceStub = new ToDoServiceStub();
		ToDoBusinessImpl toDoBusinessImp = new ToDoBusinessImpl(toDoServiceStub);
		List<String> filteredTodos = toDoBusinessImp.retrieveTodosRelatedToSpring("sample");
		assertEquals(2,filteredTodos.size());
	}

}

package com.avinash.mockito.testCases;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.avinash.mockito.impl.ToDoBusinessImpl;
import com.avinash.mockito.interfaces.ToDoServiceInterface;

public class ToDoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedtoSpringUsingMocks() {
		
		ToDoServiceInterface toDoServiceMock = mock(ToDoServiceInterface.class);
		List<String> sampleList = Arrays.asList("Spring Batch", "Spring MVC", "Java 8");
		when(toDoServiceMock.retrieveTodos("sample")).thenReturn(sampleList);
		
		ToDoBusinessImpl toDoBusinessImp = new ToDoBusinessImpl(toDoServiceMock);
		
		List<String> filteredTodos = toDoBusinessImp.retrieveTodosRelatedToSpring("sample");
		assertEquals(2, filteredTodos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedtoSpringUsingMocksWithEmptyList() {
		
		ToDoServiceInterface toDoServiceMock = mock(ToDoServiceInterface.class);
		List<String> sampleList = Arrays.asList("");
		when(toDoServiceMock.retrieveTodos("sample")).thenReturn(sampleList);
		
		ToDoBusinessImpl toDoBusinessImp = new ToDoBusinessImpl(toDoServiceMock);
		
		List<String> filteredTodos = toDoBusinessImp.retrieveTodosRelatedToSpring("sample");
		assertEquals(0, filteredTodos.size());
	}

}

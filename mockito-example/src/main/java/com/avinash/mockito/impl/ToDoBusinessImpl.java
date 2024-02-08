package com.avinash.mockito.impl;

import java.util.ArrayList;
import java.util.List;

import com.avinash.mockito.interfaces.ToDoServiceInterface;

public class ToDoBusinessImpl {

	private ToDoServiceInterface toDoServiceInterface;

	public ToDoBusinessImpl(ToDoServiceInterface toDoServiceInterface) {
		this.toDoServiceInterface = toDoServiceInterface;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String>toDos = toDoServiceInterface.retrieveTodos(user);
		for(String toDo: toDos) {
			if(toDo.contains("Spring")) {
				filteredTodos.add(toDo);
			}
		}
		return filteredTodos;

	}

}

package com.estf.todoapp.business;

import java.util.List;

import com.estf.todoapp.beans.Todo;
import com.estf.todoapp.dao.TodoDao;
import com.estf.todoapp.dao.TodoDaoMemory;

public class DefaultServices implements Services{

	private TodoDao todoDao;
	public DefaultServices(TodoDao todoDao) {
		this.todoDao=todoDao;
	}
	@Override
	public Todo addTodo(Todo todo) {
		return todoDao.insert(todo);
	}

	@Override
	public Todo updateTodo(Todo todo) {
		return todoDao.update(todo);
	}

	@Override
	public Todo deleteTodo(Todo todo) {
		return todoDao.delete(todo);
	}

	@Override
	public Todo getTodo(String id) {
		return todoDao.get(id);
	}

	@Override
	public List<Todo> getAllTodos() {
		return todoDao.getAll();
	}

}

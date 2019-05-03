package com.qa.TodoLogicSpring.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.qa.TodoLogicSpring.model.*;
import com.qa.TodoLogicSpring.repository.TodoItemRepository;
import com.qa.TodoLogicSpring.repository.UserRepository;
@RestController
@RequestMapping("api/v1/")
public class TodoItemController {
	@Autowired
	private TodoItemRepository todoItemRepository;
	@RequestMapping(value = "todos", method = RequestMethod.GET)
	public List<TodoItem> list(){
		return todoItemRepository.findAll();
		
		 
	}
	@RequestMapping(value = "todos", method = RequestMethod.POST)
    public TodoItem create(@RequestBody TodoItem todoItem){
        return todoItemRepository.saveAndFlush(todoItem);
    }

	@RequestMapping(value = "todos/{idTodo}", method = RequestMethod.GET)
    public TodoItem get(@PathVariable Long idTodo){
		return todoItemRepository.findOne(idTodo);
    }

	@RequestMapping(value = "todos///{idTodo}", method = RequestMethod.PUT)
    public TodoItem update(@PathVariable Long idTodo, @RequestBody TodoItem todoItem){
		TodoItem existingTodoItem = todoItemRepository.findOne(idTodo);
        BeanUtils.copyProperties(todoItem, existingTodoItem);
        return todoItemRepository.saveAndFlush(todoItem);
    }

	@RequestMapping(value = "todos/{idTodo}", method = RequestMethod.DELETE)
    public TodoItem delete(@PathVariable Long idTodo){
		TodoItem existingTodoItem = todoItemRepository.findOne(idTodo);
		todoItemRepository.delete(existingTodoItem);
        return existingTodoItem;
    }

	@RequestMapping(value = "todos//{userID}", method = RequestMethod.GET)
	public List<TodoItem> getItemsFromID(@PathVariable Long userID){
		return todoItemRepository.findByUserID(userID);
		
    }


}

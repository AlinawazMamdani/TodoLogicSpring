package com.qa.TodoLogicSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.TodoLogicSpring.model.*;

public interface TodoItemRepository extends JpaRepository <TodoItem,Long>{
	List<TodoItem> findByUserID(Long userID);

}

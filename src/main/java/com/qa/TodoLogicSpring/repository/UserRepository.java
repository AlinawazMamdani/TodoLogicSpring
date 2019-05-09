package com.qa.TodoLogicSpring.repository;

import com.qa.TodoLogicSpring.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository <User,Long>{
	List<User> findByUsername(String username);
	List<User> findByUsernameAndPassword(String username,String password);
}


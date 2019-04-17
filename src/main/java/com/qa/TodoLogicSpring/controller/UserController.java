package com.qa.TodoLogicSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.qa.TodoLogicSpring.model.*;
import com.qa.TodoLogicSpring.repository.UserRepository;
@RestController
@RequestMapping("api/v1/")
public class UserController {
	@RequestMapping(value = "users", method = RequestMethod.GET)
	public List<User> list(){
		return UserStub.list();
		 
	}
	@RequestMapping(value = "users", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return UserStub.create(user);
    }
	@RequestMapping(value = "users/{id}", method = RequestMethod.POST)
    public User get(@PathVariable Long id){
        return UserStub.get(id);
    }
	@RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
    public User update(@PathVariable Long id, @RequestBody User user){
        return UserStub.update(id, user);
    }
	@RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
    public User delete(@PathVariable Long id){
        return UserStub.delete(id);
    }
	@Autowired
	private UserRepository usersRepository;


}

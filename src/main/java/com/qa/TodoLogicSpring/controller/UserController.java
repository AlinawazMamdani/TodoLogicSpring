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
import com.qa.TodoLogicSpring.repository.UserRepository;
@RestController
@RequestMapping("api/v1/")
public class UserController {
	@RequestMapping(value = "users", method = RequestMethod.GET)
	public List<User> list(){
		return usersRepository.findAll();
		
		 
	}
	@RequestMapping(value = "users", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return usersRepository.saveAndFlush(user);
    }

	@RequestMapping(value = "users/{id}", method = RequestMethod.GET)
    public User get(@PathVariable Long id){
		return usersRepository.findOne(id);
    }

	@RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
    public User update(@PathVariable Long id, @RequestBody User user){
		User existingUser = usersRepository.findOne(id);
        BeanUtils.copyProperties(user, existingUser);
        return usersRepository.saveAndFlush(user);
    }

	@RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
    public User delete(@PathVariable Long id){
		User existingUser = usersRepository.findOne(id);
        usersRepository.delete(existingUser);
        return existingUser;
    }

	@Autowired
	private UserRepository usersRepository;


}

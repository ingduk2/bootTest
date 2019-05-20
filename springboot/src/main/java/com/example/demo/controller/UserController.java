package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="" , method = RequestMethod.GET)
	List<User> getUserList(){
		return userService.selectUserList();
	}
	
	@RequestMapping(value = "/{uid}" , method = RequestMethod.GET)
	public User getUser(@PathVariable("uid") Long uid) {
		return userService.selectUser(uid);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void insertUser(User user) {
		userService.insertUser(user);
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public void updateUser(User user) {
		userService.updateUser(user);
	}
	
	@RequestMapping(value = "/{uid}" , method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("uid") Long uid) {
		userService.deleteUser(uid);
	}
}

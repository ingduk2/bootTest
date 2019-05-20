package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.entity.User;
import com.example.demo.data.repository.UserRepository;
import com.example.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> selectUserList() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User selectUser(Long uid) {
		return userRepository.findById(uid).get();
	}

	@Override
	public void insertUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void deleteUser(Long uid) {
		userRepository.deleteById(uid);
	}

}

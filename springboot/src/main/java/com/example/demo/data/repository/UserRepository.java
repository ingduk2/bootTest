package com.example.demo.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.data.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
}

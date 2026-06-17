package com.akh.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akh.fullstack.model.User;
import com.akh.fullstack.repository.UserRepository;

@RestController
public class UserController {
 @Autowired 
 private UserRepository userRepository;
 
 @PostMapping("user")
 User newUser(@RequestBody User newUser){
	 return userRepository.save(newUser);
 }
}

package com.relation.reation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relation.reation.Entity.User;
import com.relation.reation.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping
    public List<User> index(){
        return userRepository.findAll();
    }

    @PostMapping
    public User save(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("{id}")
    public User byId(@PathVariable("id") Long id) {
        return userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not found"));
    }
    
}

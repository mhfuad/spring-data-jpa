package com.relation.reation.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relation.reation.Entity.Menu;
import com.relation.reation.repository.MenuRepository;

import lombok.Builder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Builder
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuRepository menuRepository;

    @GetMapping("/")
    public List<Menu> index() {
        return menuRepository.findAll();
    }

    @PostMapping("/save")
    public String save(){
        return "save";
    }
    

}

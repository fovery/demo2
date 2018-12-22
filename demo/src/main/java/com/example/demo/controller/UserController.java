package com.example.demo.controller;

import com.example.demo.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserJpa userJpa;
    @RequestMapping("list")
    public List<UserEntity> list(){
      return userJpa.findAll();
    }
    @RequestMapping("save")
    public UserEntity save(UserEntity u ){
        return userJpa.save(u);
    }
    @RequestMapping("delete")
    public List<UserEntity> delete(Integer id){
      userJpa.deleteById(id);
      return userJpa.findAll();
    }

}

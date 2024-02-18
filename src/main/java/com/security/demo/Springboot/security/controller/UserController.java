package com.security.demo.Springboot.security.controller;

import com.security.demo.Springboot.security.models.User;
import com.security.demo.Springboot.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// create 3 methods   in services  1. getAllUser 2. getUser 3. addUser
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // all users
    @GetMapping("/")
    public List<User> getAllUsers(){
        return this.userService.getAllUser();
    }

    // return single user
    public User getuser(@PathVariable ("username") String username){
        return (User) this.userService.getUser(username);
    }

    // add user
    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

}

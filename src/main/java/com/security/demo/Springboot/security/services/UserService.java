package com.security.demo.Springboot.security.services;

import com.security.demo.Springboot.security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
   List<User> list = new ArrayList<>();

  public UserService(){
      list.add(new User("abd","pass@123","abd@gmail.com"));
      list.add(new User("xyz","abc@123","xyz@gmail.com"));

  }
 // get All User
    public  List<User> getAllUser(){
      return  list;
    }
    // get singal user
    public List<User> getUser(String username){
      return (List<User>) this.list.stream().filter((user)->user.getUserName().equals(username)).findAny().orElse(null);
    }
    // add user
    public User addUser(User user){
      this.list.add(user);
      return user;
    }
}

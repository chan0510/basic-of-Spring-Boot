package com.example.basicSpringBoot.Controller;

import com.example.basicSpringBoot.Model.User;
import com.example.basicSpringBoot.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
   @PostMapping("/add-user")
    public  String addUser(@RequestBody User user){
       return userService.addUser(user);
   }
   @GetMapping("/get-all-user")
    public List<User> getAllUser(){
       return userService.getAllUser();
   }
   @GetMapping("/get-user-by-id")
    public User getUser(@RequestParam("id")int id){
       return userService.getUser(id);
   }
   @PutMapping("/update-user-name-by-id")
    public User updateUserById(@RequestParam("id")int id,@RequestParam("name")String name){
       return userService.updateUserById(id,name);
   }
   @DeleteMapping("delete-user-by-id")
    public String deleteUserById(@RequestParam("id")int id){
       return userService.deleteUserById(id);
   }
   @DeleteMapping("delete-all-user")
    public String deleteAllUser(){
       return  userService.deleteAllUser();
   }
}

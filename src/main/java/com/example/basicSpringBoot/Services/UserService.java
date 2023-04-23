package com.example.basicSpringBoot.Services;

import com.example.basicSpringBoot.Model.User;
import com.example.basicSpringBoot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public  String addUser(User user){
        userRepository.save(user);
        return "User added";
    }
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    public User getUser(int id){
        return userRepository.findById(id).get();
    }
    public User updateUserById(int id,String name){
        User u=userRepository.findById(id).get();
        u.setName(name);
        userRepository.save(u);
        return userRepository.findById(id).get();
    }
    public String deleteUserById(int id){
        userRepository.deleteById(id);
        return "User deleted ";
    }
    public String deleteAllUser(){
        userRepository.deleteAll();
        return " all User deleted";
    }
}

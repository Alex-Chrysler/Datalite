package com.example.Datalite.controllers;

import com.example.Datalite.entities.User;
import com.example.Datalite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }

//    @PostMapping("/addUser")
//    public String saveUser(@RequestBody User user){
//        repository.save(user);
//        return "Added user with id: "+ user.getId();
//    }

    @CrossOrigin
    @GetMapping("/findAllUsers")
    public List<User> getUsers(){
        return repository.findAll();
    }

    @CrossOrigin
    @PostMapping("/findAllUsers")
    public String saveUser(@RequestBody User user){
        repository.save(user);
        return "Added user with id: "+ user.getId();
    }

    @GetMapping("/findAllUsers/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id){
        repository.deleteById(id);
        return "user deleted with id : "+id;
    }

}

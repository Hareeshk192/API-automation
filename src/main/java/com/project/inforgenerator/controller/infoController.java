package com.project.inforgenerator.controller;

import com.project.inforgenerator.entities.users;
import com.project.inforgenerator.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class infoController {
    @Autowired
    private userService userservice;
    @GetMapping("/users")
    public List<users> getUsers()
    {
        return this.userservice.getUsers();
    }
    @GetMapping("/users/{userId}")
    public users getUser(@PathVariable String userId)
    {
     return this.userservice.getUser(Long.parseLong(userId));
    }
    @PostMapping("/users")
    public users addUser(@RequestBody users user)
    {
        return this.userservice.addUser(user);
    }
}

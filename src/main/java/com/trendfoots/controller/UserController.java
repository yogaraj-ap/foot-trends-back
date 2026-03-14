package com.trendfoots.controller;

import com.trendfoots.entity.User;
import com.trendfoots.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    // GET USER PROFILE
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    // UPDATE USER PROFILE
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id,
                           @RequestBody User user){

        return userService.updateUser(id, user);
    }
}
package com.example.demotests.controller;

import com.example.demotests.factory.UserFactory;
import com.example.demotests.model.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok().body(UserFactory.getUsersTestsList());
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserModel user) {
        return ResponseEntity.ok().body(user);
    }
}

package com.example.demotests.service;

import com.example.demotests.model.UserModel;
import com.example.demotests.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    public UserModel create(UserModel user) {
        return repository.save(user);
    }

    public List<UserModel> findAll() {
        return repository.findAll();
    }

    public Optional<UserModel> findById(String id) {
        return repository.findById(id);
    }
}

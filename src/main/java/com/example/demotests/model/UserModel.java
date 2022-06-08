package com.example.demotests.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserModel {

    private String id;

    private String name;

    private int age;
}

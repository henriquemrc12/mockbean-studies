package com.example.demotests.factory;

import com.example.demotests.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserFactory {

    public static UserModel getUserTests() {
        return new UserModel("12312312-fdfsdfdsf-34234234-sdfsdfsd", "Henrique",12);
    }

    public static List<UserModel> getUsersTestsList() {
        List<UserModel> userModelList = new ArrayList<>();

        userModelList.add(new UserModel("12312312-fdfsddsds11-fdfd9f-sdfsdfsd", "Rafael", 12));
        userModelList.add(new UserModel("12312312-fd12kk2fdsf-34234234-sdfsdfsd", "Marcelo", 22));
        userModelList.add(new UserModel("12312312-fdfsd1231f-34234234-sdfsdfsd", "Thiago", 35));

        return userModelList;
    }
}

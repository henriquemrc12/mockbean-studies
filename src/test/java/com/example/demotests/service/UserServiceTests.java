package com.example.demotests.service;

import com.example.demotests.factory.UserFactory;
import com.example.demotests.model.UserModel;
import com.example.demotests.repository.UserRepository;
import com.example.demotests.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
public class UserServiceTests {

    @TestConfiguration
    static class TestConfig {

        @Bean
        public UserService createService() {
            return new UserService();
        }
    }

    @Autowired
    UserService service;

    @MockBean
    UserRepository repository;

    @Test
    public void shouldCreateUserAndThenReturnUserCreated() {
        UserModel user = UserFactory.getUserTests();
        Assertions.assertEquals(user, service.create(user));
    }

    @Test
    public void shouldReturnAllUsers() {
        List<UserModel> userModelList = UserFactory.getUsersTestsList();
        Assertions.assertEquals(userModelList, service.findAll());
    }

    @Test
    public void shouldReturnUserById() {
        UserModel user = UserFactory.getUserTests();
        Assertions.assertEquals(user, service.findById(user.getId()).get());
    }

    @Before
    public void setup() {

        UserModel user = UserFactory.getUserTests();

        List<UserModel> userModelList = UserFactory.getUsersTestsList();

        Mockito.when(repository.save(user))
                .thenReturn(user);

        Mockito.when(repository.findById(user.getId()))
                .thenReturn(Optional.of(user));

        Mockito.when(repository.findAll())
                .thenReturn(userModelList);
    }
}

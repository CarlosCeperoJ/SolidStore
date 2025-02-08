package com.microservice.users.service;

import com.microservice.users.entity.User;
import com.microservice.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void crearUser (User user){

        userRepository.save(user);


    }




}

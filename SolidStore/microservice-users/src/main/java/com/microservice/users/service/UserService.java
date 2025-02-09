package com.microservice.users.service;

import com.microservice.users.dto.UserDto;
import com.microservice.users.entity.User;
import com.microservice.users.mapper.UserMapper;
import com.microservice.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public void crearUser (UserDto userDto){

        User user = userMapper.toEntity(userDto);

        userRepository.save(user);

    }


    public UserDto actualizarUsuario(int id, UserDto userDto){

        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("El usuario no se encontró") );

        user.setNombre(userDto.getNombre());
        user.setCorreo(userDto.getCorreo());
        user.setContrasena(userDto.getContrasena());
        user.setRol(userDto.getRol());

        User userActualizado = userRepository.save(user);

        return userMapper.toDto(userActualizado);

    }



}

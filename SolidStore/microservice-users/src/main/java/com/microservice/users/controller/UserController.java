package com.microservice.users.controller;

import com.microservice.users.dto.UserDto;
import com.microservice.users.entity.User;
import com.microservice.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/crearUsuario")
    public ResponseEntity<String> crearUsuario(@RequestBody UserDto userDto){

        userService.crearUser(userDto);

        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado exitosamente");

    }

    @PutMapping("/actualizarUsuario/{id}")
    public ResponseEntity<UserDto> actualizarUsuario(@PathVariable int id,@RequestBody UserDto userDto){

        UserDto userActualizado = userService.actualizarUsuario(id,userDto);

        return new ResponseEntity<>(userActualizado,HttpStatus.OK);
    }



}

package com.microservice.users.mapper;

import com.microservice.users.dto.UserDto;
import com.microservice.users.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .nombre(userDto.getNombre())
                .correo(userDto.getCorreo())
                .contrasena(userDto.getContrasena())
                .rol(userDto.getRol())
                .estado(userDto.getEstado())
                .build();
    }

    //Tambien se puede así
    /*
    public User toEntityy(UserDto userDto){

        User user = new User(userDto.getId(), userDto.getNombre(),userDto.getCorreo(),userDto.getContrasena() ,userDto.getRol(), userDto.getEstado());
        return user;
    }

     */

    //Metodo toDto sin el builder
    /*
    public UserDto toDto (User user){

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setNombre(user.getNombre());
        userDto.setCorreo(user.getCorreo());
        userDto.setContrasena(user.getContrasena());
        userDto.setEstado(user.getEstado());
        userDto.setRol(user.getRol());

        return userDto;
    }

     */


    public UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .nombre(user.getNombre())
                .correo(user.getCorreo())
                .contrasena(user.getContrasena())
                .estado(user.getEstado())
                .rol(user.getRol())
                .build();
    }
}

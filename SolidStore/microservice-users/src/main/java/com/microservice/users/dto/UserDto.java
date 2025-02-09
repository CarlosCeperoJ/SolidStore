package com.microservice.users.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    private int id;

    private String nombre;

    private String correo;

    private String contrasena;

    private String rol;

    private String estado;

}

package com.login.login.servicios.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.login.login.dto.UsuarioDTO;
import com.login.login.modelos.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(source = "rol.nombreRol", target = "rol")
    public UsuarioDTO toUsuarioDTO(Usuario usuario);

    @Mapping(target = "authorities", ignore = true)
    public Usuario toUsuario(UsuarioDTO usuarioDTO);

}
package com.login.login.servicios;

import com.login.login.dto.UsuarioDTO;
import com.login.login.dto.UsuarioLoginDTO;

public interface UsuarioService  {
    public UsuarioDTO login(UsuarioLoginDTO usuarioLoginDTO);

    public UsuarioDTO crear(UsuarioDTO usuarioDTO) throws Exception;


}
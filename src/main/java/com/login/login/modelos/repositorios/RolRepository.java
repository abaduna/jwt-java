package com.login.login.modelos.repositorios;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.login.login.modelos.NombreRol;
import com.login.login.modelos.Rol;


public interface RolRepository extends CrudRepository<Rol, Long> {
    Optional<Rol> findByNombreRol(NombreRol nombreRol);
}

package com.alurachallenge.ForoHub.Dominio.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;


public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    UserDetails findBylogin(String username);
}

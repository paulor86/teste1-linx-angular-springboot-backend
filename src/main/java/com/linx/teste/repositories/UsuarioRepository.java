package com.linx.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linx.teste.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {

}

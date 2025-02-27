package com.reqhub.reqhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.reqhub.reqhub.domain.Usuario;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    Optional<Usuario> findByNome(String nome);
}

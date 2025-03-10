package com.reqhub.reqhub.repository;

import com.reqhub.reqhub.domain.Authority;
import com.reqhub.reqhub.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByUsuarioAndAuthority(Usuario usuario, String authority);
}
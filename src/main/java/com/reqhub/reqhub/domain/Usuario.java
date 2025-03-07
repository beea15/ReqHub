package com.reqhub.reqhub.domain;

import java.util.List;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "USUARIOS")
public class Usuario extends AbstractEntity<Long> {

    @Column(nullable = false, unique = true, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(length = 4, nullable = true)
    private String ramal;

    @ManyToOne
    @JoinColumn(name = "setor_id", nullable = false)
    private Setor setor;

    @OneToMany(mappedBy = "usuario")
    private List<Authority> authorities;

    @Column(nullable = true, length = 10)
    private String senha;

    public Usuario() {}

    
    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getRamal() { return ramal; }
    public void setRamal(String ramal) { this.ramal = ramal; }
    public Setor getSetor() { return setor; }
    public void setSetor(Setor setor) { this.setor = setor;
    
     if (setor.getNome().equals("TI")) {
    	 this.authorities.add(new Authority("ADMIN", this));
    	 
     } else {
    	 this.authorities.add(new Authority("USER", this));
     }
    
    }
  
}
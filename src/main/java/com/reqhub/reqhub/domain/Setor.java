package com.reqhub.reqhub.domain;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "SETORES")
public class Setor extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    public Setor() {}

    public Setor(String nome) {
        this.nome = nome.trim();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = (nome != null) ? nome.trim() : null; }
}
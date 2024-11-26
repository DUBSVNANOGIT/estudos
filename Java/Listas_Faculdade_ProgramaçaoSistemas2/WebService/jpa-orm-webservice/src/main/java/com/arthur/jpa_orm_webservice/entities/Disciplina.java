package com.arthur.jpa_orm_webservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "disciplinas")
public class Disciplina {
    
    @Id
    private long id;
    private String nome;
    private String sigla;
    private int semestre;
    
    public Disciplina(long id, String nome, String sigla, int semestre) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.semestre = semestre;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    
}

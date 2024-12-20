package com.arthur.jpa_orm_webservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "professores")
public class Professor {
    @Id
    private long id;
    private String nome;
    private int matricula;
    private String area;

    public Professor(){};

    public Professor (long id, String n, int m, String a) {
        this.id = id;
        this.nome = n;
        this.matricula = m;
        this.area = a;
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
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    
}
package com.arthur.jpa_orm_webservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.arthur.jpa_orm_webservice.entities.Disciplina;

public interface DisciplinaDAO extends CrudRepository<Disciplina, Long> {
    
}

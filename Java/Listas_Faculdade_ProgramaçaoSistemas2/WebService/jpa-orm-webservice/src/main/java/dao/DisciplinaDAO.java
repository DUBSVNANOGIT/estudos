package dao;

import org.springframework.data.repository.CrudRepository;

import entities.Disciplina;

public interface DisciplinaDAO extends CrudRepository<Disciplina, Long> {
    
}

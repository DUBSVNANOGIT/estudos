package com.arthur.jpa_orm_webservice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.arthur.jpa_orm_webservice.dao.DisciplinaDAO;
import com.arthur.jpa_orm_webservice.entities.Disciplina;

import jakarta.annotation.PostConstruct;

@RestController
public class DisciplinaController {

    @Autowired
    private DisciplinaDAO disciplinaDao;

    @GetMapping("/api/disciplinas")
    public Iterable<Disciplina> getDisciplinas() {
        return disciplinaDao.findAll();
    }

    @GetMapping("/api/disciplinas/{id}")
    public Optional<Disciplina> getDisciplina(@PathVariable long id) {
        return disciplinaDao.findById(id);
    }

    @PostMapping("/api/disciplinas")
    public Disciplina createDisciplina(Disciplina d) {
        Disciplina createdDisc = disciplinaDao.save(d);
        return createdDisc;
    }

    Optional<Disciplina> updateProfessor (@RequestBody Disciplina disciplinaRequest,
    @PathVariable long disciplinaId) {
        Optional<Disciplina> opt = this.getDisciplina(disciplinaId);
        if (opt.isPresent()) {
            Disciplina disciplina = opt.get();
            if (disciplinaRequest.getId() == disciplina.getId()) {
                disciplina.setNome(disciplinaRequest.getNome());
                disciplina.setSigla(disciplinaRequest.getSigla());
                disciplina.setSemestre((disciplinaRequest.getSemestre()));
                disciplinaDao.save(disciplina);
                return opt;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,
        "Erro ao alterar dados do professor com id" + disciplinaId);
}
}
package com.arthur.jpa_orm_webservice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.arthur.jpa_orm_webservice.dao.ProfessorDAO;
import com.arthur.jpa_orm_webservice.entities.Professor;

@RestController
public class ProfessorController {
    @Autowired
    private ProfessorDAO professorDao;

    public ProfessorController(){}

    @GetMapping("/api/professores")
    public Iterable<Professor> getProfessores() {
        return professorDao.listarProfessores();
    }

    @GetMapping("/api/professores/{id}")
    Optional<Professor> getProfessor(@PathVariable long id) {
        return professorDao.buscarPorId(id);
    }

    @PostMapping("/api/professores")
    public Professor createProfessor(@RequestBody Professor p) {
        Professor createdProf = professorDao.create(p);
        return createdProf;
    }

    Optional<Professor> updateProfessor (@RequestBody Professor professorRequest,
    @PathVariable long professorId) {
        Optional<Professor> opt = this.getProfessor(professorId);
        if (opt.isPresent()) {
            Professor professor = opt.get();
            if (professorRequest.getId() == professor.getId()) {
                professor.setNome(professorRequest.getNome();
                professor.setMatricula(professorRequest.getMatricula());
                professor.setArea(professorRequest.getArea());
                professorDao.create(professor);
                return opt;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,
        "Erro ao alterar dados do professor com id" + professorId);

    }


}
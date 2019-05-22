package br.utfpr.architecture.controllers;

import java.util.Set;

import br.utfpr.architecture.DAO.SolicitarSubstituicaoDAO;
import br.utfpr.architecture.Entity.Alunos;
import br.utfpr.architecture.Entity.Anuencia;
import br.utfpr.architecture.Entity.Professor;
import br.utfpr.architecture.Entity.SolicitarSubstituicao;

/**
 * professorController
 */
public class ProfessorController {

    Anuencia anuencia;
    Professor professor;
    
    public void solicitarSubstituicao(SolicitarSubstituicao solicitarSubstituicao) {
        anuencia = new Anuencia();
        Disciplina disciplina = solicitarSubstituicao.getDisciplina();
        Set<Alunos> alunos = disciplina.getAlunos();
        for(int i = 0; i < alunos.lenght(); i++){
            alunos.toArray()[i].assinarAnuencia(anuencia);
        }
        
    }
}
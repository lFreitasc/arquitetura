package br.utfpr.architecture.controllers;

import java.util.Set;

import br.utfpr.architecture.DAO.SolicitarSubstituicaoDAO;
import br.utfpr.architecture.Entity.Alunos;
import br.utfpr.architecture.Entity.Anuencia;
import br.utfpr.architecture.Entity.Coordenador;
import br.utfpr.architecture.Entity.Professor;
import br.utfpr.architecture.Entity.SolicitarSubstituicao;

/**
 * professorController
 */
public class ProfessorController {

    Anuencia anuencia;
    Professor professor;
    
    public void solicitarSubstituicao(SolicitarSubstituicao solicitarSubstituicao, Coordenador coordenador) {
        anuencia = new Anuencia();
        Disciplina disciplina = solicitarSubstituicao.getDisciplina();
        Set<Alunos> alunos = disciplina.getAlunos();
        for(int i = 0; i < alunos.lenght(); i++){
            alunos.toArray()[i].assinarAnuencia(anuencia);
        }
        
        if( alunos.size() / anuencia.getAlunos().size() >= 0.75){
            coordenador.novaSolicitacao(solicitarSubstituicao);
        }else{
            throw new Exception("Min alunos não atingido");
        }
    }
}
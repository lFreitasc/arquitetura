package br.utfpr.architecture.models;

import java.util.Set;

import br.utfpr.architecture.DAO.SubstituicaoDAO;
import br.utfpr.architecture.Entity.Alunos;
import br.utfpr.architecture.Entity.Anuencia;
import br.utfpr.architecture.Entity.Coordenador;
import br.utfpr.architecture.Entity.Disciplina;
import br.utfpr.architecture.Entity.Presenca;
import br.utfpr.architecture.Entity.Professor;
import br.utfpr.architecture.Entity.Substituicao;

/**
 * professorController
 */
public class ProfessorController {

    Anuencia anuencia;
    Professor professor;
    
    public void solicitarSubstituicao(Substituicao solicitarSubstituicao) {
        anuencia = new Anuencia();
        Disciplina disciplina = solicitarSubstituicao.getDisciplina();
        Set<Alunos> alunos = disciplina.getAlunos();
        for(int i = 0; i < alunos.lenght(); i++){
            alunos.toArray()[i].assinarAnuencia(anuencia);
        }
        
        if( alunos.size() / anuencia.getAlunos().size() >= 0.75){
            professor.getCoordenador().novaSolicitacao(solicitarSubstituicao);
        }else{
            throw new Exception("Min alunos não atingido");
        }
    }

    public void comprovarAula(Presenca presenca, Disciplina disciplina){
        for (Alunos aluno : disciplina.getAlunos()) {
            aluno.assinarPresenca(presenca);
            professor.getCoordenador.comprovanteAula(presenca, disciplina, professor);
        }
    }
}
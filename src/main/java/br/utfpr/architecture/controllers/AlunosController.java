package br.utfpr.architecture.controllers;

import br.utfpr.architecture.Entity.Alunos;
import br.utfpr.architecture.Entity.Anuencia;

/**
 * AlunosController
 */
public class AlunosController {

    Alunos aluno = new Alunos();

    private void assinarAnuencia(Anuencia anuencia){
        if(this.aluno.getPresenca() >= 0.75){
            anuencia.getAlunos().add(this.aluno);
        }
        
    }
}
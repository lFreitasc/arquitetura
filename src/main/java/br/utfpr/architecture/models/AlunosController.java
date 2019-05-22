package br.utfpr.architecture.models;

import br.utfpr.architecture.Entity.Alunos;
import br.utfpr.architecture.Entity.Anuencia;

/**
 * AlunosController
 */
public class AlunosController {

    private Alunos alunos;

    public AlunosController(Alunos alunos){
        this.alunos = alunos;
    }

    private void assinarAnuencia(Anuencia anuencia){
        if(this.aluno.getPresenca() >= 0.75){
            anuencia.getAlunos().add(this.aluno);
        }
        
    }

    private void assinarPresenca(Presenca presenca){
        presenca.getPresenca().add(this.alunos);
    }
}
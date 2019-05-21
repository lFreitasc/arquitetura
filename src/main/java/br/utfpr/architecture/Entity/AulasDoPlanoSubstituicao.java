package br.utfpr.architecture.Entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AulasDoPlanoSubstituicao implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idAulaPlanoSubstituicao;
    private String dataDaAulaSubstituida;
    private String quantidadeDeAulas;

    @OneToOne
    private SolicitacaoPlanoDeSubstituicao planoDeAula;


    @ManyToOne    
    private Professor professorSubstituto;


    @ManyToOne
    private Turma turma;
    
    
   
}

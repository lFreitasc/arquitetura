package br.utfpr.architecture.Entity;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
    @Id @GeneratedValue
    private Long idAulaPlanoSubstituicao;
    private String dataDaAulaSubstituida;
    private String horaDaAulaProposta;
    private String horarioAulaProposta;
    private String quantidadeDeAulas;
    private String quantidadeTotaldeAulas;

    private Long idPlanoDeAula;
    private Long idProfessorSubstituto;
    private Long idTurma;
    
    
   
}

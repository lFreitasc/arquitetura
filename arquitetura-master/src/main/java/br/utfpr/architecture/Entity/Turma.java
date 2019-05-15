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
public class Turma implements Serializable {
    @Id @GeneratedValue
    private Long idTurma;
    private String nomeTurma;
    private String idCurso;
    private String idDisciplina;
    private String idSala;
    
}

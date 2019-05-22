package br.utfpr.architecture.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
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
public class Professor implements Serializable{

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idProfessor;
    private String nome;
    private String funcao;

    private Coordenador coordenador;

    @OneToMany
    private Set<Disciplina> disciplinas;

}
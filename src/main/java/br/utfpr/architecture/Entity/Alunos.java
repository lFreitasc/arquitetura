package br.utfpr.architecture.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Alunos
 */

 @Data
 @Builder
 @NoArgsConstructor
 @AllArgsConstructor
 @Entity
public class Alunos implements Serializable{
    @Id
    private int ra;

    private String nome;
    private float presenca;

    @ManyToMany
    private Set<Disciplina> discipinas;
}
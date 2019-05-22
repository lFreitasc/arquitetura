package br.utfpr.architecture.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * anuencia
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Anuencia implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    
    @ManyToMany
    private Set<Alunos> alunos;
}
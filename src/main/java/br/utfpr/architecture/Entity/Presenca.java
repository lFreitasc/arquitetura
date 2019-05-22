package br.utfpr.architecture.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Presenca
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Presenca implements Serializable {
    
    @Id
    @GeneratedValue
    private Long Id;

    @OneToMany
    private Disciplina disciplina;

    @ManyToMany
    private Set<Alunos> presenca;
    
}
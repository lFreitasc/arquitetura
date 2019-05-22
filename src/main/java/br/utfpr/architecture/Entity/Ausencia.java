package br.utfpr.architecture.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Ausencia
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ausencia implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    Professor professor;

    private String procedimento;
}
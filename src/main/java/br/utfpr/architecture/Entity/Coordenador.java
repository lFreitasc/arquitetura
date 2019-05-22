package br.utfpr.architecture.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Coordenador
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Coordenador implements Serializable{
    
    @Id 
    @GeneratedValue
    private Long id;
    private String nome;
    
}
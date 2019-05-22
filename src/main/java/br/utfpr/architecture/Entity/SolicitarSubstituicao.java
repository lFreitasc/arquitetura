package br.utfpr.architecture.Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class SolicitarSubstituicao implements Serializable {
    @Id 
    @GeneratedValue
    private Long id;

    @Temporal (TemporalType.DATE)
    private Date dateSsubstituicao;
    
    @ManyToOne
    private Professor requerente;
    
    @ManyToOne
    private Professor substituto;
    
    @ManyToOne
    private Coordenador coordenador;

    private Estados estado;

    @OneToOne
    private Disciplina disciplina;
   
}
package br.utfpr.architecture.Entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Sala implements Serializable {
    @Id @GeneratedValue
    private Long idSala;
    private String codigoSala;
    private String blocoSala;
    
   
}

package br.utfpr.architecture.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.utfpr.architecture.Entity.Ausencia;

/**
 * AusenciaDAO
 */
public interface AusenciaDAO extends JpaRepository<Ausencia,Long>{}

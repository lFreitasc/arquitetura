package br.utfpr.architecture.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.utfpr.architecture.Entity.Anuencia;

/**
 * anuenciaDAO
 */
public interface AnuenciaDAO extends JpaRepository<Anuencia, Long>{}
package br.utfpr.architecture.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.utfpr.architecture.Entity.Presenca;

/**
 * PresencaDAO
 */
public interface PresencaDAO extends JpaRepository<Presenca, Long> {

    
}
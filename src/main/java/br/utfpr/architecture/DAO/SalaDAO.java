package br.utfpr.architecture.DAO;

import br.utfpr.architecture.Entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaDAO extends JpaRepository<Sala, Long>{}
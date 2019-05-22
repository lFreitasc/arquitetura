package br.utfpr.architecture.DAO;

import br.utfpr.architecture.Entity.Coordenador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordenadorDAO extends JpaRepository<Coordenador, Long>{}
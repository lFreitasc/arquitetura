package br.utfpr.architecture.DAO;

import br.utfpr.architecture.Entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaDAO extends JpaRepository<Disciplina, Long>{}
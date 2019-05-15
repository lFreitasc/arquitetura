package br.utfpr.architecture.DAO;

import br.utfpr.architecture.Entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoDAO extends JpaRepository<Departamento, Long>{}
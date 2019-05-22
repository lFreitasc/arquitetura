package br.utfpr.architecture.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.utfpr.architecture.Entity.Alunos;

/**
 * AlunosDAO
 */
public interface AlunosDAO extends JpaRepository<Alunos,Integer>{}
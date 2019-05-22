package br.utfpr.architecture.DAO;

import br.utfpr.architecture.Entity.Substituicao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubstituicaoDAO extends JpaRepository<Substituicao, Long>{}

package com.aula.backend.database;

import com.aula.backend.entidade.projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProjeto extends JpaRepository <projeto, Long> {


}

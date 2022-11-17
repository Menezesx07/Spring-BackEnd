package com.aula.backend.rest;


import com.aula.backend.database.RepositorioProjeto;
import com.aula.backend.entidade.projeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projeto")
public class RestApi {

    @Autowired
    private RepositorioProjeto repositorio;

    @PostMapping
    public void salvar(@RequestBody projeto entidade) {
        repositorio.save(entidade);
    }

    @GetMapping
    public List<projeto> listar() {
        return repositorio.findAll();
    }



}

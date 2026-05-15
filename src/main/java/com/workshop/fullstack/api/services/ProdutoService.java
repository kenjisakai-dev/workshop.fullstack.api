package com.workshop.fullstack.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.fullstack.api.models.Produto;
import com.workshop.fullstack.api.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;
    
    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }
}

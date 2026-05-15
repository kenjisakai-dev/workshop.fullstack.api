package com.workshop.fullstack.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.fullstack.api.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}

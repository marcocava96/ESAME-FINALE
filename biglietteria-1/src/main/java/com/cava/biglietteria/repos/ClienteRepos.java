package com.cava.biglietteria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cava.biglietteria.entities.Cliente;

public interface ClienteRepos extends JpaRepository<Cliente, Integer> {

}

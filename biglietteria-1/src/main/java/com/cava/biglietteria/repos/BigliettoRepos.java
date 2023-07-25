package com.cava.biglietteria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cava.biglietteria.entities.Biglietto;

public interface BigliettoRepos extends JpaRepository<Biglietto, Integer> {

}

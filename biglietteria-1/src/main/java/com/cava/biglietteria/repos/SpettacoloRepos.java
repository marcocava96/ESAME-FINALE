package com.cava.biglietteria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cava.biglietteria.entities.Spettacolo;

public interface SpettacoloRepos extends JpaRepository<Spettacolo, Integer> {

}

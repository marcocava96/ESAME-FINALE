package com.cava.biglietteria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cava.biglietteria.entities.Spettacolo;
import com.cava.biglietteria.repos.SpettacoloRepos;
import com.cava.biglietteria.repos.TeatroRepos;

@Service
public class SpettacoloService {

	@Autowired
	private SpettacoloRepos repos;

	public List<Spettacolo> findAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	public Spettacolo save(Spettacolo spettacolo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Spettacolo update(int id, Spettacolo updateSpettacolo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}// fine classe

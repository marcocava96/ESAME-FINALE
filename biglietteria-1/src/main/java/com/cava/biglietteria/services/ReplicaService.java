package com.cava.biglietteria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cava.biglietteria.entities.Replica;
import com.cava.biglietteria.entities.Spettacolo;
import com.cava.biglietteria.repos.ReplicaRepos;
import com.cava.biglietteria.repos.SpettacoloRepos;
import com.cava.biglietteria.repos.TeatroRepos;

@Service
public class ReplicaService {

	@Autowired
	private ReplicaRepos repos;

	public List<Replica> findAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	public Replica save(Replica replica) {
		// TODO Auto-generated method stub
		return null;
	}

	public Replica update(int id, Replica updateReplica) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}// fine classe

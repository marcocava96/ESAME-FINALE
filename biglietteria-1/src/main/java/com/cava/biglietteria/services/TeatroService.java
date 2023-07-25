package com.cava.biglietteria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cava.biglietteria.entities.Teatro;
import com.cava.biglietteria.repos.TeatroRepos;

@Service
public class TeatroService {

	@Autowired
	private TeatroRepos repos;

	public List<Teatro> findAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	public Teatro save(Teatro teatro) {
		// TODO Auto-generated method stub
		return null;
	}

	public Teatro update(int id, Teatro updatedTeatro) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}// fine classe

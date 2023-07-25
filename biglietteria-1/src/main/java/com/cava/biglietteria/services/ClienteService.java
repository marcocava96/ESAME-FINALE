package com.cava.biglietteria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cava.biglietteria.entities.Cliente;
import com.cava.biglietteria.repos.ClienteRepos;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepos repos;

	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cliente update(int id, Cliente updatedCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}// fine classe

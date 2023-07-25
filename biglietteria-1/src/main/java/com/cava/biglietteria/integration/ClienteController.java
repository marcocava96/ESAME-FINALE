package com.cava.biglietteria.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cava.biglietteria.entities.Cliente;
import com.cava.biglietteria.services.ClienteService;

@RestController
@RequestMapping("clienti")
public class ClienteController {

	@Autowired
	private ClienteService clientiServices;

	
	@CrossOrigin(origins = "*")
	@GetMapping(value = "tutti")
	public List<Cliente> getClienti() {
		return clientiServices.findAll();
	}

	@CrossOrigin(origins = "*")
	@PostMapping
	public Cliente createClient(@RequestBody Cliente cliente) {
		return clientiServices.save(cliente);
	}

	@CrossOrigin(origins = "*")
	@PutMapping("/{id}")
	public Cliente updateClient(@PathVariable int id, @RequestBody Cliente updatedCliente) {
		return clientiServices.update(id, updatedCliente);
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("/{id}")
	public void deleteClient(@PathVariable int id) {
		clientiServices.delete(id);
	}

}// fine

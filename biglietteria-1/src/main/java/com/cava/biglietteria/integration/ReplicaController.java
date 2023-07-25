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

import com.cava.biglietteria.entities.Replica;
import com.cava.biglietteria.entities.Spettacolo;
import com.cava.biglietteria.entities.Teatro;
import com.cava.biglietteria.services.ReplicaService;
import com.cava.biglietteria.services.TeatroService;

@RestController
@RequestMapping("repliche")
public class ReplicaController {

	@Autowired
	private ReplicaService replicaService;

	
	@CrossOrigin(origins = "*")
	@GetMapping(value = "tutti")
	public List<Replica> getRepliche() {
		return replicaService.findAll();
	}

	@CrossOrigin(origins = "*")
	@PostMapping
	public Replica createReplica(@RequestBody Replica replica) {
		return replicaService.save(replica);
	}

	@CrossOrigin(origins = "*")
	@PutMapping("/{id}")
	public Replica updateReplica(@PathVariable int id, @RequestBody Replica updateReplica) {
		return replicaService.update(id, updateReplica);
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping("/{id}")
	public void deleteReplica(@PathVariable int id) {
		replicaService.delete(id);
	}

}// fine classe

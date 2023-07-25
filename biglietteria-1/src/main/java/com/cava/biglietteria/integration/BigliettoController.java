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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cava.biglietteria.entities.Biglietto;
import com.cava.biglietteria.entities.Cliente;
import com.cava.biglietteria.entities.Replica;
import com.cava.biglietteria.entities.Spettacolo;
import com.cava.biglietteria.entities.Teatro;
import com.cava.biglietteria.services.BigliettoService;
import com.cava.biglietteria.services.ReplicaService;
import com.cava.biglietteria.services.TeatroService;

@RestController
@RequestMapping("biglietti")
public class BigliettoController {

	@Autowired
	private BigliettoService bigliettoService;

	@CrossOrigin(origins = "*")
	@GetMapping(value = "tutti")
	public List<Biglietto> getBiglietto() {
		return bigliettoService.findAll();
	}

	@CrossOrigin(origins = "*")
	@PostMapping
	@ResponseBody
	public Biglietto createBiglietto(@RequestBody Biglietto biglietto) {
		return bigliettoService.save(biglietto);
	}

	@CrossOrigin(origins = "*")
	@PutMapping("/{id}")
	public Biglietto updateBiglietto(@PathVariable int id, @RequestBody Biglietto updateBiglietto) {
		return bigliettoService.update(id, updateBiglietto);
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping("/{id}")
	public void deleteReplica(@PathVariable int id) {
		bigliettoService.delete(id);
	}

}// fine classe

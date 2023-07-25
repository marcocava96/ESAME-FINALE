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

import com.cava.biglietteria.entities.Spettacolo;
import com.cava.biglietteria.entities.Teatro;
import com.cava.biglietteria.services.SpettacoloService;
import com.cava.biglietteria.services.TeatroService;

@RestController
@RequestMapping("spettacoli")
public class SpettacoloController {

	@Autowired
	private SpettacoloService spettacoloService;

	@CrossOrigin(origins = "*")
	@GetMapping(value = "tutti")
	public List<Spettacolo> getSpettacoli() {
		return spettacoloService.findAll();
	}

	@CrossOrigin(origins = "*")
	@PostMapping
	public Spettacolo createSpettacolo(@RequestBody Spettacolo spettacolo) {
		return spettacoloService.save(spettacolo);
	}

	@CrossOrigin(origins = "*")
	@PutMapping("/{id}")
	public Spettacolo updateSpettacolo(@PathVariable int id, @RequestBody Spettacolo updatedSpettacolo) {
		return spettacoloService.update(id, updatedSpettacolo);
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping("/{id}")
	public void deleteSpettacolo(@PathVariable int id) {
		spettacoloService.delete(id);
	}

}// fine classe

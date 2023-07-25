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

import com.cava.biglietteria.entities.Teatro;
import com.cava.biglietteria.services.TeatroService;

@RestController
@RequestMapping("teatri")
public class TeatroController {

	@Autowired
	private TeatroService teatroServices;

	
	@CrossOrigin(origins = "*")
	@GetMapping(value = "tutti")
	public List<Teatro> getTeatri() {
		return teatroServices.findAll();
	}

	@CrossOrigin(origins = "*")
	@PostMapping
	public Teatro createTeatro(@RequestBody Teatro teatro) {
		return teatroServices.save(teatro);
	}

	@CrossOrigin(origins = "*")
	@PutMapping("/{id}")
	public Teatro updateTeatro(@PathVariable int id, @RequestBody Teatro updatedTeatro) {
		return teatroServices.update(id, updatedTeatro);
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping("/{id}")
	public void deleteTeatro(@PathVariable int id) {
		teatroServices.delete(id);
	}

}// fine classe

package org.generation.pharmacya.controller;

import java.util.List;

import org.generation.pharmacya.model.Categoria;
import org.generation.pharmacya.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {
	
	
	@Autowired
	private CategoriaRepository categoriaRepository;	
	
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll(){
		return ResponseEntity.ok(categoriaRepository.findAll());
	}
	@GetMapping("/marca/{marca}")
	public ResponseEntity<List<Categoria>> GetByMarca(@PathVariable String marca){
		return ResponseEntity.ok(categoriaRepository.findAllByMedicamentosContainingIgnoreCase(marca));
	}
	@PostMapping
	public ResponseEntity<Categoria> adicionar(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
	}
}

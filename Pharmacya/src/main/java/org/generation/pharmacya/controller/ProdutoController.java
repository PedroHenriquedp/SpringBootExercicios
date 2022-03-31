package org.generation.pharmacya.controller;

import java.util.List;

import org.generation.pharmacya.model.Produtos;
import org.generation.pharmacya.repository.ProdutoRepository;
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
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {

	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity<List<Produtos>> GetAll(){
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	@GetMapping("preco/{preco}")
	public ResponseEntity<List<Produtos>> GetByPreco(@PathVariable Double preco){
		return ResponseEntity.ok(produtoRepository.findAllByPreco(preco));
	}
	
	@PostMapping
	public ResponseEntity<Produtos> adicionar(@RequestBody Produtos produto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
	}
	

	
	
}

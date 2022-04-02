package org.generation.HikariGames.Controller;

import java.util.List;

import javax.validation.Valid;

import org.generation.HikariGames.model.Categoria;
import org.generation.HikariGames.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll(){
		return ResponseEntity.ok(categoriaRepository.findAll());
		
	}
	@GetMapping("/genero/{genero}")
	public ResponseEntity<List<Categoria>> GetByGenero(@PathVariable String genero){
		return ResponseEntity.ok(categoriaRepository.findByGeneroContainingIgnoreCase(genero));
		
	}
	@GetMapping("/promocao/{promocao}")
	public ResponseEntity<List<Categoria>> GetByPromocao(@PathVariable String promocao){
		return ResponseEntity.ok(categoriaRepository.findByPromocaoContainingIgnoreCase(promocao));
		
	}
	@GetMapping("/lancamento/{lancamento}")
	public ResponseEntity<List<Categoria>> GetByLancamento(@PathVariable String lancamento){
		return ResponseEntity.ok(categoriaRepository.findByLancamentoContainingIgnoreCase(lancamento));
		
	}
	@GetMapping("/maisVendindo/{maisVendido}")
	public ResponseEntity<List<Categoria>> GetByMaisVendido(@PathVariable String maisVendido){
		return ResponseEntity.ok(categoriaRepository.findByMaisVendidoContainingIgnoreCase(maisVendido));
		
	}

	@GetMapping("/jogoCasual/{jogoCasual}")
	public ResponseEntity<List<Categoria>> GetByJogoCasual(@PathVariable String jogoCasual){
		return ResponseEntity.ok(categoriaRepository.findByJogoCasualContainingIgnoreCase(jogoCasual));
		
	}
	//--------------------------MÉTODOS POST------------------------
	@PostMapping
	public ResponseEntity<Categoria> adicionar(@Valid @RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
	}
	//--------------------------MÉTODOS PUT--------------------------
	@PutMapping
	public ResponseEntity<Categoria> mudar(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
	}
	//--------------------------MÉTODOS DELETE-----------------------
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		categoriaRepository.deleteById(id);
	}
}

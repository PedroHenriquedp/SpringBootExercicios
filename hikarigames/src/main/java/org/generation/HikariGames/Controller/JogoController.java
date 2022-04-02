package org.generation.HikariGames.Controller;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.generation.HikariGames.model.Jogo;
import org.generation.HikariGames.repository.JogoRepository;
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
@RequestMapping("/jogos")
@CrossOrigin("*")
public class JogoController {

	
	@Autowired
	private JogoRepository jogoRepository;
	
	//----------------------------MÉTODOS GET---------------------
	@GetMapping
	public ResponseEntity<List<Jogo>> GetAll(){
		return ResponseEntity.ok(jogoRepository.findAll());
	}
	@GetMapping ("preco/{preco}")
	public ResponseEntity<List<Jogo>> GetByPreco(@PathVariable Double preco){
		return ResponseEntity.ok(jogoRepository.findByPreco(preco));
	}
	@GetMapping("/faixaEtaria/{faixaEtaria}")
	public ResponseEntity<List<Jogo>> GetByFaixaEtaria(@PathVariable String faixaEtaria){
		return ResponseEntity.ok(jogoRepository.findByFaixaEtariaContainingIgnoreCase(faixaEtaria));
	}
	@GetMapping("/multiplayer/{multiplayer}")
	public ResponseEntity<List<Jogo>> GetByMultiplayer(@PathVariable Boolean multiplayer){
		return ResponseEntity.ok(jogoRepository.findByMultiplayer(multiplayer));
	}
	
	@GetMapping("/jogoDigital/{jogoDigital}")
	public ResponseEntity<List<Jogo>> GetByJogoDigital(@PathVariable Boolean jogoDigital){
		return ResponseEntity.ok(jogoRepository.findByJogoDigital(jogoDigital));
	}
	
	@GetMapping("/crossplayer/{crossplayer}")
	public ResponseEntity<List<Jogo>> GetByCrossplayer(@PathVariable Boolean crossplayer){
		return ResponseEntity.ok(jogoRepository.findByCrossplayer(crossplayer));
	}
	@GetMapping("/preco_inicial/{inicio}/preco_final/{fim}")
    public ResponseEntity<List<Jogo>> getByPrecoBetween(@PathVariable BigDecimal inicio, @PathVariable BigDecimal fim){
        return ResponseEntity.ok(jogoRepository.findByPrecoBetween(inicio, fim));
	}    
    @GetMapping("/precoMaior/{x}")
    public ResponseEntity<List<Jogo>> getByPrecoMaior(@PathVariable BigDecimal x){
        return ResponseEntity.ok(jogoRepository.findByPrecoMaior(x));
    }
    
	//--------------------------MÉTODOS POST------------------------
	@PostMapping
	public ResponseEntity<Jogo> adicionar(@Valid @RequestBody Jogo jogo){
		return ResponseEntity.status(HttpStatus.CREATED).body(jogoRepository.save(jogo));
	}
	//--------------------------MÉTODOS PUT--------------------------
	@PutMapping
	public ResponseEntity<Jogo> trocar(@RequestBody Jogo jogo){
		return ResponseEntity.status(HttpStatus.CREATED).body(jogoRepository.save(jogo));
	}
	//--------------------------MÉTODOS DELETE-----------------------
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		jogoRepository.deleteById(id);
	}
	
}

